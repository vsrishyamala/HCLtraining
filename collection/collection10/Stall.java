package com.collection10;
import java.util.Iterator;
import java.util.List;

public class Stall {
	String name, details,type,ownerName;
	Stall()
	{
		
	}

	public Stall(String name, String details, String type, String ownerName) {
		super();
		this.name = name;
		this.details = details;
		this.type = type;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	void remove(List<Stall> s) {
           Iterator<Stall> i =s.iterator();
           while(i.hasNext()) {
        	   if(i.next().getName().startsWith("test"))
        		   i.remove();
			}
		}
	
	
	public void display(List<Stall> str) {
		for(Stall ss : str) {
			System.out.printf(ss.getName()+ss.getOwnerName()+ss.getType()+ss.getDetails());
		}
	}
}
