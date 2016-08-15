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
        StringBuilder binHex = new StringBuilder();
        hexaValue.forEach(b -> binHex.append(b.GetHexa()));
        return binHex.toString();
    }

    protected String ListConcatDateBCD() {
        int prefixSize = mySize;
        prefixSize -= 4;
        if (prefixSize > 0) {
            for (int i = prefixSize; i >= 0; i--) {
                if (hexaValue.get(i).equals(0)) {
                    hexaValue.remove(i);
                }
            }
        }
        return ListConcat();
    }

    protected String ListConcatLongDateBCD() {
        int prefixSize = mySize;
        prefixSize -= 7;
        if (prefixSize > 0) {
            for (int i = prefixSize; i >= 0; i--) {
                if (hexaValue.get(i).equals(0)) {
                    hexaValue.remove(i);
                }
            }
        }
        return ListConcat();
    }

    protected String ListConcatUTF8() {
        StringBuilder binHex = new StringBuilder();
        hexaValue.forEach(b -> binHex.append(b.GetHexa()));
        return binHex.toString();
    }

    protected String PadPrefix(String value) {
        if (value.length() % 2 != 0) {
            value = "0" + value;
        }
        if (value.length() < mySize * 2) {
            StringBuilder prefix = new StringBuilder();
            for (int i = 0; i < mySize * 2; i++) {
                prefix.append("0");
            }
            value = prefix.toString() + value;
        }
        return value.substring(value.length() - (mySize * 2), value.length());
    }

}
