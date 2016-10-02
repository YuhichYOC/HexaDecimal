package com.yoclabo.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DateBCDHexaDecimal extends BaseHexaDecimal {

    public DateBCDHexaDecimal(int size) {
        super.myType = ValueType.BCD_DATE;
        super.mySize = size;
        super.hexaValue = new ArrayList<HexaByte>();
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
        String parseValue = f.format(myValue);
        parseValue = PadPrefix(parseValue);
        for (int i = 0; i < parseValue.length() / 2; i++) {
            hexaValue.add(new HexaByte(parseValue.substring(i * 2, i * 2 + 2)));
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
