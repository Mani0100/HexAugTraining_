package com.hexaware.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<Customer>customer = new ArrayList<Customer>();
	
		 try {
	            customer.add(new Customer(1, "Mani", "Delhi", 90000, sdf.parse("2001-10-10")));
	            customer.add(new Customer(2, "Kunal", "Mumbai", 75000, sdf.parse("1985-06-20")));
	            customer.add(new Customer(3, "Piyush", "Delhi", 82000, sdf.parse("1992-11-10")));
	            customer.add(new Customer(4, "Stuti", "Bangalore", 88000, sdf.parse("2006-01-25")));
	            customer.add(new Customer(5, "Vibhuti", "Kolkata", 70000, sdf.parse("2005-09-05")));
	            customer.add(new Customer(6, "shweta", "Chennai", 65000, sdf.parse("2004-03-30")));
	            customer.add(new Customer(7, "prasanaa", "Delhi", 92000, sdf.parse("1995-07-14")));
	            customer.add(new Customer(8, "virat", "Hyderabad", 81000, sdf.parse("1995-12-17")));
	            customer.add(new Customer(9, "Narendra Modi", "Pune", 60000, sdf.parse("2000-02-21")));
	            customer.add(new Customer(10, "Rahul Gandhi", "Delhi", 94000, sdf.parse("2001-08-30")));
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		
		 System.out.println("All Customer Records:");
		 customer.forEach(System.out::println);
		 
		// 2. Records whose premiu is >80000
		 
		System.out.println("Customer with premium > 80000");
        Stream<Customer> filter1 = customer.stream().filter(x -> x.getPremium() >= 90000);
		filter1.forEach(x -> {
			System.out.println(x);
		});
		
		// 3. customer who belong to delhi
		
	//	System.out.println("Customer from delhi");
	//	 Stream<Customer> filter2 = customer.equals("Delhi").
	//		filter2.forEach(x -> {
	//			System.out.println(x);
	//		});
		
		// 4. display sorted by custName
		
		System.out.println("Sort By Name-wise  ");
		Collections.sort(customer, (c1, c2) -> {
			return c1.getCustName().compareTo(c2.getCustName());
		});
		customer.forEach(x -> {
			System.out.println(x);
		});
	
	// 5.display sorted by dateofbirth
	

	System.out.println("Sort By Date of Birth  ");
	Collections.sort(customer, (c1, c2) -> {
		return c1.getDateOfBirth().compareTo(c2.getDateOfBirth());
	});
	customer.forEach(x -> {
		System.out.println(x);
	});
	}
	}

