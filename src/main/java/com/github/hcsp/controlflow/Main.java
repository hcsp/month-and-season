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
        switch (month){
            case 1:return (String.valueOf(month)+"月是春季");
            case 2: return (String.valueOf(month)+"月是春季");
            case 3:return (String.valueOf(month)+"月是春季");
            case 4:return (String.valueOf(month)+"月是夏季");
            case 5:return (String.valueOf(month)+"月是夏季");
            case 6:return (String.valueOf(month)+"月是夏季");
            case 7:return (String.valueOf(month)+"月是秋季");
            case 8:return (String.valueOf(month)+"月是秋季");
            case 9:return (String.valueOf(month)+"月是秋季");
            case 10:return (String.valueOf(month)+"月是冬季");
            case 11:return (String.valueOf(month)+"月是冬季");
            case 12:return (String.valueOf(month)+"月是冬季");
            default:return ("非法输入");
        }
    }
}
