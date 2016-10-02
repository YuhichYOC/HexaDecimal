package com.yoclabo.example;

import java.util.ArrayList;
import java.util.Collections;

public class LongHexaDecimal extends BaseHexaDecimal {

    public LongHexaDecimal(int size) {
        super.myType = ValueType.NUM_LONG;
        super.mySize = size;
        super.hexaValue = new ArrayList<HexaByte>();
    }

    private long myValue;

    @Override
    public void SetValue(Object arg) {
        myValue = (long) arg;
    }

    @Override
    public Object GetValue() {
        return myValue;
    }

    @Override
    public void ValueToHexa() {
        hexaValue.clear();

        long parseValue = myValue;
        while (parseValue != 0) {
            hexaValue.add(new HexaByte((int) parseValue % 256));
            parseValue = parseValue / 256;
        }

        int iLoopCount = mySize - hexaValue.size();
        for (int i = 0; i < iLoopCount; i++) {
            hexaValue.add(new HexaByte(0));
        }
        Collections.reverse(hexaValue);
    }

    @Override
    public void HexaToValue() {
        myValue = 0;

        for (int i = hexaValue.size(); i > 0; i--) {
            int radix = 1;
            for (int j = 0; j < hexaValue.size() - i; j++) {
                radix *= 256;
            }
            myValue += hexaValue.get(i - 1).GetValue().GetValue() * radix;
        }
    }

}
