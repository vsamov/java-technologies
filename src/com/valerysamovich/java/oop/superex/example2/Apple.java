package com.valerysamovich.java.oop.superex.example2;

public class Apple extends Fruit {
    
    String name = "Apple";
    
    @Override
    public void getClassName() {
        System.out.println("Apple!");
    }
    
    void printname() {
        
        // Print the value of "name" from subclass (Apple)
        System.out.println("Name from subclass " + name);
        
        // Print the value of "name" from superclass (Apple)
        System.out.println("Name from superclass " + super.name);
        
        // Invoke Apple class's 'getClassName()' method, simply 
        getClassName();
        
        // Invoke (superclass's) Fruit class's 'getClassName()' overridden method
        super.getClassName();
    }

}
