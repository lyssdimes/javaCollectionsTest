package javacollectionstest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapUtils {
    private HashMap<Integer, String> numHash = new HashMap<Integer, String>();

    public void createKeyValuePairs(int numAdding, Scanner input) {
        int startingKey = 100;
        input.nextLine();

        for (int i = 0; i < numAdding; i++) {
            System.out.println("Enter the value for key " + startingKey + " : ");
            String userValue = input.nextLine();

            numHash.put(startingKey, userValue);
            startingKey += 3;
        }
    }

    public void displayKeyValuePairs() {
        for (Integer key : numHash.keySet()) {
            System.out.println("Key: " + key + ", Value: " + numHash.get(key));
        }
    }
    public void getValueByKey(int insertKey){
        System.out.println("The value for your key is : " + numHash.get(insertKey));
    }
    public void ifContainsKeyIsTrue(int keyToTest){
        if(numHash.containsKey(keyToTest)){
            System.out.println("The value for your key is : " + numHash.get(keyToTest));
        }else{
            System.out.println("This key is invalid. I have no value for you :( ");
        }
    }
}
