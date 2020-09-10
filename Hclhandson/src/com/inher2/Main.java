package com.inher2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		String data;
		Scanner s = new Scanner(System.in);
		data= s.nextLine();
		AccountBo b = new AccountBo(data, 0, data, 0, 0);
		b.getAccDetails(data);
		

	}

}
