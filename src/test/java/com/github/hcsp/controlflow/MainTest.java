package com.github.hcsp.controlflow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {
        String[] seasons = new String[] {"春", "夏", "秋", "冬"};
        int n = new java.util.Random().nextInt(12) + 1;
        assertEquals("非法输入", Math.monthSeason(-1));
        assertEquals("非法输入", Math.monthSeason(13));
        assertEquals(String.format("%d月是%s季", n, seasons[(n - 1) / 3]), Main.monthSeason(n));
    }
}
