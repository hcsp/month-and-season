package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println(monthSeason(0));
        System.out.println(monthSeason(1));
        System.out.println(monthSeason(5));
        System.out.println(monthSeason(9));
        System.out.println(monthSeason(11));
    }

    /**
     * 输入一个月份，返回一个字符串"X月是Y季"或者"非法输入"
     *
     * <p>最好使用switch语句
     *
     * <p>例如，输入1，返回"1月是春季"；输入12，返回"12月是冬季"。若输入的是1~12之外的值，返回"非法输入"
     *
     * @param month 月份
     * @return 结果字符串
     */
    public static String monthSeason(int month) {
        if(month < 1 || month > 12) {
            return "非法输入";
        }

        if(month <= 3) {
            return month + "月是春季";
        }
        if(month <= 6) {
            return month + "月是夏季";
        }
        if(month <= 9) {
            return month + "月是秋季";
        }
        return month + "月是冬季";
    }
}
