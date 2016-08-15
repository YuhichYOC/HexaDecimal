package com.yoclabo.example;

public class HexaByte {

    private byte myValue;

    public void SetValue(byte value) {
        myValue = value;
        CastValueToRawStr();
    }

    public byte GetValue() {
        return myValue;
    }

    private String hexaValue;

    public void SetHexa(String value) {
        myValue = (byte) Integer.parseInt(value, 16);
        CastValueToRawStr();
    }

    public String GetHexa() {
        return hexaValue;
    }

    public HexaByte(byte value) {
        myValue = value;
        CastValueToRawStr();
    }

    public HexaByte(String value) {
        myValue = (byte) Integer.parseInt(value, 16);
        CastValueToRawStr();
    }

    public HexaByte(int ivalue) {
        byte value = (byte) ivalue;
        myValue = value;
        CastValueToRawStr();
    }

    public static HexaByte Value(byte value) {
        return new HexaByte(value);
    }

    public static HexaByte Value(String value) {
        return new HexaByte(value);
    }

    public static HexaByte Value(int ivalue) {
        return new HexaByte(ivalue);
    }

    public int toInt() {
        if (myValue >= 0) {
            return (int) myValue;
        } else {
            return (int) (myValue & 0xff);
        }
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
        if (myValue == otherValue.GetValue()) {
            return true;
        } else {
            return false;
        }
    }

    private void CastValueToRawStr() {
        hexaValue = Integer.toHexString(myValue & 0xff);
        if (hexaValue.length() <= 1) {
            hexaValue = "0" + hexaValue;
        }
    }

}
