package com.yoclabo.example;

import java.util.ArrayList;

public class IntHexaDecimal extends BaseHexaDecimal {

    public IntHexaDecimal(int size) {
        super.myType = ValueType.NUM_INT;
        super.mySize = size;
        super.hexaValue = new ArrayList<Byte>();
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
        String valueHex = Integer.toString(myValue, 16);
        valueHex = PadPrefix(valueHex);
        for (int i = 0; i < valueHex.length() / 2; i++) {
            String oneChar = valueHex.substring(i * 2, i * 2 + 2);
            hexaValue.add((byte) Integer.parseInt(oneChar, 16));
        }
    }

    @Override
    public void HexaToValue() {
        myValue = Integer.parseInt(ListConcat(), 16);
    }

}
