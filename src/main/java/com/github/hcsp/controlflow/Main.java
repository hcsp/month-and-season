package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println(monthSeason(0));
        System.out.println(monthSeason(1));
        System.out.println(monthSeason(5));
        System.out.println(monthSeason(9));
        System.out.println(monthSeason(11));
    }

    public static String expression(int num,String season){
        return num+"月是"+season+"季";
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
        switch (month){
            case 1:
                result = expression(1,"春");
                break;
            case 2:
                result = expression(2,"春");
                break;
            case 3:
                result = expression(3,"春");
                break;
            case 4:
                result = expression(4,"夏");
                break;
            case 5:
                result = expression(5,"夏");
                break;
            case 6:
                result = expression(6,"夏");
                break;
            case 7:
                result = expression(7,"秋");
                break;
            case 8:
                result = expression(8,"秋");
                break;
            case 9:
                result = expression(9,"秋");
                break;
            case 10:
                result = expression(10,"冬");
                break;
            case 11:
                result = expression(11,"冬");
                break;
            case 12:
                result = expression(12,"冬");
                break;
            default:
                result = "非法输入";
        }
        return result;
    }
}
