/**
 * @file HashMapDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/27/2014
 */

package com.valerysamovich.java.advance.collections.classes.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        
        // Create a hash map
        HashMap hm = new HashMap();
        // Put elements to the map
        hm.put("Zara", new Double(3434.34));
        hm.put("Ayan", new Double(123.22));
        hm.put("Daisy", new Double(99.22));
        
        // Get a set of the entries
        Set set = hm.entrySet();
        // Get an iterator
        Iterator i = set.iterator();
        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        
        System.out.println();
        // Deposit 1000 into Zara's account
    }

}
