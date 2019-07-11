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
           case 1:
               return "1月是春季";
           case 2:
               return "2月是春季";
           case 3:
               return "3月是春季";
           case 4:
               return "4月是夏季";
           case 5:
               return "5月是夏季";
           case 6:
               return "6月是夏季";
           case 7:
               return "7月是秋季";
           case 8:
               return "8月是秋季";
           case 9:
               return "9月是秋季";
           case 10:
               return "10月是冬季";
           case 11:
               return "11月是冬季";
           case 12:
               return "12月是冬季";
           default :
               return "非法输入";


       }
    }
}
