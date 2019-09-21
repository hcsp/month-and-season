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
        String result;
        switch (month) {
            case 1:
            case 2:
            case 3:
                result = "春季";
                break;
            case 4:
            case 5:
            case 6:
                result = "夏季";
                break;
            case 7:
            case 8:
            case 9:
                result = "秋季";
                break;
            case 10:
            case 11:
            case 12:
                result = "冬季";
                break;
            default:
                result = "非法输入";
        }
        return !result.equals("非法输入") ? String.format("%d月是%s", month, result) : "非法输入";
    }
}
