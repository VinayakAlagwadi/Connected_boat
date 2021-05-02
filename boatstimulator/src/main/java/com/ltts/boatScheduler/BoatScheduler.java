package com.ltts.boatScheduler;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ltts.boatService.BoatService;



@Component
public class BoatScheduler {

	@Autowired
    BoatService boatService;
           
         @Scheduled(initialDelayString="${TIMEOUT_SCHEDULER_INTIAL_DELAY}",
                 fixedRateString="${TIMEOUT_SCHEDULER_DELAY}")
         public void postBoat() throws IOException {
        	 System.out.println("hi");
        	 System.out.println(boatService.postBoatData(null)); 
             
         }            
    }





