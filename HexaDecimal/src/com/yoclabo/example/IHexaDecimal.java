package com.yoclabo.example;

import java.util.ArrayList;

public interface IHexaDecimal {
    public void SetType(ValueType arg);

    public ValueType GetType();

    public void SetSize(int arg);

    public int GetSize();

    public Object GetValue();

    public void ValueToHexa();

    public ArrayList<Byte> GetHexa();
}
