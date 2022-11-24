package com.faizaj.statecapitals;

import java.util.*;

public class StateCapitals2 {

    final static String filePath = "Users/faiza/Documents/Training%20Things/Lesson%20Files/classesAndObjects/StateCapitals/src/main/java/com/faizaj/statecapitals/StateCapitals.txt";

    public static void main(String[] args) {

        int count = 0;
        Random randomCapital = new Random();
        Scanner userInput = new Scanner (System.in);

        Map<String, String> stateCapitals2 = new HashMap<>(); //creates a hashmap called stateCapitals2
        Set<String> state = stateCapitals2.keySet(); //sets states as keys
        Collection<String> capitals = stateCapitals2.values(); //sets capitals as values

        for (String val : capitals) {
            count += 1;
        }

        //print out the number of states and all the states
        System.out.println(count + " STATES & CAPITALS ARE LOADED.");
        System.out.println("HERE ARE THE STATES : ");
        for (String key : state) {
            System.out.println(key + ",");
        }
        
        
        //random state game:
        
        System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF " + " '" + "' ");
        String userAnswer = userInput.nextLine();
        
        
        //use a for loop to check them first?
        //if the user answer doesnt equal the key 
        //in correct try again?
        //else {
        //System.out.println ("NICE WORK! " +  "key" +  " IS CORRECT!");
        //}

    }
}
