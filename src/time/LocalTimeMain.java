package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {

        LocalTime nowTime = LocalTime.now();        // 지금 시간
        LocalTime ofTime = LocalTime.of(9, 10, 30);     // 지정 시간

        System.out.println("현재 시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);

//        현재 시간 = 21:06:36.477719600
//        지정 시간 = 09:10:30

        //계산(불변)
        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("지정 시간+30s = " + ofTime);

        // 지정 시간+30s = 09:10:30
    }
}
