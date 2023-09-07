package com.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler {

  @Scheduled(cron = "0 * 19 * * ?")
  public void cronJobScheduler(){
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    Date now = new Date();
    String stringDate = sdf.format(now);
    System.out.println("Java cron job expressions %s%n".formatted(stringDate));
  }

  @Scheduled(fixedRate = 1000)
  public void fixedRateScheduler(){
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    Date now = new Date();
    String stringDate = sdf.format(now);
    System.out.println("Fixed Rate Scheduler %s%n".formatted(stringDate));
  }

  @Scheduled(fixedDelay = 1000, initialDelay = 300000)
  public void fixedDelayScheduler(){
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    Date now = new Date();
    String stringDate = sdf.format(now);
    System.out.println("Fixed Delay Scheduler %s%n".formatted(stringDate));
  }

}
