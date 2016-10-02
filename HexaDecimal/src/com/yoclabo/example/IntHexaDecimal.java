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

        int mod = 0;
        int parseValue = myValue;
        while (parseValue != 0) {
            mod = parseValue % 256;
            hexaValue.add(new HexaByte(mod));

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

        int iLoopCount = hexaValue.size();
        for (int i = iLoopCount; i > 0; i--) {
            int radix = 1;
            int jLoopCount = hexaValue.size() - i;
            for (int j = 0; j < jLoopCount; j++) {
                radix *= 256;
            }
            myValue += hexaValue.get(i - 1).GetValue().GetValue() * radix;
        }
    }

}
