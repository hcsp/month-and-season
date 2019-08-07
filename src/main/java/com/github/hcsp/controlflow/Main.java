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
        String s ;
        switch (month){
            case 1: s="1月是春季";break;
            case 2: s="2月是春季";break;
            case 3: s="3月是春季";break;
            case 4: s="4月是夏季";break;
            case 5: s="5月是夏季";break;
            case 6: s="6月是夏季";break;
            case 7: s="7月是秋季";break;
            case 8: s="8月是秋季";break;
            case 9: s="9月是秋季";break;
            case 10: s="10月是冬季";break;
            case 11: s="11月是冬季";break;
            case 12: s="12月是冬季";break;
            default:s="非法输入";break;

        }
        return s;
    }
}
