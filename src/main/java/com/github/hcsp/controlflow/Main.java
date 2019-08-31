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
        String season = null;
        switch (month) {
            case 1:
                season = "春季";
                break;
            case 2:
                season = "春季";
                break;
            case 3:
                season = "春季";
                break;
            case 4:
                season = "夏季";
                break;
            case 5:
                season = "夏季";
                break;
            case 6:
                season = "夏季";
                break;
            case 7:
                season = "秋季";
                break;
            case 8:
                season = "秋季";
                break;
            case 9:
                season = "秋季";
                break;
            case 10:
                season = "冬季";
                break;
            case 11:
                season = "冬季";
                break;
            case 12:
                season = "冬季";
                break;
            default:
                break;
        }

        if (season != null) {
            return month + "月是" + season;
        } else {
            return "非法输入";
        }
    }
}
