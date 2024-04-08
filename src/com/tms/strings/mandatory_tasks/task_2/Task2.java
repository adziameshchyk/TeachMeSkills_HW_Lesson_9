package com.tms.strings.mandatory_tasks.task_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task:
 *
 * Given a string of arbitrary length with arbitrary words.
 * Find a word in which the number of distinct characters is minimal. The word can contain letters and numbers.
 * If there are several such words, find the first one.
 * For example, in the string "fffff ab f 1234 jkjk" the word found should be "fffff".
 */

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        System.out.println(getWordWithMinimalDistinctCharacters(str));
    }

    private static String getWordWithMinimalDistinctCharacters(String str) {
        String[] words = str.split(" ");

        int min = words[0].length();
        String searchWord = "";
        for (String word : words) {
            int count = getCountDistinctCharacters(word);
            if (count < min) {
                searchWord = word;
                min = count;
            }
        }

        return searchWord;
    }

    private static int getCountDistinctCharacters(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);

        if (chars.length == 0) {
            return 0;
        }

        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                count++;
            }
        }

        return count;
    }

}
