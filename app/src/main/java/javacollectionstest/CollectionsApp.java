/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javacollectionstest;

import java.util.Scanner;

public class CollectionsApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1 for ArrayList, enter 2 for HashMap, or enter 3 for Quit");
        int userInput = input.nextInt();
        int arrayListOption = 0;
        boolean isValidInput = false;
        do {
            if (userInput == 1) {
                System.out.println("Enter 1 to select a String or enter 2 to select an Integer");
                arrayListOption = input.nextInt();
                if (arrayListOption == 1) {
                    isValidInput = true;
                    System.out.println("");
                    ArrayListUtils stringList = new ArrayListUtils();
                    System.out.println("Enter a number between 10 & 25 to select");
                    System.out.println("how many strings you would like");
                    int userStringNum = input.nextInt();
                    if ((userStringNum >= 10) && (userStringNum <= 25)) {
                        stringList.printUserArrayChoice(userStringNum);
                        System.out.println("To display list filtering options, press 1");
                        int userFilter = input.nextInt();
                        if (userFilter == 1) {
                            System.out.println("What would you like to do?");
                            System.out.println("1 -- Display all words to the console");
                            System.out.println("2 -- Display all plural words capitalized");
                            System.out.println("3 -- Display all words in reverse order");
                            // System.out.println("4 -- Display words that aren't plural");
                            // System.out.println("5 -- Add stars between your words");
                        }
                    }
                    int userFilterOption = input.nextInt();
                    if (userFilterOption == 1) {
                        stringList.printList();
                    } else if (userFilterOption == 2) {
                        stringList.printPluralsAndCaps(userStringNum);
                    } else if (userFilterOption == 3) {
                        stringList.printInReverse(userStringNum);
                    } else if (userFilterOption == 4) {

                    }
                } else if (arrayListOption == 2) {
                    isValidInput = true;
                    ArrayListUtils arrayList = new ArrayListUtils();
                    arrayList.isPrintUserIntArrayChoice(100);
                    System.out.println("Here is an array list of 100 random numbers: ");
                    System.out.println(arrayList.getUserIntArray());
                    System.out.println("Please enter:");
                    System.out.println("1 -- Display an average of all numbers");
                    System.out.println("2 -- Display the highest and lowest numbers");
                    System.out.println("3 -- Display only the odd numbers");
                    int userIntDisplayOption = input.nextInt();
                    if (userIntDisplayOption == 1) {
                        arrayList.calculateAverageOfIntArray();
                    } else if (userIntDisplayOption == 2) {
                        arrayList.HighestAndLowestNumOnly();
                    } else if (userIntDisplayOption == 3) {
                        arrayList.PrintOddsOnly();
                    }
                }
            } else if (userInput == 2) {
                isValidInput = true;
                HashMapUtils userHashMap = new HashMapUtils();
                System.out.println("Enter a number between 10 and 15 to indicate");
                System.out.println("how many key value pairs you would like.");
                int userNumKeys = input.nextInt();
                if (userNumKeys < 10 || userNumKeys > 15) {
                    System.out.println("Please try again (Enter 10-15)");
                    userNumKeys = input.nextInt();
                } else {
                    userHashMap.createKeyValuePairs(userNumKeys, input);
                    System.out.println("Please enter:");
                    System.out.println("1 -- Display all key value pairs");
                    System.out.println("2 -- Retrieve a value by key");
                    System.out.println("3 -- Check if a given key value pair exists");
                }
                int userKeyValDisplay = input.nextInt();
                if (userKeyValDisplay == 1) {
                    userHashMap.displayKeyValuePairs();
                } else if (userKeyValDisplay == 2) {
                    System.out.println("Please enter the key (integer): ");
                    int userKeyEntry = input.nextInt();
                    userHashMap.getValueByKey(userKeyEntry);
                } else if (userKeyValDisplay == 3) {
                    System.out.println("Please enter the key you wish to check: ");
                    int userKeyTest = input.nextInt();
                    userHashMap.ifContainsKeyIsTrue(userKeyTest);
                }
            } else if (userInput == 3) {
                isValidInput = true;
                System.out.println("You have chosen to exit. Please see yourself out.");
            } else {
                isValidInput = false;
                System.out.println("Invalid entry. Please enter 1, 2, or 3");
                System.out.println("Please enter 1 for ArrayList, enter 2 for HashMap, or enter 3 for Quit");
                userInput = input.nextInt();
            }

        } while (!isValidInput);

        System.out.println("Program completed");
        input.close();
    }
}