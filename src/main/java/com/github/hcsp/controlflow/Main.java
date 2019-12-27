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
     * 输入一个月份（北半球），返回一个字符串"X月是Y季"或者"非法输入"
     *
     * <p>最好使用switch语句
     *
     * <p>例如，输入3，返回"3月是春季"；输入12，返回"12月是冬季"。若输入的是1~12之外的值，返回"非法输入"
     *
     * @param month 月份
     * @return 结果字符串
     */
    public static String monthSeason(int month) {
        if (month < 1 || month > 12) {
            return "非法输入";
        }
        String season = "";
        switch (month / 4) {
            case 0:
                season = "春";
                break;
            case 1:
                season = "夏";
                break;
            case 2:
                season = "秋";
                break;
            case 3:
                season = "冬";
                break;
        }
        return month + "月是" + season + "季";
    }
}
