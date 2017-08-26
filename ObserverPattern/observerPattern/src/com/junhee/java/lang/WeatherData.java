package com.junhee.java.lang;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	
	private List<Observer> observerList;
	private float temp;
	private float pressure;
	private float humidity;
	
	public WeatherData(){
		observerList = new ArrayList<>();
	}
	
	
	public void registerObserver(Observer observer) {
		observerList.add(observer);
		
	}
	public void removeObserver(Observer observer) {
		int index = observerList.indexOf(observer);
		observerList.remove(index);
		
	}
	public void notifyObservers() {
		for(Observer observer : observerList){
			observer.update(temp, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurementsChanged(float temp, float pressure, float humidity){
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
	}	
}
