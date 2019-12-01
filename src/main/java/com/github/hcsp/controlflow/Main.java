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
        String result;
        switch (month){
            case 1:
            case 2:
            case 3:
                result = month+"月是春季";
                break;
            case 4:
            case 5:
            case 6:
                result = month+"月是夏季";
                break;
            case 7:
            case 8:
            case 9:
                result = month+"月是秋季";
                break;
            case 10:
            case 11:
            case 12:
                result = month+"月是冬季";
                break;
            default:
                result = "非法输入";
                break;
        }
        return result;
    }
}
