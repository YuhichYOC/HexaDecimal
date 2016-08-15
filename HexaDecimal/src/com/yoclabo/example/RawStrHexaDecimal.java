package com.yoclabo.example;

import java.util.ArrayList;

public class RawStrHexaDecimal extends BaseHexaDecimal {

    public RawStrHexaDecimal(int size) {
        super.myType = ValueType.RAW_STR;
        super.mySize = size;
        super.hexaValue = new ArrayList<HexaByte>();
    }

    private String myValue;

    @Override
    public void SetValue(Object arg) {
        myValue = (String) arg;
    }

    @Override
    public Object GetValue() {
        return myValue;
    }

    @Override
    public void ValueToHexa() {
        if (myValue.startsWith("0x")) {
            myValue = myValue.substring(2, myValue.length());
        }
        for (int i = 0; i < myValue.length(); i++) {
            String oneChar = myValue.substring(i * 2, i * 2 + 2);
            hexaValue.add(new HexaByte(oneChar));
        }
    }

    @Override
    public void HexaToValue() {
        myValue = "0x" + ListConcat();
    }

}
