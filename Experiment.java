package com.magician;

public class Experiment extends Exp
{
int a=20;
public static void main(String[] args)
{
	Experiment e=new Experiment();
	e.demo();
}
public void demo()
{
	int a=1;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
}
}
class Exp
{
	int a=30;
}
