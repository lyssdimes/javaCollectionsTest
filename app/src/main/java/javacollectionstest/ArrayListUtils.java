package javacollectionstest;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListUtils {

    private Random randomNumGen = new Random();

    private ArrayList<String> userStringArray = new ArrayList<>();
    String[] createString = { "dogs", "cats", "bird", "whale", "snake", "lion", "parrot", "turtles", "seacucumbers",
            "earthworm", "monkey", "mouse", "guinea pig", "gorillas", "rat", "tiger", "capybara", "panther", "bear",
            "iguana", "eel", "rabbits", "skunk", "kamado dragon", "spider" };

    public ArrayList<String> getUserStringArray() {
        return userStringArray;
    }

    public void printUserArrayChoice(int userChoice) {
        for (int i = 0; i < userChoice; i++) {
            userStringArray.add(createString[i]);
        }
        System.out.println(userStringArray);
    }

    private ArrayList<Integer> userIntArray = new ArrayList<>();

    public ArrayList<Integer> getUserIntArray() {
        return userIntArray;
    }

    public void isPrintUserIntArrayChoice(int intUserChoice) {
        for (int i = 0; i < intUserChoice; i++) {
            int randomNum = randomNumGen.nextInt(100);
            userIntArray.add(randomNum);
        }
    }

    public void calculateAverageOfIntArray() {
        int sum = 0;
        for (int number : userIntArray) {
            sum += number;
        }
        double average = (double) sum / userIntArray.size();
        System.out.println("Average: " + average);
    }

    public void HighestAndLowestNumOnly() {
        int highest = userIntArray.get(0);
        int lowest = userIntArray.get(0);

        for (int number : userIntArray) {
            if (number > highest) {
                highest = number;
            }
            if (number < lowest) {
                lowest = number;
            }
        }

        System.out.println("Highest # is: " + highest);
        System.out.println("Lowest # is: " + lowest);
    }

    public void PrintOddsOnly() {
        for(int number: userIntArray){
            if(number % 2 != 0){
                System.out.println("Odd #: " + number);
            }
        }
    }

    public void printList() {
        int animalListSelected = userStringArray.size();
        for (int i = 0; i < animalListSelected; i++) {
            System.out.println(userStringArray.get(i));
        }
    }

    public void printPluralsAndCaps(int numberOfWords) {
        int count = 0;
        for (String word : userStringArray) {
            if (count >= numberOfWords) {
                break;
            }
            if (word.charAt(word.length() - 1) == 's') {
                System.out.println(word.toUpperCase());
            }
        }
    }

    public void printInReverse(int chosenArraySize) {
        int startIndex = userStringArray.size() - chosenArraySize;
        for (int i = userStringArray.size() - 1; i >= startIndex; i--) {
            System.out.println(userStringArray.get(i));
        }
    }
}
