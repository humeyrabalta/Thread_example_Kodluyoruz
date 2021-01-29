package CityCodeMap.Imp;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class NewDelhiT implements Runnable{

        @Override
        public void run() {
            synchronized (this){
            while (true) {
                Date date = Calendar.getInstance().getTime();
                ZoneId zone = ZoneId.of("Asia/Kolkata");
                LocalTime now = LocalTime.now(zone);
               System.out.println("("+Thread.currentThread()+") "+" New_Delhi Time: " + now + "\r"); //tek satır ama dönüyo kendi içinde ülkeler
               // System.out.printf("New Delhi time: %s%n", now ); //uzayıp gidiyo

                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                    ex.printStackTrace();

                }
            }
        } }
    }

