package com.yoclabo.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DateBCDHexaDecimal extends BaseHexaDecimal {

    public DateBCDHexaDecimal(int size) {
        super.myType = ValueType.BCD_DATE;
        super.mySize = size;
        super.hexaValue = new ArrayList<Byte>();
    }

    private Date myValue;

    @Override
    public void SetValue(Object arg) {
        myValue = (Date) arg;
    }

    @Override
    public Object GetValue() {
        return myValue;
    }

    @Override
    public void ValueToHexa() {
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
        String valueHex = f.format(myValue);
        valueHex = PadPrefix(valueHex);
        for (int i = 0; i < valueHex.length() / 2; i++) {
            String oneChar = valueHex.substring(i * 2, i * 2 + 2);
            hexaValue.add((byte) Integer.parseInt(oneChar, 16));
        }
    }

    @Override
    public void HexaToValue() {
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
        try {
            myValue = f.parse(ListConcatDateBCD());
        } catch (ParseException ex) {
            myValue = new Date();
        }
    }

}
