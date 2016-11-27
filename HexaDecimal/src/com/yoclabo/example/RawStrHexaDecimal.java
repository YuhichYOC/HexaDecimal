package com.yoclabo.example;

public class RawStrHexaDecimal extends BaseHexaDecimal {

    public RawStrHexaDecimal(int size) {
        super.mySize = size;
    }

    @Override
    public ValueType GetType() {
        return ValueType.RAW_STR;
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
        String value = myValue;
        if (value.substring(0, 2).equalsIgnoreCase("0x")) {
            value = value.substring(2);
        }
        if (value.length() % 2 != 0) {
            value = "0" + value;
        }
        hexaValue = new Uint8[mySize];
        for (int i = 0; i < mySize; i++) {
            hexaValue[i] = super.GetChar(value.substring(i * 2, i * 2 + 2));
        }
    }

    @Override
    public void HexaToValue() {
        myValue = "0x";
        for (int i = 0; i < mySize; i++) {
            myValue += super.GetRawStr(hexaValue[i]);
        }
    }

}
