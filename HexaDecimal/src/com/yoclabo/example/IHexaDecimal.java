package com.yoclabo.example;

import java.util.List;

public interface IHexaDecimal {

    public void SetType(ValueType arg);

    public ValueType GetType();

    public void SetSize(int arg);

    public int GetSize();

    public void SetValue(Object arg);

    public Object GetValue();

    public void SetHexa(List<HexaByte> arg);

    public List<HexaByte> GetHexa();

    public void ValueToHexa();

    public void HexaToValue();

}
