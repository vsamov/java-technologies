package com.valerysamovich.java.oop.constructors.box;

public class TestBox {
	
	public static void main(String[] args) {
		
		
		SmallBox obj = new SmallBox();
		obj.calculateArea(); // call the constructor without parameters
		SmallBox obj2 = new SmallBox(3,4);
		obj2.calculateArea(); // call the constructor with parameters
	}
}