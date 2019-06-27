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
        if(month<1 || month > 12) return "非法输入";
        else{
            switch ((month-1)/3){
                case 0: return month+"月是春季";
                case 1: return month+"月是夏季";
                case 2: return month+"月是秋季";
                case 3: return month+"月是冬季";
                default: return "非法输入";
            }
        }
    }
}
