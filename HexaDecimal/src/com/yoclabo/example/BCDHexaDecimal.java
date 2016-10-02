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
        String parseValue = myValue.toString();
        parseValue = PadPrefix(parseValue);
        for (int i = 0; i < parseValue.length() / 2; i++) {
            hexaValue.add(new HexaByte(parseValue.substring(i * 2, i * 2 + 2)));
        }
    }

    @Override
    public void HexaToValue() {
        myValue = Integer.parseInt(ListConcatBCD());
    }

}
