package com.dsa.java.dsa1;

public class SlidingWindowLongestSubArray {
    
    public static  int longestSubArray(String s){
        int [] freq = new int[256];  
        
        int leftPointer = 0;
        int maxLength = 0;

        for(int rightPointer = 0; rightPointer < s.length(); rightPointer++){
            char charchterAtRightPointer = s.charAt(rightPointer);
            int freqValue = freq[charchterAtRightPointer];  
            // fre[charchterAtRightPointer] -> freq[Ascii value of charchterAtRightPointer] -> fre[a] - fre[97] = 0

            System.out.println(" Freq before update: " + freqValue);
            freq[charchterAtRightPointer] =  freqValue+ 1;
            System.out.println("rightPointer: " + rightPointer +"left: " + leftPointer + ", Char: " + charchterAtRightPointer + ", Freq: " + freq[charchterAtRightPointer]);

            while(freq[charchterAtRightPointer] > 1){
                char charAtLeftPointer = s.charAt(leftPointer);
                freq[charAtLeftPointer]--;
                leftPointer++;
            }
            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abbcabcbb";
        int result = longestSubArray(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
