package com.yoclabo.example;

import java.util.List;

abstract public class BaseHexaDecimal implements IHexaDecimal {

    protected ValueType myType;

    @Override
    public void SetType(ValueType arg) {
        myType = arg;
    }

    @Override
    public ValueType GetType() {
        return myType;
    }

    protected int mySize;

    @Override
    public void SetSize(int arg) {
        mySize = arg;
    }

    @Override
    public int GetSize() {
        return mySize;
    }

    protected List<HexaByte> hexaValue;

    @Override
    public void SetHexa(List<HexaByte> arg) {
        hexaValue = arg;
    }

    @Override
    public List<HexaByte> GetHexa() {
        return hexaValue;
    }

    protected String ListConcat() {
        StringBuilder retVal = new StringBuilder();
        hexaValue.forEach(b -> retVal.append(b.GetHexa()));
        return retVal.toString();
    }

    protected String ListConcatBCD() {
        StringBuilder retVal = new StringBuilder();
        hexaValue.forEach(b -> retVal.append(b.GetHexa()));
        return retVal.toString();
    }

    protected String ListConcatDateBCD() {
        StringBuilder retVal = new StringBuilder();
        for (int i = hexaValue.size() - 4; i < hexaValue.size(); i++) {
            retVal.append(hexaValue.get(i).GetHexa());
        }
        return retVal.toString();
    }

    protected String ListConcatLongDateBCD() {
        StringBuilder retVal = new StringBuilder();
        for (int i = hexaValue.size() - 7; i < hexaValue.size(); i++) {
            retVal.append(hexaValue.get(i).GetHexa());
        }
        return retVal.toString();
    }

    protected String ListConcatUTF8() {
        StringBuilder retVal = new StringBuilder();
        hexaValue.forEach(b -> retVal.append(b.GetHexa()));
        return retVal.toString();
    }

    protected String PadPrefix(String value) {
        if (value.length() % 2 != 0) {
            value = "0" + value;
        }
        int iLoopCount = mySize - value.length() / 2;
        for (int i = 0; i < iLoopCount; i++) {
            value = "00" + value;
        }
        return value;
    }

}
