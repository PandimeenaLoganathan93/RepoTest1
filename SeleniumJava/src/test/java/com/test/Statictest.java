package com.test;

public class Statictest {
	
	String ename;
	int eid;
	static int objcount;

	public Statictest()
	{
		
		objcount++;
		System.out.println("object count" +objcount);
	}
	
	public static void main(String[] argrs)
	{
		Statictest a=new Statictest();
		a.ename="meea";
		a.eid=1;
		Statictest b=new Statictest();
		b.ename="meena";
		b.eid=2;
		new Statictest();
		new Statictest();
	
	}
}
