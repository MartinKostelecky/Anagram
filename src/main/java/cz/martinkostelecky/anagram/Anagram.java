/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.martinkostelecky.anagram;

import java.util.*;

/**
 *
 * @author Martin Kostelecký
 */
public class Anagram {

    public static void main(String[] args) {
        String test = "";
        String original = "";
       
        System.out.println(isAnagram("Linux", "XiNlU"));
    }
    public static boolean isAnagram(String test, String original) {
        //Fields of chars
        char[] testArray = test.toLowerCase().toCharArray();
        char[] originalArray = original.toLowerCase().toCharArray();
        //Fields sorting
        Arrays.sort(testArray);
        Arrays.sort(originalArray);
        // Return of boolean value true when anagram, false when not
    return Arrays.equals(testArray, originalArray) && testArray.length == originalArray.length;
    }
}

