package com.way.threads.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args){
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            
            @Override
            public void run() {
                System.out.println("run……");
            }
        }, new Date(System.currentTimeMillis()+1000),1000);
        
        
    }

}
