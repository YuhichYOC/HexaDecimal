package com.yoclabo.example;

public class BCDHexaDecimal extends BaseHexaDecimal {

    public BCDHexaDecimal(int size) {
        super.mySize = size;
    }

    @Override
    public ValueType GetType() {
        return ValueType.BCD;
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
        String value = myValue.toString();
        if (value.length() % 2 != 0) {
            value = "0" + value;
        }
        while (value.length() < mySize * 2) {
            value = "00" + value;
        }
        hexaValue = new Uint8[mySize];
        for (int i = 0; i < mySize; i++) {
            Uint8 item = super.GetChar(value.substring(i * 2, i * 2 + 2));
            hexaValue[i] = item;
        }
    }

    @Override
    public void HexaToValue() {
        String value = "";
        for (int i = 0; i < mySize; i++) {
            value += super.GetRawStr(hexaValue[i]);
        }
        myValue = Integer.parseInt(value);
    }

}
