package CityCodeMap.Imp;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class LondonT implements Runnable{
    @Override
    public void run() {
        synchronized (this){

        while(true)
       {
           String cityTime = "Europe/London";
            Date date = Calendar.getInstance().getTime();
            ZoneId zone = ZoneId.of(cityTime);
            LocalTime now = LocalTime.now(zone);
            System.out.println("("+Thread.currentThread()+") "+"London Time: " +now+"\r");
           // System.out.printf("London time: %s%n", now );
            try{
                Thread.sleep(1000);
            } catch(Exception ex){
                ex.printStackTrace();

            }
        }



    } }
}
