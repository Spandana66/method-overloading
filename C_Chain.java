package com.magician;

public class C_Chain
{
C_Chain()
{
	this(10);
	System.out.println("cons with no par");
}
C_Chain(int i)
{
	this('a');
	System.out.println("cons with int par");
}
C_Chain(char c)
{
	this(1,'q');
	System.out.println("cons with char par");
}
C_Chain(int i,char c)
{
	System.out.println("cons with int,char par");
}
public static void main(String[] args) 
{
	System.out.println("main start");
	C_Chain c=new C_Chain();
	System.out.println("main ends");
}
}
