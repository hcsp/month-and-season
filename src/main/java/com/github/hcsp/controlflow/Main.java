package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println(monthSeason(0));
        System.out.println(monthSeason(1));
        System.out.println(monthSeason(2));
        System.out.println(monthSeason(3));
        System.out.println(monthSeason(4));
        System.out.println(monthSeason(5));
        System.out.println(monthSeason(9));
        System.out.println(monthSeason(11));
        System.out.println(monthSeason(12));
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
        String y = "";
        int m = month -1;
        if (m < 0) {
            return "非法输入";
        }

        switch (m / 3) {
            case 0:
                y = "春季";
                break;
            case 1:
                y = "夏季";
                break;
            case 2:
                y = "秋季";
                break;
            case 3:
                y = "冬季";
                break;
            default:
                return "非法输入";
        }

        return month + "月是" + y;
    }
}
