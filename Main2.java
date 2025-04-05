package com.magician;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		
			

			
				Scanner sc=new Scanner(System.in);
				User2 u=new User2();
				System.out.println("enter the name:");
				String uname=sc.next();
				System.out.println("enter age:");
				int uage=sc.nextInt();
				System.out.println("enter the pwd:");
				String upwd=sc.next();
				u.setdetails(uname, uage, upwd);
				
				System.out.println(u.getName());
				System.out.println(u.getAge());
				System.out.println(u.getPwd());
				
				
	
			}
		

		
	

}
