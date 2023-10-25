//package oop;
//
//public class AQ1 {
//    public static void main(String[] args) {
//        Holiday h1=new Holiday(26, "jan","repb");
//        Holiday h2=new Holiday(14, "jan","kfd");
//        Holiday h3=new Holiday(20, "march","holi");
//        Holiday h4=new Holiday(21, "march","dhuleti");
//        System.out.println(h2.inSameMonth(h1));
//        int [] days=new int[];
//        days[0]=h1.day;
//        days[1]=h2.day;
//        days[2]=h3.day;
//        days[3]=h4.day;
//
//        Holiday.avgDate(days);
//
//
//
//
//
//
//
//
//    }
//}
//class Holiday{
//    int day;
//    String month;
//    String name;
//
//
//    public Holiday(int day, String month, String name) {
//        this.day = day;
//        this.month = month;
//        this.name = name;
//    }
//    public boolean inSameMonth(Holiday h){
//        if(h.month.equals(this.month)){
//            return true;
//        }
//        return false;
//    }
//    public static void avgDate(int[] days){
//        double totalDay;
//        for (int i=0;i<days.length;i++){
//           totalDay = totalDay + i;
//        }
//       double avgDay= totalDay/days.length;
//        System.out.println(avgDay);
//
//    }
//}
