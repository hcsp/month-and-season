package com.github.hcsp.controlflow;

import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        String[] seasons = new String[] {"春", "夏", "秋", "冬"};
        int n = new Random().nextInt(12) + 1;
        Assertions.assertEquals("非法输入", Main.monthSeason(-1));
        Assertions.assertEquals("非法输入", Main.monthSeason(13));
        Assertions.assertEquals(
                String.format("%d月是%s季", n, seasons[(n > 2 && n < 6) ? 0 : ((n > 5 && n< 9) ? 1 : ((n > 8 && n < 12) ? 2 : 3))]), Main.monthSeason(n));
    }
}
