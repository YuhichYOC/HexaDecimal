package com.yoclabo.example;

import java.util.ArrayList;

public class BinHexaDecimal implements IHexaDecimal {

    private ValueType myType;

    @Override
    public void SetType(ValueType arg) {
        myType = arg;
    }

    @Override
    public ValueType GetType() {
        return myType;
    }

    private int mySize;

    @Override
    public void SetSize(int arg) {
        mySize = arg;
    }

    @Override
    public int GetSize() {
        return mySize;
    }

    private Byte[] myValue;

    public void SetValue(Byte[] arg) {
        myValue = arg;
    }

    @Override
    public Byte[] GetValue() {
        return myValue;
    }

    private ArrayList<Byte> hexaValue;

    @Override
    public void ValueToHexa() {
        hexaValue = new ArrayList<Byte>();
        int length = myValue.length;
        for (int i = 0; i < length; i++) {
            hexaValue.add(myValue[i]);
        }
    }

    @Override
    public ArrayList<Byte> GetHexa() {
        return hexaValue;
    }

}
