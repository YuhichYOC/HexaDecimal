package com.yoclabo.example;

abstract public class BaseHexaDecimal implements IHexaDecimal {

    protected int mySize;

    @Override
    public void SetSize(int arg) {
        mySize = arg;
    }

    @Override
    public int GetSize() {
        return mySize;
    }

    protected Uint8[] hexaValue;

    @Override
    public void SetHexa(Uint8[] arg) {
        hexaValue = arg;
    }

    @Override
    public Uint8[] GetHexa() {
        return hexaValue;
    }

    public String GetRawStr(Uint8 arg) {
        int upperValue = arg.GetValue() / 16;
        int lowerValue = arg.GetValue() % 16;
        char replaceArray[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        char ret[] = { replaceArray[upperValue], replaceArray[lowerValue] };
        return String.valueOf(ret);
    }

    public Uint8 GetChar(String arg) {
        if (arg.length() != 2) {
            throw new IllegalArgumentException("Argument length is bad.");
        }
        char replaceArray[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        byte upperValue = 0;
        for (byte i = 0; i < 16; i++) {
            if (arg.charAt(0) == replaceArray[i]) {
                upperValue = i;
            }
        }
        byte lowerValue = 0;
        for (byte i = 0; i < 16; i++) {
            if (arg.charAt(1) == replaceArray[i]) {
                lowerValue = i;
            }
        }
        return Uint8.Value(upperValue * 16 + lowerValue);
    }

}
