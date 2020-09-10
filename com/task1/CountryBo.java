package com.task1;

public class CountryBo {
	public Country createCountry(String data)
	{
		String str[]= data.split(",");
		Country country = new Country(str[0],str[1]);
		
		return country;
	}

}
