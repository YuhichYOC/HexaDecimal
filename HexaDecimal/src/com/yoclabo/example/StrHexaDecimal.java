package com.yoclabo.example;

public class StrHexaDecimal extends BaseHexaDecimal {

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
        for (int i = 0; i < myValue.length(); i++) {
            String oneChar = myValue.substring(i * 2, i * 2 + 2);
            hexaValue.add((byte) Integer.parseInt(oneChar, 16));
        }
    }

    @Override
    public void HexaToValue() {
        myValue = ListConcat();
    }

}
