package com.yoclabo.example;

import org.junit.Assert;
import org.junit.Test;

public class HexaByteTest {

    @Test
    public void HexaByteTest01() {
        HexaByte h = new HexaByte(123);

        String ex = "7B";

        Assert.assertEquals(ex, h.GetHexa());
    }

    @Test
    public void HexaByteTest02() {
        HexaByte h = new HexaByte("7B");

        int ex = 123;

        Assert.assertEquals(ex, h.GetValue().GetValue());
    }

}
