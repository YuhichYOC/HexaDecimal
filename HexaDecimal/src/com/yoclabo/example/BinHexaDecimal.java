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

    @Override
    public Object GetValue() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void ValueToHexa() {
        // TODO Auto-generated method stub

    }

    @Override
    public ArrayList<Byte> GetHexa() {
        // TODO Auto-generated method stub
        return null;
    }

}
