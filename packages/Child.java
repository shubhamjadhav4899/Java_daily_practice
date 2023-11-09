package com.xyz.dao;
import com.xyz.pojo.*;

public class Child extends Parent{
	private int childNo;
	private String name;

	public Child(int a,String s,int child,String n){
		super(a,s);
		childNo=child;
		name=n;
	}


	public void display(){
		super.display();
		System.out.println(childNo);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Parent parent =new Child(1,"XYX",1,"amar");
		parent.display();
	}
}