package com.tms.strings.mandatory_tasks.task_4;

import java.util.Scanner;

/**
 * Task:
 *
 * An arbitrary string is given.
 * Print a new line to the console, which duplicates each letter from the initial line.
 * For example, "Hello" -> "HHeelllloo".
 */

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();

        char[] chars = new char[string.length() * 2];
        for (int i = 0, j = 0; i < string.length(); i++, j++) {
            chars[j++] = string.charAt(i);
            chars[j] = string.charAt(i);
        }

        System.out.println(String.valueOf(chars));
    }

}
