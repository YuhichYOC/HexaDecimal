package com.yoclabo.example;

import java.util.Arrays;

public class BinHexaDecimal extends BaseHexaDecimal {

    private Byte[] myValue;

    @Override
    public void SetValue(Object arg) {
        myValue = (Byte[]) arg;
    }

    @Override
    public Object GetValue() {
        return myValue;
    }

    @Override
    public void ValueToHexa() {
        super.hexaValue = Arrays.asList(myValue);
    }

    @Override
    public void HexaToValue() {
        myValue = super.hexaValue.toArray(myValue);
    }
}
