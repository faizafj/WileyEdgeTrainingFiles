package org.example;

public enum Dishes {

    PIZZA(1900, true, 30.00) {
        @Override
        public boolean calorieCheck() {
            int calories = getCalories();
            if (calories > 600) {
                System.out.println("Too many calories at: " + calories + " calories");
                return true;
            } else {
                System.out.println("Just the right amount of calories at: " + calories + " calories");
                return false;
            }

        }
    },
    PASTA(500, false, 24.00) {
        @Override
        public boolean calorieCheck() {
            int calories = getCalories();
            if (calories > 600) {
                System.out.println("Too many calories at: " + calories + " calories");
                return true;
            } else {
                System.out.println("Just the right amount of calories at: " + calories + " calories");
                return false;
            }

        }
    },
    LASAGNE(2000, false, 18.00) {
        @Override
        public boolean calorieCheck() {
            int calories = getCalories();
            if (calories > 600) {
                System.out.println("Too many calories at: " + calories + " calories");
                return true;
            } else {
                System.out.println("Just the right amount of calories at: " + calories + " calories");
                return false;
            }

        }
    },
    FISHPIE(2300, false, 20.30) {
        @Override
        public boolean calorieCheck() {
            int calories = getCalories();
            if (calories > 600) {
                System.out.println("Too many calories at: " + calories + " calories");
                return true;
            } else {
                System.out.println("Just the right amount of calories at: " + calories + " calories");
                return false;
            }

        }
    };


    private int calories;
    private boolean vegetarian;
    private double price;


    Dishes(int calories, boolean vegetarian, double price) {
        this.calories = calories;
        this.vegetarian = vegetarian;
        this.price = price;
    }


    public int getCalories() {
        return calories;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }


    public abstract boolean calorieCheck();

}
