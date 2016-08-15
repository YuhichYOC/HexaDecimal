package com.yoclabo.example;

import java.util.ArrayList;

public class BCDHexaDecimal extends BaseHexaDecimal {

    public BCDHexaDecimal(int size) {
        super.myType = ValueType.BCD;
        super.mySize = size;
        super.hexaValue = new ArrayList<HexaByte>();
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
        String valueHex = myValue.toString();
        valueHex = PadPrefix(valueHex);
        for (int i = 0; i < valueHex.length() / 2; i++) {
            String oneChar = valueHex.substring(i * 2, i * 2 + 2);
            hexaValue.add(new HexaByte(oneChar));
        }
    }

    @Override
    public void HexaToValue() {
        myValue = Integer.parseInt(ListConcatBCD());
    }

}
