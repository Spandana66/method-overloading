package com.magician;

public class Demo
{
Demo(String a,int b)
{
	System.out.println("Demo with String,int par");
}
Demo(int a,String b)
{
	System.out.println("Demo with int,String par");
}
public static void main(String[] args)
{
	Demo d=new Demo("hi",10);
	Demo d1=new Demo(10,"helo");
}
}
