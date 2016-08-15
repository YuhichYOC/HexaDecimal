package com.yoclabo.example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class HexaDecimalTest {

    @Test
    public void test() {
        System.out.println("Test");
    }

    @Test
    public void test02() {
        HexaByte h = new HexaByte(32);
    }

    @Test
    public void TestMethod01() {
        BCDHexaDecimal h = new BCDHexaDecimal(1);
        h.SetValue((Integer) 20);
        h.ValueToHexa();
        HexaByte ex = HexaByte.Value(32);
        Assert.assertEquals(ex.toInt(), h.GetHexa().get(0).toInt());
    }

    @Test
    public void TestMethod02() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue((Integer) 1000);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(16);
        HexaByte ex2 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void TestMethod03() {
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
    public void TestMethod04() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue(100);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(1);
        HexaByte ex2 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void TestMethod05() {
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
    public void TestMethod06() {
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
    public void TestMethod07() {
        IntHexaDecimal h = new IntHexaDecimal(1);
        h.SetValue((Integer) 100);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(100);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
    }

    @Test
    public void TestMethod08() {
        IntHexaDecimal h = new IntHexaDecimal(2);
        h.SetValue((Integer) 256);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(1);
        HexaByte ex2 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void TestMethod09() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue((Integer) 20);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(0);
        HexaByte ex2 = HexaByte.Value(32);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void TestMethod10() {
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
    public void TestMethod11() {
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
    public void TestMethod12() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue((Integer) 100);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(1);
        HexaByte ex2 = HexaByte.Value(0);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
        Assert.assertEquals(ex2.toInt(), h.GetHexa().get(1).toInt());
    }

    @Test
    public void TestMethod13() {
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
    public void TestMethod14() {
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
    public void TestMethod15() {
        IntHexaDecimal h = new IntHexaDecimal(1);
        h.SetValue((Integer) 100);
        h.ValueToHexa();
        HexaByte ex1 = HexaByte.Value(100);
        Assert.assertEquals(ex1.toInt(), h.GetHexa().get(0).toInt());
    }

    @Test
    public void TestMethod16() {
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
    public void TestMethod17() throws Exception {
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
    public void TestMethod18() throws Exception {
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
    public void TestMethod19() throws Exception {
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
    public void TestMethod20() {
        BCDHexaDecimal h = new BCDHexaDecimal(1);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(32))));
        h.HexaToValue();
        int ex = 20;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

    @Test
    public void TestMethod21() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetHexa(new ArrayList<HexaByte>(Arrays.asList(HexaByte.Value(16), HexaByte.Value(0))));
        h.HexaToValue();
        int ex = 1000;
        Assert.assertEquals(ex, (int) h.GetValue());
    }

}
