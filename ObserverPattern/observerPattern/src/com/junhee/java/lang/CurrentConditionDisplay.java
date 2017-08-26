package com.junhee.java.lang;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	private float temp, pressure, humidity;

	@Override
	public void display() {
		System.out.println("Temperature : " + this.temp);
		System.out.println("Pressure : " + this.pressure);
		System.out.println("Humidity : " + this.humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
	}

}
