package com.faizaj.peoplearray;

public class ListOfPeople {

    private People[] people;
    public int numberOfPeople;

    public ListOfPeople(int numberOfPeople) {
        super();
        this.numberOfPeople = numberOfPeople;
        people = new People[numberOfPeople];
    }

    public void displayList() {
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println(people[i].getId() + " " + people[i].getName() + " " + people[i].getAge());
        }
    }

}
