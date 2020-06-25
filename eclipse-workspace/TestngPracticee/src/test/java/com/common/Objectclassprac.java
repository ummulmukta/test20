package com.common;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Objectclassprac {

	public static ArrayList<Object[]> ff() {
	
ArrayList<String>s=new ArrayList<>();
s.add("Mukta");
s.add("yousuf");
	

	ArrayList<String>ss=new ArrayList<>();
	ss.add("Muk");
	ss.add("yousS");


	ArrayList<Integer>sss=new ArrayList<>();
	sss.add(23344);
	sss.add(456787);



	
	Object[]obbb= {s,ss,sss};
	ArrayList<Object[]>obb=new ArrayList<>();
	obb.add(obbb);
	return obb;
}


	
	
	@DataProvider
	public static Iterator<Object[]>it(){
		ArrayList<Object[]>aa=Objectclassprac.ff();
		return aa.iterator();
	}
	
	@Test(dataProvider = "it")
	public void testRun() {
	
System.out.println();


	}
}


