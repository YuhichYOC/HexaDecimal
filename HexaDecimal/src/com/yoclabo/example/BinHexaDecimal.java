package com.yoclabo.example;

import java.util.ArrayList;
import java.util.Arrays;

public class BinHexaDecimal extends BaseHexaDecimal {

    public BinHexaDecimal(int size) {
        super.myType = ValueType.HEX;
        super.mySize = size;
        super.hexaValue = new ArrayList<HexaByte>();
    }

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
        Arrays.asList(myValue).forEach(b -> super.hexaValue.add(new HexaByte(b)));
    }

    @Override
    public void HexaToValue() {
        myValue = super.hexaValue.toArray(myValue);
    }
}
