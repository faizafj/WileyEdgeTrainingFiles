/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.faizaj.statecapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author faiza
 */
public class StateCapitals {

    public static void main(String[] args) {
        Map<String, String> stateCapitals = new HashMap<>();

        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");
        stateCapitals.put("California", "Sacramento");
        
        
        
        System.out.println("STATES:");
        System.out.println("=======");

        Set<String> allKeys = stateCapitals.keySet();
        for (String i : allKeys) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("CAPITALS:");
        System.out.println("=======");
        Collection<String> allValues = stateCapitals.values();
        for (String j : allValues) {
            System.out.println(j);
        }

        System.out.println(" ");
        System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("=======");
        for (String k : allKeys) {
            System.out.println( k + " - " +  stateCapitals.get(k));
        }
    }

}
