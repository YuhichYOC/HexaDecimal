package com.yoclabo.example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class HexaDecimalTest {

    @Test
    public void BCDHexaDecimalValueToHexa01() {
        BCDHexaDecimal h = new BCDHexaDecimal(1);
        h.SetValue((Integer) 20);
        h.ValueToHexa();
        HexaByte ex = HexaByte.Value(32);
        Assert.assertEquals(ex.toInt(), h.GetHexa().get(0).toInt());
    }

    @Test
    public void BCDHexaDecimalValueToHexa02() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue((Integer) 1000);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(16);
        HexaByte ex2 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void BCDHexaDecimalValueToHexa03() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue(100);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(1);
        HexaByte ex2 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void BCDHexaDecimalValueToHexa04() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue(100);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(1);
        HexaByte ex2 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void BCDHexaDecimalValueToHexa05() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue((Integer) 20);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(0);
        HexaByte ex2 = HexaByte.Value(32);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void BCDHexaDecimalValueToHexa06() {
        BCDHexaDecimal h = new BCDHexaDecimal(3);
        h.SetValue(1000);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(0);
        HexaByte ex2 = HexaByte.Value(16);
        HexaByte ex3 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3.toInt(), h.GetHexa().get(2).toInt());
    }

    @Test
    public void BCDHexaDecimalValueToHexa07() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue((Integer) 100);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(1);
        HexaByte ex2 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void BCDHexaDecimalValueToHexa08() {
        BCDHexaDecimal h = new BCDHexaDecimal(1);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(32))));
        h.HexaToValue();
        int ex = 20;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void BCDHexaDecimalValueToHexa09() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue((Integer) 20);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(0);
        HexaByte ex2 = HexaByte.Value(32);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void BCDHexaDecimalValueToHexa10() {
        BCDHexaDecimal h = new BCDHexaDecimal(3);
        h.SetValue(1000);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(0);
        HexaByte ex2 = HexaByte.Value(16);
        HexaByte ex3 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3.toInt(), h.GetHexa().get(2).toInt());
    }

    @Test
    public void BCDHexaDecimalParseHexa01() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(16), HexaByte.Value(0))));
        h.HexaToValue();
        int ex = 1000;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void BCDHexaDecimalValueToHexa11() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue((Integer) 100);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(1);
        HexaByte ex2 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void BCDHexaDecimalParseHexa02() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(1), HexaByte.Value(0))));
        h.HexaToValue();
        int ex = 100;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void BCDHexaDecimalParseHexa03() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(0), HexaByte.Value(32))));
        h.HexaToValue();
        int ex = 20;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void BCDHexaDecimalParseHexa04() {
        BCDHexaDecimal h = new BCDHexaDecimal(3);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(0), HexaByte.Value(16), HexaByte.Value(0))));
        h.HexaToValue();
        int ex = 1000;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void BCDHexaDecimalParseHexa05() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(1), HexaByte.Value(0))));
        h.HexaToValue();
        int ex = 100;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void DateBCDHexaDecimalValueToHexa01() throws Exception {
        DateBCDHexaDecimal h = new DateBCDHexaDecimal(5);
        h.SetValue(new SimpleDateFormat("yyyyMMdd").parse("20160623"));
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(0);
        HexaByte ex2 = HexaByte.Value(32);
        HexaByte ex3 = HexaByte.Value(22);
        HexaByte ex4 = HexaByte.Value(6);
        HexaByte ex5 = HexaByte.Value(35);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3.toInt(), h.GetHexa().get(2).toInt());
        Assert.assertEquals(ex4.toInt(), h.GetHexa().get(3).toInt());
        Assert.assertEquals(ex5.toInt(), h.GetHexa().get(4).toInt());
    }

    @Test
    public void DateBCDHexaDecimalParseHexa01() throws Exception {
        DateBCDHexaDecimal h = new DateBCDHexaDecimal(5);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(0), HexaByte.Value(32), HexaByte.Value(22),
                HexaByte.Value(6), HexaByte.Value(35))));
        h.HexaToValue();
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
        Assert.assertEquals(f.parse("20160623"), h.GetValue());
    }

    @Test
    public void IntHexaDecimalValueToHexa01() {
        IntHexaDecimal h = new IntHexaDecimal(2);
        h.SetValue(1000);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(3);
        HexaByte ex2 = HexaByte.Value(232);
        int ex1i = 3;
        int ex2i = 232;
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex1i, h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2i, h.GetHexa().get(1).toInt());
    }

    @Test
    public void IntHexaDecimalValueToHexa02() {
        IntHexaDecimal h = new IntHexaDecimal(1);
        h.SetValue((Integer) 100);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(100);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
    }

    @Test
    public void IntHexaDecimalValueToHexa03() {
        IntHexaDecimal h = new IntHexaDecimal(2);
        h.SetValue((Integer) 256);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(1);
        HexaByte ex2 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void IntHexaDecimalValueToHexa04() {
        IntHexaDecimal h = new IntHexaDecimal(3);
        h.SetValue((Integer) 1000);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(0);
        HexaByte ex2 = HexaByte.Value(3);
        HexaByte ex3 = HexaByte.Value(232);
        int ex1i = 0;
        int ex2i = 3;
        int ex3i = 232;
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3.toInt(), h.GetHexa().get(2).toInt());
        Assert.assertEquals(ex1i, h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2i, h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3i, h.GetHexa().get(2).toInt());
    }

    @Test
    public void IntHexaDecimalValueToHexa05() {
        IntHexaDecimal h = new IntHexaDecimal(1);
        h.SetValue((Integer) 100);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(100);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
    }

    @Test
    public void IntHexaDecimalParseHexa01() {
        IntHexaDecimal h = new IntHexaDecimal(2);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(3), HexaByte.Value(232))));
        h.HexaToValue();
        int ex = 1000;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void IntHexaDecimalValueToHexa06() {
        IntHexaDecimal h = new IntHexaDecimal(3);
        h.SetValue((Integer) 256);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(0);
        HexaByte ex2 = HexaByte.Value(1);
        HexaByte ex3 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3.toInt(), h.GetHexa().get(2).toInt());
    }

    @Test
    public void IntHexaDecimalParseHexa02() {
        IntHexaDecimal h = new IntHexaDecimal(1);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(100))));
        h.HexaToValue();
        int ex = 100;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void IntHexaDecimalParseHexa03() {
        IntHexaDecimal h = new IntHexaDecimal(2);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(1), HexaByte.Value(0))));
        h.HexaToValue();
        int ex = 256;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void IntHexaDecimalParseHexa04() {
        IntHexaDecimal h = new IntHexaDecimal(3);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(0), HexaByte.Value(3), HexaByte.Value(232))));
        h.HexaToValue();
        int ex = 1000;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void IntHexaDecimalParseHexa05() {
        IntHexaDecimal h = new IntHexaDecimal(1);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(100))));
        h.HexaToValue();
        int ex = 100;
        Assert.assertEquals(ex, h.GetValue());
    }

    @Test
    public void IntHexaDecimalParseHexa06() {
        IntHexaDecimal h = new IntHexaDecimal(3);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(0), HexaByte.Value(1), HexaByte.Value(0))));
        h.HexaToValue();
        int ex = 256;
        Assert.assertEquals(ex, h.GetValue());
    }

    @Test
    public void LongBCDHexaDecimalValueToHexa01() {
        LongBCDHexaDecimal h = new LongBCDHexaDecimal(4);
        h.SetValue(new Long(20160623));
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(32);
        HexaByte ex2 = HexaByte.Value(22);
        HexaByte ex3 = HexaByte.Value(6);
        HexaByte ex4 = HexaByte.Value(35);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3.toInt(), h.GetHexa().get(2).toInt());
        Assert.assertEquals(ex4.toInt(), h.GetHexa().get(3).toInt());
    }

    @Test
    public void LongBCDHexaDecimalValueToHexa02() {
        LongBCDHexaDecimal h = new LongBCDHexaDecimal(6);
        h.SetValue(new Long(20160623));
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(0);
        HexaByte ex2 = HexaByte.Value(0);
        HexaByte ex3 = HexaByte.Value(32);
        HexaByte ex4 = HexaByte.Value(22);
        HexaByte ex5 = HexaByte.Value(6);
        HexaByte ex6 = HexaByte.Value(35);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3.toInt(), h.GetHexa().get(2).toInt());
        Assert.assertEquals(ex4.toInt(), h.GetHexa().get(3).toInt());
        Assert.assertEquals(ex5.toInt(), h.GetHexa().get(4).toInt());
        Assert.assertEquals(ex6.toInt(), h.GetHexa().get(5).toInt());
    }

    @Test
    public void LongBCDHexaDecimalParseHexa01() {
        LongBCDHexaDecimal h = new LongBCDHexaDecimal(4);
        h.SetHexa(new ArrayList<HexaByte>(
                Arrays.asList(HexaByte.Value(32), HexaByte.Value(22), HexaByte.Value(6), HexaByte.Value(35))));
        h.HexaToValue();
        long ex = 20160623;
        Assert.assertEquals(ex, (long) h.GetValue());
    }

    @Test
    public void LongBCDHexaDecimalParseHexa02() {
        LongBCDHexaDecimal h = new LongBCDHexaDecimal(6);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(0), HexaByte.Value(0), HexaByte.Value(32),
                HexaByte.Value(22), HexaByte.Value(6), HexaByte.Value(35))));
        h.HexaToValue();
        long ex = 20160623;
        Assert.assertEquals(ex, (long) h.GetValue());
    }

    @Test
    public void LongDateBCDHexaDecimalValueToHexa01() throws Exception {
        LongDateBCDHexaDecimal h = new LongDateBCDHexaDecimal(7);
        h.SetValue(new SimpleDateFormat("yyyyMMddHHmmss").parse("20160623153212"));
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(32);
        HexaByte ex2 = HexaByte.Value(22);
        HexaByte ex3 = HexaByte.Value(6);
        HexaByte ex4 = HexaByte.Value(35);
        HexaByte ex5 = HexaByte.Value(21);
        HexaByte ex6 = HexaByte.Value(50);
        HexaByte ex7 = HexaByte.Value(18);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3.toInt(), h.GetHexa().get(2).toInt());
        Assert.assertEquals(ex4.toInt(), h.GetHexa().get(3).toInt());
        Assert.assertEquals(ex5.toInt(), h.GetHexa().get(4).toInt());
        Assert.assertEquals(ex6.toInt(), h.GetHexa().get(5).toInt());
        Assert.assertEquals(ex7.toInt(), h.GetHexa().get(6).toInt());
    }

    @Test
    public void LongDateBCDHexaDecimalValueToHexa02() throws Exception {
        LongDateBCDHexaDecimal h = new LongDateBCDHexaDecimal(8);
        h.SetValue(new SimpleDateFormat("yyyyMMddHHmmss").parse("20160623153212"));
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(0);
        HexaByte ex2 = HexaByte.Value(32);
        HexaByte ex3 = HexaByte.Value(22);
        HexaByte ex4 = HexaByte.Value(6);
        HexaByte ex5 = HexaByte.Value(35);
        HexaByte ex6 = HexaByte.Value(21);
        HexaByte ex7 = HexaByte.Value(50);
        HexaByte ex8 = HexaByte.Value(18);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3.toInt(), h.GetHexa().get(2).toInt());
        Assert.assertEquals(ex4.toInt(), h.GetHexa().get(3).toInt());
        Assert.assertEquals(ex5.toInt(), h.GetHexa().get(4).toInt());
        Assert.assertEquals(ex6.toInt(), h.GetHexa().get(5).toInt());
        Assert.assertEquals(ex7.toInt(), h.GetHexa().get(6).toInt());
        Assert.assertEquals(ex8.toInt(), h.GetHexa().get(7).toInt());
    }

    @Test
    public void LongDateBCDHexaDecimalParseHexa01() throws Exception {
        LongDateBCDHexaDecimal h = new LongDateBCDHexaDecimal(0);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(32), HexaByte.Value(22), HexaByte.Value(6),
                HexaByte.Value(35), HexaByte.Value(21), HexaByte.Value(50), HexaByte.Value(18))));
        h.HexaToValue();
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMddHHmmss");
        Assert.assertEquals(f.parse("20160623153212"), h.GetValue());
    }

    @Test
    public void LongDateBCDHexaDecimalParseHexa02() throws Exception {
        LongDateBCDHexaDecimal h = new LongDateBCDHexaDecimal(8);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(0), HexaByte.Value(32), HexaByte.Value(22),
                HexaByte.Value(6), HexaByte.Value(35), HexaByte.Value(21), HexaByte.Value(50), HexaByte.Value(18))));
        h.HexaToValue();
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMddHHmmss");
        Assert.assertEquals(f.parse("20160623153212"), h.GetValue());
    }

    @Test
    public void LongHexaDecimalParseHexa01() {
        LongHexaDecimal h = new LongHexaDecimal(4);
        h.SetHexa(new ArrayList<HexaByte>(
                Arrays.asList(HexaByte.Value(1), HexaByte.Value(51), HexaByte.Value(160), HexaByte.Value(111))));
        h.HexaToValue();
        long ex = 20160623;
        Assert.assertEquals(ex, (long) h.GetValue());
    }

    @Test
    public void LongHexaDecimalParseHexa02() {
        LongHexaDecimal h = new LongHexaDecimal(7);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(0), HexaByte.Value(0), HexaByte.Value(0),
                HexaByte.Value(1), HexaByte.Value(51), HexaByte.Value(160), HexaByte.Value(111))));
        h.HexaToValue();
        long ex = 20160623;
        Assert.assertEquals(ex, (long) h.GetValue());
    }

    @Test
    public void LongHexaDecimalValueToHexa01() {
        LongHexaDecimal h = new LongHexaDecimal(4);
        h.SetValue(new Long(20160623));
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(1);
        HexaByte ex2 = HexaByte.Value(51);
        HexaByte ex3 = HexaByte.Value(160);
        HexaByte ex4 = HexaByte.Value(111);
        int ex1i = 1;
        int ex2i = 51;
        int ex3i = 160;
        int ex4i = 111;
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3.toInt(), h.GetHexa().get(2).toInt());
        Assert.assertEquals(ex4.toInt(), h.GetHexa().get(3).toInt());
        Assert.assertEquals(ex1i, h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2i, h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3i, h.GetHexa().get(2).toInt());
        Assert.assertEquals(ex4i, h.GetHexa().get(3).toInt());
    }

    @Test
    public void LongHexaDecimalValueToHexa02() {
        LongHexaDecimal h = new LongHexaDecimal(7);
        h.SetValue(new Long(20160623));
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(0);
        HexaByte ex2 = HexaByte.Value(0);
        HexaByte ex3 = HexaByte.Value(0);
        HexaByte ex4 = HexaByte.Value(1);
        HexaByte ex5 = HexaByte.Value(51);
        HexaByte ex6 = HexaByte.Value(160);
        HexaByte ex7 = HexaByte.Value(111);
        int ex1i = 0;
        int ex2i = 0;
        int ex3i = 0;
        int ex4i = 1;
        int ex5i = 51;
        int ex6i = 160;
        int ex7i = 111;
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3.toInt(), h.GetHexa().get(2).toInt());
        Assert.assertEquals(ex4.toInt(), h.GetHexa().get(3).toInt());
        Assert.assertEquals(ex5.toInt(), h.GetHexa().get(4).toInt());
        Assert.assertEquals(ex6.toInt(), h.GetHexa().get(5).toInt());
        Assert.assertEquals(ex7.toInt(), h.GetHexa().get(6).toInt());
        Assert.assertEquals(ex1i, h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2i, h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3i, h.GetHexa().get(2).toInt());
        Assert.assertEquals(ex4i, h.GetHexa().get(3).toInt());
        Assert.assertEquals(ex5i, h.GetHexa().get(4).toInt());
        Assert.assertEquals(ex6i, h.GetHexa().get(5).toInt());
        Assert.assertEquals(ex7i, h.GetHexa().get(6).toInt());
    }

    @Test
    public void RawStrHexaDecimalValueToHexa01() {
        RawStrHexaDecimal h = new RawStrHexaDecimal(5);
        h.SetValue("0x0102030405");
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(1);
        HexaByte ex2 = HexaByte.Value(2);
        HexaByte ex3 = HexaByte.Value(3);
        HexaByte ex4 = HexaByte.Value(4);
        HexaByte ex5 = HexaByte.Value(5);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
        Assert.assertEquals(ex3.toInt(), h.GetHexa().get(2).toInt());
        Assert.assertEquals(ex4.toInt(), h.GetHexa().get(3).toInt());
        Assert.assertEquals(ex5.toInt(), h.GetHexa().get(4).toInt());
    }

    @Test
    public void RawStrHexaDecimalParseHexa01() {
        RawStrHexaDecimal h = new RawStrHexaDecimal(5);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(1), HexaByte.Value(2), HexaByte.Value(3),
                HexaByte.Value(4), HexaByte.Value(5))));
        h.HexaToValue();
        String ex = "0x0102030405";
        Assert.assertEquals(ex, h.GetValue());
    }

}
