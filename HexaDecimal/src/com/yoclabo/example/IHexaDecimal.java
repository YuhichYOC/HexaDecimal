package com.yoclabo.example;

public interface IHexaDecimal {

    public ValueType GetType();

    public void SetSize(int arg);

    public int GetSize();

    public void SetValue(Object arg);

    public Object GetValue();

    public void SetHexa(Uint8[] arg);

    public Uint8[] GetHexa();

    public void ValueToHexa();

    public void HexaToValue();

}
