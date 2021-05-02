package com.ltts.model;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class BoatEssentials implements Map {

	
	private String hull_Id;
	private String imei_Id;
	private double boat_Speed;
	private BoatLocation boat_loc;
	
	
	public BoatEssentials() {
		super();
	}


	public BoatEssentials(String hull_Id, String imei_Id, double boat_Speed, BoatLocation boat_loc) {
		super();
		this.hull_Id = hull_Id;
		this.imei_Id = imei_Id;
		this.boat_Speed = boat_Speed;
		this.boat_loc = boat_loc;
	}

	public String getHull_Id() {
		return hull_Id;
	}


	public void setHull_Id(String hull_Id) {
		this.hull_Id = hull_Id;
	}


	public String getImei_Id() {
		return imei_Id;
	}


	public void setImei_Id(String imei_Id) {
		this.imei_Id = imei_Id;
	}


	public double getBoat_Speed() {
		return boat_Speed;
	}

	public void setBoat_Speed(double boat_Speed) {
		this.boat_Speed = boat_Speed;
	}




	public BoatLocation getBoat_loc() {
		return boat_loc;
	}




	public void setBoat_loc(BoatLocation boat_loc) {
		this.boat_loc = boat_loc;
	}


	@Override
	public String toString() {
		return "BoatEssentials [hull_Id=" + hull_Id + ", imei_Id=" + imei_Id + ", boat_Speed=" + boat_Speed
				+ ", boat_loc=" + boat_loc + "]";
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
