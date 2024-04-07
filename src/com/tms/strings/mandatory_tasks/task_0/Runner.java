package com.tms.strings.mandatory_tasks.task_0;

import com.tms.strings.mandatory_tasks.task_0.models.DocumentHandler;

import java.util.Scanner;

/**
 * Task:
 *
 * Write a program with the following functionality:
 * Pass a string as input (we will assume that this is the document number).
 * The document number has the format xxxx-yyy-xxxx-yyy-xyxy, where x is a number and y is a letter.
 * Display the first two blocks of 4 digits on one line.
 * Display the document number, but replace blocks of three letters with (each letter will be replaced with " ").
 * Display only one letter from the document number in the format yyy/yyy/y/y in lowercase.
 * Display the letters from the document number in the format "Letters:yyy/yyy/y/y" in uppercase (implemented using the StringBuilder class).
 * Check whether the document number contains the sequence abc and whether the message contains it or not (and abc and ABC are considered the same sequence).
 * Check if the document number begins with the sequence 555.
 * Check whether the document number ends with the sequence 1a2b.
 * Implement all these methods in a separate class in static methods, which will take as input (input parameter) the string entered as input to the program.
 */

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String docNumber = scanner.nextLine();
        scanner.close();
//        String docNumber = "5551-Hdj-0813-abC-7H3j";

//        Display the first two blocks of 4 digits on one line
        System.out.println(DocumentHandler.getNumberBlocks(docNumber));

//        Display the document number, but replace blocks of three letters with " "(each letter will be replaced with " ")
        System.out.println(DocumentHandler.getDocNumberWithEmptyLiteralBlocks(docNumber));

//        Display only one letter from the document number in the format yyy/yyy/y/y in lowercase
        System.out.println(DocumentHandler.getOnlyLettersInLowerCase(docNumber));

//        Display the letters from the document number in the format "Letters:yyy/yyy/y/y" in uppercase (implemented using the StringBuilder class)
        System.out.println(DocumentHandler.getOnlyLettersInUpperCase(docNumber));

//        Check whether the document number contains the sequence abc and whether the message contains it or not (and abc and ABC are considered the same sequence).
        System.out.println("The document " + (DocumentHandler.isContainsABC(docNumber) ? "contains" : "doesn`t contain") + " the sequence abc.");

//        Check if the document number begins with the sequence 555.
        System.out.println("The document " + (DocumentHandler.isBeginsWith555(docNumber) ? "begins" : "doesn`t begin") + " with the sequence 555.");

//        Check whether the document number ends with the sequence 1a2b.
        System.out.println("The document " + (DocumentHandler.isEndsWith1a2b(docNumber) ? "ends" : "doesn`t end") + " with the sequence 1a2b.");

    }

}
