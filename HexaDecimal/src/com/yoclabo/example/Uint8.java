package com.yoclabo.example;

public class Uint8 {

    private byte myValue;

    private byte toByte(short arg) {
        return (byte) (arg - 128);
    }

    private byte toByte(int arg) {
        return (byte) (arg - 128);
    }

    public void SetValue(byte arg) {
        myValue = arg;
    }

    public void SetValue(short arg) throws IllegalArgumentException {
        if (0 > arg || arg > 256) {
            throw new IllegalArgumentException("Uint8 accepts value between 0 to 255.");
        }
        myValue = toByte(arg);
    }

    public void SetValue(int arg) throws IllegalArgumentException {
        if (0 > arg || arg > 256) {
            throw new IllegalArgumentException("Uint8 accepts value between 0 to 255.");
        }
        myValue = toByte(arg);
    }

    private int toInt() {
        return myValue + 128;
    }

    public int GetValue() {
        return toInt();
    }

    public Uint8(byte arg) {
        myValue = arg;
    }

    public Uint8(short arg) {
        if (0 > arg || arg > 256) {
            throw new IllegalArgumentException("Uint8 accepts value between 0 to 255.");
        }
        myValue = toByte(arg);
    }

    public Uint8(int arg) {
        if (0 > arg || arg > 256) {
            throw new IllegalArgumentException("Uint8 accepts value between 0 to 255.");
        }
        myValue = toByte(arg);
    }

    public static Uint8 Value(byte arg) {
        return new Uint8(arg);
    }

    public static Uint8 Value(short arg) {
        return new Uint8(arg);
    }

    public static Uint8 Value(int arg) {
        return new Uint8(arg);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Uint8) {
            Uint8 otherValue = (Uint8) other;
            if (GetValue() == otherValue.GetValue()) {
                return true;
            }
        } else if (other instanceof Integer) {
            int otherValue = (int) other;
            if (GetValue() + 128 == otherValue) {
                return true;
            }
        }
        return false;
    }

}
