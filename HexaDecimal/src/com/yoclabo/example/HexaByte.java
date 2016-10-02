package com.yoclabo.example;

public class HexaByte {

    private Uint8 myValue;

    public void SetValue(Uint8 value) {
        myValue = value;
        FillHexaValue();
    }

    public void SetValue(byte arg) {
        myValue = Uint8.Value(arg);
        FillHexaValue();
    }

    public void SetValue(short arg) {
        myValue = Uint8.Value(arg);
        FillHexaValue();
    }

    public void SetValue(int arg) {
        myValue = Uint8.Value(arg);
        FillHexaValue();
    }

    public Uint8 GetValue() {
        return myValue;
    }

    private static char replaceArray[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
            'F' };

    byte FindPositionInReplaceArray(char arg) {
        byte retVal = 0;
        for (byte i = 0; i < 16; i++) {
            if (replaceArray[i] == arg) {
                retVal = i;
            }
        }
        return retVal;
    }

    private byte hexaValue[];

    public void SetHexa(String value) throws IllegalArgumentException {
        if (value.length() < 2 || value.length() > 2) {
            throw new IllegalArgumentException("HexaByte hexavalue with length() == 2 String.");
        }
        hexaValue = new byte[2];
        hexaValue[0] = FindPositionInReplaceArray(value.charAt(0));
        hexaValue[1] = FindPositionInReplaceArray(value.charAt(1));
        myValue = Uint8.Value(hexaValue[0] * 16 + hexaValue[1]);
    }

    public String GetHexa() {
        return String.valueOf(replaceArray[hexaValue[0]]) + String.valueOf(replaceArray[hexaValue[1]]);
    }

    private void FillHexaValue() {
        hexaValue = new byte[2];
        hexaValue[0] = (byte) (myValue.GetValue() / 16);
        hexaValue[1] = (byte) (myValue.GetValue() % 16);
    }

    public HexaByte(byte value) {
        myValue = Uint8.Value(value);
        FillHexaValue();
    }

    public HexaByte(short svalue) {
        myValue = Uint8.Value(svalue);
        FillHexaValue();
    }

    public HexaByte(int ivalue) {
        myValue = Uint8.Value(ivalue);
        FillHexaValue();
    }

    public HexaByte(String value) {
        SetHexa(value);
    }

    public static HexaByte Value(byte value) {
        return new HexaByte(value);
    }

    public static HexaByte Value(short svalue) {
        return new HexaByte(svalue);
    }

    public static HexaByte Value(int ivalue) {
        return new HexaByte(ivalue);
    }

    public static HexaByte Value(String value) {
        return new HexaByte(value);
    }

    public int toInt() {
        return myValue.GetValue();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HexaByte)) {
            return false;
        }
        HexaByte otherValue = (HexaByte) other;
        if (myValue.equals(otherValue.GetValue())) {
            return true;
        } else {
            return false;
        }
    }

}
