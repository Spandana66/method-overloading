package com.magician;

public class C_Overload
{
C_Overload(String a,int b)
{
	System.out.println("cons with String,int par");
	System.out.println(a+""+b);
}
C_Overload(int a,String b)
{
	System.out.println("cons with int,String par");
	System.out.println(a+""+b);
}
public static void main(String[] args) 
{
	System.out.println("main start");
	C_Overload c=new C_Overload(10,"hi");
	C_Overload c1=new C_Overload("hello",20);
	System.out.println("main ends");
}

}

