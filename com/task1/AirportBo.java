package com.task1;

public class AirportBo {
	public Airport creatAirport(String data, Country[] countrylist)
	{
		String str[]=data.split(",");
		
		Airport airp = new Airport(str[0],countrylist);
		return airp;
		
	}
	public String findCountryName(Airport[] airportList, String airportname)	
	{
		
	}
	public Boolean findWhetherAirportsAreInSameCountry (Airport[] airportList, String airportname1, String airportname2)	
	{
		
	}

}
