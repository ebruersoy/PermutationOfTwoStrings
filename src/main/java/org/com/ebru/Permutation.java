package org.com.ebru;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please write first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Please write second string: ");
        String s2 = scanner.nextLine();

        System.out.println(checkIfOneStringContainsAllOfOthers(s1, s2));

    }

    public static boolean checkIfOneStringContainsAllOfOthers(String string1, String string2) {
        if(null == string1) {
            return false;
        }
        if(null == string2) {
            return false;
        }
        int length1 =  string1.length();
        int length2 =  string2.length();
        int[] countArray = new int[256];
        String longer = string1;
        String shorter = string2;
        if(length2 > length1){
            longer = string2;
            shorter = string1;
        }
        char[] chars = longer.toCharArray();
        for (char character : chars){
            countArray[character] += 1;
        }
        chars = shorter.toCharArray();
        for (char character : chars){
            countArray[character] -= 1;
            if(countArray[character] < 0){
                return false;
            }
        }
        return true;
    }

}
