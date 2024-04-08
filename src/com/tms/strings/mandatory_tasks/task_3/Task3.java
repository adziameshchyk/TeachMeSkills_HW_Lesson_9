package com.tms.strings.mandatory_tasks.task_3;

import java.util.Scanner;

/**
 * Task:
 *
 * Given a string of arbitrary length with arbitrary words.
 * Write a program to check whether any selected word in a string is a polyndrome.
 * For example, there is a line, the number 3 is entered, which means you need to check whether the 3rd word in this line is a polyndrome.
 * Provide warning messages in case of error situations:
 *    for example, there are 5 words in a line, and the number 500 was passed to the program input, etc. situations.
 */

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int wordNumber = scanner.nextInt();
        scanner.close();

        String[] wordsInString = string.split(" ");
        if (wordNumber < 0 || wordNumber > wordsInString.length) {
            System.out.println("Invalid word number. Select values from 1 to " + wordsInString.length + ".");
            return;
        }

        System.out.println("The word is" + (((isPolydrome(wordsInString[wordNumber - 1])) ? "" : " not") + " a polydrome."));
    }

    private static boolean isPolydrome(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
