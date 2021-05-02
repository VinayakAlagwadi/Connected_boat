package com.ltts.boatService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.json.simple.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.stereotype.Service;

import com.ltts.boatstimulator.Boat_Simulator;
import com.ltts.model.BoatEssentials;
import com.ltts.boatConfiguration.BoatConfigurations;



@Service
public class BoatService {
	
	
	
	
	@Autowired
	BoatEssentials boat;
	
	@Autowired
	Boat_Simulator boatSim;
	
	
	
	
	  //HashMap<String, BoatEssentials> boatEss = new HashMap();
	  

	
	
	  @Autowired
	  KafkaTemplate<String,String> kafkaTemplate;
	  private static final String TOPICS = "boatParam";
	     
	     
	    
		public String postBoatData(BoatEssentials be) throws IOException {
	    	 
	    	
			
			
			//JSONObject json = new JSONObject();
	    	// json.putAll(be);
	    	 
	    	 //Object file = JSONValue.parse(hs);
	        // JSONObject jsonObjectdecode = (JSONObject)file;
	    	 
	    	//Boat_Simulator bsim = new Boat_Simulator();
	    	 
	    	// boatEss = bsim.boatData();
	    	 
	    	System.out.println(be);
	    	System.out.println("Hiiiii");
	    	
	    	 
	    	this.kafkaTemplate.send(TOPICS,"hiiiii");
	         
	    	 
			return "data published";
	     
	     
	
}
}
