package com.yoclabo.example;

public class LongBCDHexaDecimal extends BaseHexaDecimal {

    private Long myValue;

    @Override
    public void SetValue(Object arg) {
        myValue = (Long) arg;
    }

    @Override
    public Object GetValue() {
        return myValue;
    }

    @Override
    public void ValueToHexa() {
        String valueHex = myValue.toString();
        valueHex = PadPrefix(valueHex);
        for (int i = 0; i < valueHex.length() / 2; i++) {
            String oneChar = valueHex.substring(i * 2, i * 2 + 2);
            hexaValue.add((byte) Integer.parseInt(oneChar, 16));
        }
    }

    @Override
    public void HexaToValue() {
        myValue = Long.parseLong(ListConcat(), 16);
    }

}
