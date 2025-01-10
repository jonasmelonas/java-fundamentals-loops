package com.booleanuk.core;

public class Exercise {
    public int[] numsZeroToThree = new int[4];
    public int[] numsFiveToTen = new int[6];
    public int[] countdown = new int[4];

    public int[] favouriteNumbers = {1, 2, 4, 5, 7, 8, 10};

    public String[] myHobbies = {"Fishing", "Language learning", "Skydiving", "Procrastinating"};

    public void stepOne() {
        // TODO: 1. Write a for loop that adds the numbers 0 to 3 to the numsZeroToThree array
        for(int i = 0; i < 4; i++) {
            numsZeroToThree[i] = i;
        }
    }

    public void stepTwo() {
        // TODO: 2. Write a for loop that adds the numbers 5 to 10 to the numsFiveToTen array
        int val = 5;
        for(int i = 0; i < 6; i++) {
            numsFiveToTen[i] = val;
            val++;
        }

    }

    public void stepThree() {
        // TODO: 3. Write a for loop that adds the numbers 3 to 0 (in that order) to the countdown array
        int val = 3;
        for(int i = 0; i < 4; i++) {
            countdown[i] = val;
            val--;
        }
    }

    public boolean stepFour(int num) {
        // TODO: 6. Write a for loop that checks if num is in the favouriteNumbers array
        for(int i = 0; i < favouriteNumbers.length; i++) {
            if(favouriteNumbers[i] == num) return true;
        }
        return false;
    }

    public boolean stepFive(String hobby) {
        // TODO 5. Write a for loop that checks if the hobby String is in the myHobbies array
        for(int i = 0; i < myHobbies.length; i++) {
            if(myHobbies[i].equals(hobby)) return true;
        }
        return false;
    }
}
