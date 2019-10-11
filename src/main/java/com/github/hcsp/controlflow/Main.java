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
        String season = "";
//        if(month>=3&&month<=5){
//            season="春";
//        }
//        if(month>=6&&month<=8){
//            season="夏";
//        }
//        if(month>=9&&month<=11){
//            season="秋";
//        }
//        if(month==12||month==1||month==2){
//            season="冬";
//        }
//        else if(month<=0||month>12){
//           return "非法输入";
//        }
//            return month+"月是"+season+"季";
        switch (month) {
            case 3:
            case 4:
            case 5:
                season = "春";
                break;
            case 6:
            case 7:
            case 8:
                season = "夏";
                break;
            case 9:
            case 10:
                season = "秋";
                break;
            case 11:
            case 12:
            case 1:
            case 2:
                season = "冬";

                break;
            default:
                return "非法输入";
        }
        return month + "月是" + season + "季";
    }
}
