package com.yoclabo.example;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class HexaDecimalTest {

    @Test
    public void BCDHexaDecimalValueToHexa01() {
        // 20 ( BCD ) = 0x20 ( byte )
        BCDHexaDecimal h = new BCDHexaDecimal(1);
        h.SetValue((Integer) 20);
        h.ValueToHexa();
        int ex = 32;           // 0x20 = 32 ( in integer value )
        Assert.assertEquals(ex, h.GetHexa()[0].GetValue());
    }

    @Test
    public void BCDHexaDecimalValueToHexa02() {
        // 20 ( BCD ) = 0x00 ( upper byte ) & 0x20 ( lower byte )
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue((Integer) 20);
        h.ValueToHexa();
        int ex1 = 0;           // 0x00
        int ex2 = 32;          // 0x20 = 32 ( in integer value )
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
    }

    @Test
    public void BCDHexaDecimalValueToHexa03() {
        // 100 ( BCD ) = 0x01 ( upper byte ) & 0x00 ( lower byte )
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue(100);
        h.ValueToHexa();
        int ex1 = 1;           // 0x01 = 1
        int ex2 = 0;           // 0x00
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
    }

    @Test
    public void BCDHexaDecimalValueToHexa04() {
        // 1000 ( BCD ) = 0x10 ( upper byte ) & 0x00 ( lower byte )
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue((Integer) 1000);
        h.ValueToHexa();
        int ex1 = 16;          // 0x10 = 16
        int ex2 = 0;           // 0x00
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
    }

    @Test
    public void BCDHexaDecimalValueToHexa05() {
        // 1000 ( BCD ) = 0x00 & 0x10 & 0x00
        BCDHexaDecimal h = new BCDHexaDecimal(3);
        h.SetValue(1000);
        h.ValueToHexa();
        int ex1 = 0;           // 0x00
        int ex2 = 16;          // 0x10 = 16
        int ex3 = 0;           // 0x00
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3, h.GetHexa()[2].GetValue());
    }

    @Test
    public void BCDHexaDecimalParseHexa01() {
        // 0x20 = 20 ( BCD )
        BCDHexaDecimal h = new BCDHexaDecimal(1);
        Uint8[] lb = new Uint8[1];
        lb[0] = Uint8.Value(32);                 // 0x20 = 32
        h.SetHexa(lb);
        h.HexaToValue();
        int ex = 20;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void BCDHexaDecimalParseHexa02() {
        // 0x00 & 0x20 = 20 ( BCD )
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        Uint8[] lb = new Uint8[2];
        lb[0] = Uint8.Value(0);                  // 0x00
        lb[1] = Uint8.Value(32);                 // 0x20
        h.SetHexa(lb);
        h.HexaToValue();
        int ex = 20;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void BCDHexaDecimalParseHexa03() {
        // 0x01 & 0x00 = 100 ( BCD )
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        Uint8[] lb = new Uint8[2];
        lb[0] = Uint8.Value(1);                  // 0x01
        lb[1] = Uint8.Value(0);                  // 0x00
        h.SetHexa(lb);
        h.HexaToValue();
        int ex = 100;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void BCDHexaDecimalParseHexa04() {
        // 0x10 & 0x00 = 1000 ( BCD )
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        Uint8[] lb = new Uint8[2];
        lb[0] = Uint8.Value(16);                 // 0x10 = 16
        lb[1] = Uint8.Value(0);                  // 0x00
        h.SetHexa(lb);
        h.HexaToValue();
        int ex = 1000;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void BCDHexaDecimalParseHexa05() {
        // 0x00 & 0x10 & 0x00 = 1000 ( BCD )
        BCDHexaDecimal h = new BCDHexaDecimal(3);
        Uint8[] lb = new Uint8[3];
        lb[0] = Uint8.Value(0);                  // 0x00
        lb[1] = Uint8.Value(16);                 // 0x10 = 16
        lb[2] = Uint8.Value(0);                  // 0x00
        h.SetHexa(lb);
        h.HexaToValue();
        int ex = 1000;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void DateBCDHexaDecimalValueToHexa01() throws Exception {
        // 2016-06-23 ( Date ) = 20160623 ( BCD ) = 0x20 & 0x16 & 0x06 & 0x23
        DateBCDHexaDecimal h = new DateBCDHexaDecimal(4);
        h.SetValue(new SimpleDateFormat("yyyyMMdd").parse("20160623"));
        h.ValueToHexa();
        int ex1 = 32;          // 0x20
        int ex2 = 22;          // 0x16
        int ex3 = 6;           // 0x06
        int ex4 = 35;          // 0x23
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3, h.GetHexa()[2].GetValue());
        Assert.assertEquals(ex4, h.GetHexa()[3].GetValue());
    }

    @Test
    public void DateBCDHexaDecimalValueToHexa02() throws Exception {
        // 2016-06-23 ( Date ) = 20160623 ( BCD ) = 0x00 & 0x20 & 0x16 & 0x06 &
        // 0x23
        DateBCDHexaDecimal h = new DateBCDHexaDecimal(5);
        h.SetValue(new SimpleDateFormat("yyyyMMdd").parse("20160623"));
        h.ValueToHexa();
        int ex1 = 0;           // 0x00
        int ex2 = 32;          // 0x20
        int ex3 = 22;          // 0x16
        int ex4 = 6;           // 0x06
        int ex5 = 35;          // 0x23
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3, h.GetHexa()[2].GetValue());
        Assert.assertEquals(ex4, h.GetHexa()[3].GetValue());
        Assert.assertEquals(ex5, h.GetHexa()[4].GetValue());
    }

    @Test
    public void DateBCDHexaDecimalParseHexa01() throws Exception {
        // 0x20 & 0x16 & 0x06 & 0x23 = 20160623 ( BCD ) = 2016-06-23 ( Date )
        DateBCDHexaDecimal h = new DateBCDHexaDecimal(4);
        Uint8[] lb = new Uint8[4];
        lb[0] = Uint8.Value(32);                 // 0x20
        lb[1] = Uint8.Value(22);                 // 0x16
        lb[2] = Uint8.Value(6);                  // 0x06
        lb[3] = Uint8.Value(35);                 // 0x23
        h.SetHexa(lb);
        h.HexaToValue();
        Date ex = new SimpleDateFormat("yyyyMMdd").parse("20160623");
        Assert.assertEquals(ex, h.GetValue());
    }

    @Test
    public void DateBCDHexaDecimalParseHexa02() throws Exception {
        // 0x00 & 0x20 & 0x16 & 0x06 & 0x23 = 20160623 ( BCD ) = 2016-06-23 (
        // Date )
        DateBCDHexaDecimal h = new DateBCDHexaDecimal(5);
        Uint8[] lb = new Uint8[5];
        lb[0] = Uint8.Value(0);                  // 0x00
        lb[1] = Uint8.Value(32);                 // 0x20
        lb[2] = Uint8.Value(22);                 // 0x16
        lb[3] = Uint8.Value(6);                  // 0x06
        lb[4] = Uint8.Value(35);                 // 0x23
        h.SetHexa(lb);
        h.HexaToValue();
        Date ex = new SimpleDateFormat("yyyyMMdd").parse("20160623");
        Assert.assertEquals(ex, h.GetValue());
    }

    @Test
    public void IntHexaDecimalValueToHexa01() {
        // 100 ( integer ) = 0x64
        IntHexaDecimal h = new IntHexaDecimal(1);
        h.SetValue((Integer) 100);
        h.ValueToHexa();
        int ex1 = 100;         // 0x64
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
    }

    @Test
    public void IntHexaDecimalValueToHexa02() {
        // 256 ( integer ) = 0x01 & 0x00
        IntHexaDecimal h = new IntHexaDecimal(2);
        h.SetValue((Integer) 256);
        h.ValueToHexa();
        int ex1 = 1;           // 0x01
        int ex2 = 0;           // 0x00
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
    }

    @Test
    public void IntHexaDecimalValueToHexa03() {
        // 256 ( integer ) = 0x00 & 0x01 & 0x00
        IntHexaDecimal h = new IntHexaDecimal(3);
        h.SetValue((Integer) 256);
        h.ValueToHexa();
        int ex1 = 0;           // 0x00
        int ex2 = 1;           // 0x01
        int ex3 = 0;           // 0x00
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3, h.GetHexa()[2].GetValue());
    }

    @Test
    public void IntHexaDecimalValueToHexa04() {
        // 1000 ( integer ) = 0x03 & 0xA8
        IntHexaDecimal h = new IntHexaDecimal(2);
        h.SetValue(1000);
        h.ValueToHexa();
        int ex1 = 3;           // 0x03
        int ex2 = 232;         // 0xA8
        int ex1i = 3;
        int ex2i = 232;
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex1i, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2i, h.GetHexa()[1].GetValue());
    }

    @Test
    public void IntHexaDecimalValueToHexa05() {
        // 1000 ( integer ) = 0x00 & 0x03 & 0xA8
        IntHexaDecimal h = new IntHexaDecimal(3);
        h.SetValue((Integer) 1000);
        h.ValueToHexa();
        int ex1 = 0;           // 0x00
        int ex2 = 3;           // 0x03
        int ex3 = 232;         // 0xA8
        int ex1i = 0;
        int ex2i = 3;
        int ex3i = 232;
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3, h.GetHexa()[2].GetValue());
        Assert.assertEquals(ex1i, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2i, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3i, h.GetHexa()[2].GetValue());
    }

    @Test
    public void IntHexaDecimalParseHexa01() {
        // 0x64 = 100 ( integer )
        IntHexaDecimal h = new IntHexaDecimal(1);
        Uint8[] lb = new Uint8[1];
        lb[0] = Uint8.Value(100);                // 0x64
        h.SetHexa(lb);
        h.HexaToValue();
        int ex = 100;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void IntHexaDecimalParseHexa02() {
        // 0x01 & 0x00 = 256 ( integer )
        IntHexaDecimal h = new IntHexaDecimal(2);
        Uint8[] lb = new Uint8[2];
        lb[0] = Uint8.Value(1);                  // 0x01
        lb[1] = Uint8.Value(0);                  // 0x00
        h.SetHexa(lb);
        h.HexaToValue();
        int ex = 256;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void IntHexaDecimalParseHexa03() {
        // 0x00 & 0x01 & 0x00 = 256 ( integer )
        IntHexaDecimal h = new IntHexaDecimal(3);
        Uint8[] lb = new Uint8[3];
        lb[0] = Uint8.Value(0);                  // 0x00
        lb[1] = Uint8.Value(1);                  // 0x01
        lb[2] = Uint8.Value(0);                  // 0x00
        h.SetHexa(lb);
        h.HexaToValue();
        int ex = 256;
        Assert.assertEquals(ex, h.GetValue());
    }

    @Test
    public void IntHexaDecimalParseHexa04() {
        // 0x03 & 0xA8 = 1000 ( integer )
        IntHexaDecimal h = new IntHexaDecimal(2);
        Uint8[] lb = new Uint8[2];
        lb[0] = Uint8.Value(3);                  // 0x03
        lb[1] = Uint8.Value(232);                // 0xA8
        h.SetHexa(lb);
        h.HexaToValue();
        int ex = 1000;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void IntHexaDecimalParseHexa05() {
        // 0x00 & 0x03 & 0xA8 = 1000 ( integer )
        IntHexaDecimal h = new IntHexaDecimal(3);
        Uint8[] lb = new Uint8[3];
        lb[0] = Uint8.Value(0);                  // 0x00
        lb[1] = Uint8.Value(3);                  // 0x03
        lb[2] = Uint8.Value(232);                // 0xA8
        h.SetHexa(lb);
        h.HexaToValue();
        int ex = 1000;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void LongBCDHexaDecimalValueToHexa01() {
        // 20160623 ( long BCD ) = 0x20 & 0x16 & 0x06 & 0x23
        // LongBCDHexaDecimal h = new LongBCDHexaDecimal(4);
        BCDHexaDecimal h = new BCDHexaDecimal(4);
        h.SetValue(20160623);
        h.ValueToHexa();
        int ex1 = 32;          // 0x20
        int ex2 = 22;          // 0x16
        int ex3 = 6;           // 0x06
        int ex4 = 35;          // 0x23
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3, h.GetHexa()[2].GetValue());
        Assert.assertEquals(ex4, h.GetHexa()[3].GetValue());
    }

    @Test
    public void LongBCDHexaDecimalValueToHexa02() {
        // 20160623 ( long BCD ) = 0x00 & 0x00 & 0x20 & 0x16 & 0x06 & 0x23
        // LongBCDHexaDecimal h = new LongBCDHexaDecimal(6);
        BCDHexaDecimal h = new BCDHexaDecimal(6);
        h.SetValue(20160623);
        h.ValueToHexa();
        int ex1 = 0;           // 0x00
        int ex2 = 0;           // 0x00
        int ex3 = 32;          // 0x20
        int ex4 = 22;          // 0x16
        int ex5 = 6;           // 0x06
        int ex6 = 35;          // 0x23
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3, h.GetHexa()[2].GetValue());
        Assert.assertEquals(ex4, h.GetHexa()[3].GetValue());
        Assert.assertEquals(ex5, h.GetHexa()[4].GetValue());
        Assert.assertEquals(ex6, h.GetHexa()[5].GetValue());
    }

    @Test
    public void LongBCDHexaDecimalParseHexa01() {
        // 0x20 & 0x16 & 0x06 & 0x23 = 20160623 ( long BCD )
        // LongBCDHexaDecimal h = new LongBCDHexaDecimal(4);
        BCDHexaDecimal h = new BCDHexaDecimal(4);
        Uint8[] lb = new Uint8[4];
        lb[0] = Uint8.Value(32);                 // 0x20
        lb[1] = Uint8.Value(22);                 // 0x16
        lb[2] = Uint8.Value(6);                  // 0x06
        lb[3] = Uint8.Value(35);                 // 0x23
        h.SetHexa(lb);
        h.HexaToValue();
        // long ex = 20160623;
        int ex = 20160623;
        Assert.assertEquals(ex, h.GetValue());
    }

    @Test
    public void LongBCDHexaDecimalParseHexa02() {
        // 0x00 & 0x00 & 0x20 & 0x16 & 0x06 & 0x23 = 20160623 ( long BCD )
        // LongBCDHexaDecimal h = new LongBCDHexaDecimal(6);
        BCDHexaDecimal h = new BCDHexaDecimal(6);
        Uint8[] lb = new Uint8[6];
        lb[0] = Uint8.Value(0);                  // 0x00
        lb[1] = Uint8.Value(0);                  // 0x00
        lb[2] = Uint8.Value(32);                 // 0x20
        lb[3] = Uint8.Value(22);                 // 0x16
        lb[4] = Uint8.Value(6);                  // 0x06
        lb[5] = Uint8.Value(35);                 // 0x23
        h.SetHexa(lb);
        h.HexaToValue();
        // long ex = 20160623;
        int ex = 20160623;
        Assert.assertEquals(ex, h.GetValue());
    }

    @Test
    public void LongDateBCDHexaDecimalValueToHexa01() throws Exception {
        LongDateBCDHexaDecimal h = new LongDateBCDHexaDecimal(7);
        h.SetValue(new SimpleDateFormat("yyyyMMddHHmmss").parse("20160623153212"));
        h.ValueToHexa();
        int ex1 = 32;
        int ex2 = 22;
        int ex3 = 6;
        int ex4 = 35;
        int ex5 = 21;
        int ex6 = 50;
        int ex7 = 18;
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3, h.GetHexa()[2].GetValue());
        Assert.assertEquals(ex4, h.GetHexa()[3].GetValue());
        Assert.assertEquals(ex5, h.GetHexa()[4].GetValue());
        Assert.assertEquals(ex6, h.GetHexa()[5].GetValue());
        Assert.assertEquals(ex7, h.GetHexa()[6].GetValue());
    }

    @Test
    public void LongDateBCDHexaDecimalValueToHexa02() throws Exception {
        LongDateBCDHexaDecimal h = new LongDateBCDHexaDecimal(8);
        h.SetValue(new SimpleDateFormat("yyyyMMddHHmmss").parse("20160623153212"));
        h.ValueToHexa();
        int ex1 = 0;
        int ex2 = 32;
        int ex3 = 22;
        int ex4 = 6;
        int ex5 = 35;
        int ex6 = 21;
        int ex7 = 50;
        int ex8 = 18;
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3, h.GetHexa()[2].GetValue());
        Assert.assertEquals(ex4, h.GetHexa()[3].GetValue());
        Assert.assertEquals(ex5, h.GetHexa()[4].GetValue());
        Assert.assertEquals(ex6, h.GetHexa()[5].GetValue());
        Assert.assertEquals(ex7, h.GetHexa()[6].GetValue());
        Assert.assertEquals(ex8, h.GetHexa()[7].GetValue());
    }

    @Test
    public void LongDateBCDHexaDecimalParseHexa01() throws Exception {
        LongDateBCDHexaDecimal h = new LongDateBCDHexaDecimal(7);
        Uint8[] lb = new Uint8[7];
        lb[0] = Uint8.Value(32);
        lb[1] = Uint8.Value(22);
        lb[2] = Uint8.Value(6);
        lb[3] = Uint8.Value(35);
        lb[4] = Uint8.Value(21);
        lb[5] = Uint8.Value(50);
        lb[6] = Uint8.Value(18);
        h.SetHexa(lb);
        h.HexaToValue();
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMddHHmmss");
        Assert.assertEquals(f.parse("20160623153212"), h.GetValue());
    }

    @Test
    public void LongDateBCDHexaDecimalParseHexa02() throws Exception {
        LongDateBCDHexaDecimal h = new LongDateBCDHexaDecimal(8);
        Uint8[] lb = new Uint8[8];
        lb[0] = Uint8.Value(0);
        lb[1] = Uint8.Value(32);
        lb[2] = Uint8.Value(22);
        lb[3] = Uint8.Value(6);
        lb[4] = Uint8.Value(35);
        lb[5] = Uint8.Value(21);
        lb[6] = Uint8.Value(50);
        lb[7] = Uint8.Value(18);
        h.SetHexa(lb);
        h.HexaToValue();
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMddHHmmss");
        Assert.assertEquals(f.parse("20160623153212"), h.GetValue());
    }

    @Test
    public void LongHexaDecimalParseHexa01() {
        // LongHexaDecimal h = new LongHexaDecimal(4);
        IntHexaDecimal h = new IntHexaDecimal(4);
        Uint8[] lb = new Uint8[4];
        lb[0] = Uint8.Value(1);
        lb[1] = Uint8.Value(51);
        lb[2] = Uint8.Value(160);
        lb[3] = Uint8.Value(111);
        h.SetHexa(lb);
        h.HexaToValue();
        // long ex = 20160623;
        int ex = 20160623;
        Assert.assertEquals(ex, h.GetValue());
    }

    @Test
    public void LongHexaDecimalParseHexa02() {
        // LongHexaDecimal h = new LongHexaDecimal(7);
        IntHexaDecimal h = new IntHexaDecimal(7);
        Uint8[] lb = new Uint8[7];
        lb[0] = Uint8.Value(0);
        lb[1] = Uint8.Value(0);
        lb[2] = Uint8.Value(0);
        lb[3] = Uint8.Value(1);
        lb[4] = Uint8.Value(51);
        lb[5] = Uint8.Value(160);
        lb[6] = Uint8.Value(111);
        h.SetHexa(lb);
        h.HexaToValue();
        // long ex = 20160623;
        int ex = 20160623;
        Assert.assertEquals(ex, h.GetValue());
    }

    @Test
    public void LongHexaDecimalValueToHexa01() {
        // LongHexaDecimal h = new LongHexaDecimal(4);
        IntHexaDecimal h = new IntHexaDecimal(4);
        h.SetValue(20160623);
        h.ValueToHexa();
        int ex1 = 1;
        int ex2 = 51;
        int ex3 = 160;
        int ex4 = 111;
        int ex1i = 1;
        int ex2i = 51;
        int ex3i = 160;
        int ex4i = 111;
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3, h.GetHexa()[2].GetValue());
        Assert.assertEquals(ex4, h.GetHexa()[3].GetValue());
        Assert.assertEquals(ex1i, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2i, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3i, h.GetHexa()[2].GetValue());
        Assert.assertEquals(ex4i, h.GetHexa()[3].GetValue());
    }

    @Test
    public void LongHexaDecimalValueToHexa02() {
        // LongHexaDecimal h = new LongHexaDecimal(7);
        IntHexaDecimal h = new IntHexaDecimal(7);
        h.SetValue(20160623);
        h.ValueToHexa();
        int ex1 = 0;
        int ex2 = 0;
        int ex3 = 0;
        int ex4 = 1;
        int ex5 = 51;
        int ex6 = 160;
        int ex7 = 111;
        int ex1i = 0;
        int ex2i = 0;
        int ex3i = 0;
        int ex4i = 1;
        int ex5i = 51;
        int ex6i = 160;
        int ex7i = 111;
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3, h.GetHexa()[2].GetValue());
        Assert.assertEquals(ex4, h.GetHexa()[3].GetValue());
        Assert.assertEquals(ex5, h.GetHexa()[4].GetValue());
        Assert.assertEquals(ex6, h.GetHexa()[5].GetValue());
        Assert.assertEquals(ex7, h.GetHexa()[6].GetValue());
        Assert.assertEquals(ex1i, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2i, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3i, h.GetHexa()[2].GetValue());
        Assert.assertEquals(ex4i, h.GetHexa()[3].GetValue());
        Assert.assertEquals(ex5i, h.GetHexa()[4].GetValue());
        Assert.assertEquals(ex6i, h.GetHexa()[5].GetValue());
        Assert.assertEquals(ex7i, h.GetHexa()[6].GetValue());
    }

    @Test
    public void RawStrHexaDecimalValueToHexa01() {
        RawStrHexaDecimal h = new RawStrHexaDecimal(5);
        h.SetValue("0x0102030405");
        h.ValueToHexa();
        int ex1 = 1;
        int ex2 = 2;
        int ex3 = 3;
        int ex4 = 4;
        int ex5 = 5;
        Assert.assertEquals(ex1, h.GetHexa()[0].GetValue());
        Assert.assertEquals(ex2, h.GetHexa()[1].GetValue());
        Assert.assertEquals(ex3, h.GetHexa()[2].GetValue());
        Assert.assertEquals(ex4, h.GetHexa()[3].GetValue());
        Assert.assertEquals(ex5, h.GetHexa()[4].GetValue());
    }

    @Test
    public void RawStrHexaDecimalParseHexa01() {
        RawStrHexaDecimal h = new RawStrHexaDecimal(5);
        Uint8[] lb = new Uint8[5];
        lb[0] = Uint8.Value(1);                  // 0x01
        lb[1] = Uint8.Value(2);                  // 0x02
        lb[2] = Uint8.Value(3);                  // 0x03
        lb[3] = Uint8.Value(4);                  // 0x04
        lb[4] = Uint8.Value(5);                  // 0x05
        h.SetHexa(lb);
        h.HexaToValue();
        String ex = "0x0102030405";
        Assert.assertEquals(ex, h.GetValue());
    }

}
