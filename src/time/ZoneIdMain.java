package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}

//    ... America/Argentina/Buenos_Aires | ZoneRules[currentStandardOffset=-03:00]
//    Europe/Nicosia | ZoneRules[currentStandardOffset=+02:00]
//    Pacific/Guadalcanal | ZoneRules[currentStandardOffset=+11:00]
//    Europe/Athens | ZoneRules[currentStandardOffset=+02:00]
//    US/Pacific | ZoneRules[currentStandardOffset=-08:00]
//    Europe/Monaco | ZoneRules[currentStandardOffset=+01:00]
//    ZoneId.systemDefault = Asia/Seoul
//            seoulZoneId = Asia/Seoul