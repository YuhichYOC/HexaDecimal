package com.yoclabo.example;

import java.util.ArrayList;
import java.util.Collections;

public class IntHexaDecimal extends BaseHexaDecimal {

    public IntHexaDecimal(int size) {
        super.myType = ValueType.NUM_INT;
        super.mySize = size;
        super.hexaValue = new ArrayList<HexaByte>();
    }

    private Integer myValue;

    @Override
    public void SetValue(Object arg) {
        myValue = (Integer) arg;
    }

    @Override
    public Object GetValue() {
        return myValue;
    }

    @Override
    public void ValueToHexa() {
        hexaValue.clear();

        int parseValue = myValue;
        while (parseValue != 0) {
            hexaValue.add(new HexaByte(parseValue % 256));
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
