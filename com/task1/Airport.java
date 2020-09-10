package com.task1;

public class Airport {
	private String airport;
	private Country country[];
	public Airport(String airport, Country country[]) {
		super();
		this.airport = airport;
		this.country = country;
	}
	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public Country[] getCountry() {
		return country;
	}
	public void setCountry(Country[] country) {
		this.country = country;
	}
	

}
