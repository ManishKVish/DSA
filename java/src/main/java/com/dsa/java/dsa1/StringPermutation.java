package com.dsa.java.dsa1;

import java.util.ArrayList;

public class StringPermutation {

    public ArrayList<String> getPermutations(String inputString) {

        ArrayList<String> allPermutations = new ArrayList<>();

        StringBuilder currentString = new StringBuilder(inputString);

        generatePermutation(currentString, 0, allPermutations);
                          // currentString -> "ABC" currentIndex -> 0 allPermutations -> []
        return allPermutations;
    }


    public void generatePermutation(
            StringBuilder currentString,
            int currentIndex,
            ArrayList<String> allPermutations
    ) {

        // Base case
        if(currentIndex == currentString.length()) {

            allPermutations.add(currentString.toString());

            return;
        }
          
        // chose //explore //backtrack

         // now we are going start to end of the string and swap
          for(int swapIndex = currentIndex;swapIndex < currentString.length();swapIndex++) {
            // Choose
            // ABC -> swapIndex = 0 -> ABC
            // ABC -> swapIndex = 1 -> BAC  
            // ABC -> swapIndex = 2 -> CBA
            swapCharacters(currentString, currentIndex, swapIndex);

            // Explore
            // whatever string we get after above swaping we need to get the 
            // again get the permutation recursivly
            generatePermutation(currentString, currentIndex + 1, allPermutations);

            // Backtrack
            swapCharacters(currentString, currentIndex, swapIndex);
        }
    }


    public void swapCharacters( StringBuilder currentString, int firstIndex,int swapIndex) {

        char tempCharacter =
                currentString.charAt(firstIndex);

        currentString.setCharAt(
                firstIndex,
                currentString.charAt(swapIndex)
        );

        currentString.setCharAt(
                swapIndex,
                tempCharacter
        );
    }


    public static void main(String[] args) {
        String inputString = "ABC";
        StringPermutation object =new StringPermutation();
        System.out.println(object.getPermutations(inputString));
    }
}