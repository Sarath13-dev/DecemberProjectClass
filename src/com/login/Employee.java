package com.login;

import java.util.Scanner;

public class Employee {

public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	String address = s.nextLine();
	System.out.println("employee address is "+ address);
	
	byte age = s.nextByte();
	System.out.println("employee age is "+ age);
	
	short pin = s.nextShort();
	System.out.println("employee pin no is "+ pin);
	
	long mob = s.nextLong();
	System.out.println("employee mobile no is "+ mob);
	
	float height = s.nextFloat();
	System.out.println("employee height is "+ height);
	
	double ans = s.nextDouble();
	System.out.println("employee ans is "+ ans);
	
	boolean status = s.nextBoolean();
	System.out.println("employee status is "+ status);
	
	char gender = s.next().charAt(0);
	System.out.println("employee gender is "+ gender);
	
	
	
}
}