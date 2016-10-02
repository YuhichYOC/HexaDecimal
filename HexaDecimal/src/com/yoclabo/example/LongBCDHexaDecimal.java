package com.yoclabo.example;

import java.util.ArrayList;

public class LongBCDHexaDecimal extends BaseHexaDecimal {

    public LongBCDHexaDecimal(int size) {
        super.myType = ValueType.BCD_LONG;
        super.mySize = size;
        super.hexaValue = new ArrayList<HexaByte>();
    }

    private Long myValue;

    @Override
    public void SetValue(Object arg) {
        myValue = (Long) arg;
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
        myValue = Long.parseLong(ListConcatBCD());
    }

}
