package com.yoclabo.example;

import org.junit.Assert;
import org.junit.Test;

public class HexaDecimalTest {

    @Test
    public void test() {
        System.out.println("Test");
    }

    @Test
    public void TestMethod01() {
        BCDHexaDecimal h = new BCDHexaDecimal(1);
        h.SetValue((Integer) 20);
        h.ValueToHexa();
        byte ex = 32;
        Assert.assertEquals(ex, (byte) h.GetHexa().get(0));
    }

    @Test
    public void TestMethod02() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue((Integer) 1000);
        h.ValueToHexa();
        byte ex1 = 16;
        byte ex2 = 0;
        Assert.assertEquals(ex1, (byte) h.GetHexa().get(0));
        Assert.assertEquals(ex2, (byte) h.GetHexa().get(1));
    }

    @Test
    public void TestMethod03() {
        LongBCDHexaDecimal h = new LongBCDHexaDecimal(4);
        h.SetValue(new Long(20160623));
        h.ValueToHexa();
        byte ex1 = 32;
        byte ex2 = 22;
        byte ex3 = 6;
        byte ex4 = 35;
        Assert.assertEquals(ex1, (byte) h.GetHexa().get(0));
        Assert.assertEquals(ex2, (byte) h.GetHexa().get(1));
        Assert.assertEquals(ex3, (byte) h.GetHexa().get(2));
        Assert.assertEquals(ex4, (byte) h.GetHexa().get(3));
    }

    @Test
    public void TestMethod04() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue(100);
        h.ValueToHexa();
        byte ex1 = 1;
        byte ex2 = 0;
        Assert.assertEquals(ex1, (byte) h.GetHexa().get(0));
        Assert.assertEquals(ex2, (byte) h.GetHexa().get(1));
    }

    @Test
    public void TestMethod05() {
        IntHexaDecimal h = new IntHexaDecimal(2);
        h.SetValue(1000);
        h.ValueToHexa();
        byte ex1 = 3;
        byte ex2 = -24;
        int ex1i = 3;
        int ex2i = 232;
        Assert.assertEquals(ex1, (byte) h.GetHexa().get(0));
        Assert.assertEquals(ex2, (byte) h.GetHexa().get(1));
        Assert.assertEquals(ex1i, h.GetHexa().get(0) & 0xff);
        Assert.assertEquals(ex2i, h.GetHexa().get(1) & 0xff);
    }

    @Test
    public void TestMethod06() {
        LongHexaDecimal h = new LongHexaDecimal(4);
        h.SetValue(new Long(20160623));
        h.ValueToHexa();
        byte ex1 = 1;
        byte ex2 = 51;
        byte ex3 = -96;
        byte ex4 = 111;
        int ex1i = 1;
        int ex2i = 51;
        int ex3i = 160;
        int ex4i = 111;
        Assert.assertEquals(ex1, (byte) h.GetHexa().get(0));
        Assert.assertEquals(ex2, (byte) h.GetHexa().get(1));
        Assert.assertEquals(ex3, (byte) h.GetHexa().get(2));
        Assert.assertEquals(ex4, (byte) h.GetHexa().get(3));
        Assert.assertEquals(ex1i, h.GetHexa().get(0) & 0xff);
        Assert.assertEquals(ex2i, h.GetHexa().get(1) & 0xff);
        Assert.assertEquals(ex3i, h.GetHexa().get(2) & 0xff);
        Assert.assertEquals(ex4i, h.GetHexa().get(3) & 0xff);
    }

    @Test
    public void TestMethod07() {
        IntHexaDecimal h = new IntHexaDecimal(1);
        h.SetValue((Integer) 100);
        h.ValueToHexa();
        byte ex1 = 100;
        Assert.assertEquals(ex1, (byte) h.GetHexa().get(0));
    }

    @Test
    public void TestMethod08() {
        IntHexaDecimal h = new IntHexaDecimal(2);
        h.SetValue((Integer) 256);
        h.ValueToHexa();
        byte ex1 = 1;
        byte ex2 = 0;
        Assert.assertEquals(ex1, (byte) h.GetHexa().get(0));
        Assert.assertEquals(ex2, (byte) h.GetHexa().get(1));
    }

    @Test
    public void TestMethod09() {
        BCDHexaDecimal h = new BCDHexaDecimal(2);
        h.SetValue((Integer) 20);
        h.ValueToHexa();
        byte ex1 = 0;
        byte ex2 = 32;
        Assert.assertEquals(ex1, (byte) h.GetHexa().get(0));
        Assert.assertEquals(ex2, (byte) h.GetHexa().get(1));
    }

    @Test
    public void TestMethod10() {
        BCDHexaDecimal h = new BCDHexaDecimal(3);
        h.SetValue(1000);
        h.ValueToHexa();
        byte ex1 = 0;
        byte ex2 = 16;
        byte ex3 = 0;
        Assert.assertEquals(ex1, (byte) h.GetHexa().get(0));
        Assert.assertEquals(ex2, (byte) h.GetHexa().get(1));
        Assert.assertEquals(ex3, (byte) h.GetHexa().get(2));
    }

}
