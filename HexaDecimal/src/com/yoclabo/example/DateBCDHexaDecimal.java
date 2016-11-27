package com.yoclabo.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBCDHexaDecimal extends BaseHexaDecimal {

    public DateBCDHexaDecimal(int size) {
        if (size < 4) {
            throw new IllegalArgumentException("DateBCDHexaDecimal requires length more than 4.");
        }
        super.mySize = size;
    }

    @Override
    public ValueType GetType() {
        return ValueType.BCD_DATE;
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
        String value = f.format(myValue);
        if (value.length() % 2 != 0) {
            value = "0" + value;
        }
        while (value.length() < mySize * 2) {
            value = "00" + value;
        }
        hexaValue = new Uint8[mySize];
        for (int i = 0; i < mySize; i++) {
            Uint8 item = super.GetChar(value.substring(i * 2, i * 2 + 2));
            hexaValue[i] = item;
        }
    }

    @Override
    public void HexaToValue() {
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
        String value = "";
        for (int i = mySize - 4; i < mySize; i++) {
            value += super.GetRawStr(hexaValue[i]);
        }
        try {
            myValue = f.parse(value);
        } catch (ParseException ex) {
            myValue = new Date();
        }
    }

}
