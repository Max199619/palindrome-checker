package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * A word given by the user.
     * Program will be checking if this word is a palindrome
     */
    public static String wordToCheck;
    /**
     * Array to help with comparing characters at a given places in a word.
     */
    public static ArrayList<Character> wordChecked = new ArrayList<>();
    /**
     * Class used to get user's input.
     */
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Choose a word you want to check: ");
        wordToCheck = sc.next();
        //Converting word given by user to character array
        for (int i = 0; i<wordToCheck.length(); i++){
            wordChecked.add(wordToCheck.charAt(i));
        }
        //Program logic:
        boolean isPalindrome = false;
        for (int i = 0; i < wordChecked.size(); i++) {
            if (wordChecked.get(i) == wordChecked.get(wordChecked.size() - (i + 1))) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }

        }
        //Returns information to the user.
        if(isPalindrome){
            System.out.println("This word is a palindrome");
        }
        else{
            System.out.println("This word is not a palindrome");
        }


    }



}

