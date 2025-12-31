public class Demo17LoopHourAndMinute {
    public static void main(String[] args) {
        for (int hour = 0; hour <= 23; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                if (hour < 10 && minute < 10) {
                    System.out.println("现在是北京时间0" + hour + "点0" + minute + "分");
                } else if (hour >= 10 && minute < 10) {
                    System.out.println("现在是北京时间" + hour + "点0" + minute + "分");
                } else if (hour < 10 && minute >= 10) {
                    System.out.println("现在是北京时间0" + hour + "点" + minute + "分");
                } else {
                    System.out.println("现在是北京时间" + hour + "点" + minute + "分");
                }
            }
        }
    }
}