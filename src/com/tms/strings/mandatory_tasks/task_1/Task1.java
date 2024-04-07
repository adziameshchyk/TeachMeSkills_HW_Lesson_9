package com.tms.strings.mandatory_tasks.task_1;

import java.util.Scanner;

/**
 * Task:
 *
 * Given a string of arbitrary length with arbitrary words.
 * Find the shortest word in a line and display it on the screen.
 * Find the longest word in a line and display it on the screen.
 * If there are several such words, then print the last one.
 */

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        String[] wordsInLine = line.split(" ");

        String shortestWord = line;
        for (String word : wordsInLine) {
            if (word.length() <= shortestWord.length()) {
                shortestWord = word;
            }
        }
        System.out.println("Shortest word in a line: " + shortestWord);

        String longestWord = "";
        for (String word : wordsInLine) {
            if (word.length() >= shortestWord.length()) {
                shortestWord = word;
            }
        }
        System.out.println("Longest word in a line: " + shortestWord);
    }

}
