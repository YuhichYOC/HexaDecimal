package com.yoclabo.example;

public class IntHexaDecimal extends BaseHexaDecimal {

    public IntHexaDecimal(int size) {
        super.mySize = size;
    }

    @Override
    public ValueType GetType() {
        return ValueType.NUM_INT;
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
        Uint8[] reverse = new Uint8[mySize];
        int value = myValue;
        int i = 0;
        do {
            int mod = value % 256;
            reverse[i] = Uint8.Value(mod);
            value /= 256;
            i++;
        } while (value != 0);
        if (i < mySize) {
            for (int j = i; j < mySize; j++) {
                reverse[j] = Uint8.Value(0);
            }
        }
        hexaValue = new Uint8[mySize];
        for (int k = 0; k < mySize; k++) {
            hexaValue[k] = reverse[(mySize - 1) - k];
        }
    }

    @Override
    public void HexaToValue() {
        myValue = 0;
        for (int i = mySize; i > 0; i--) {
            int radix = 1;
            for (int j = 0; j < mySize - i; j++) {
                radix *= 256;
            }
            myValue += hexaValue[i - 1].GetValue() * radix;
        }
    }

}
