package com.tms.strings.mandatory_tasks.task_0.models;

public class DocumentHandler {

    public static String getNumberBlocks(String docNumber) {
        String[] splitDoc = docNumber.split("-");
        return splitDoc[0] + " " + splitDoc[2];
    }

    public static String getDocNumberWithEmptyLiteralBlocks(String docNumber) {
        String[] splitDoc = docNumber.split("-");
        return docNumber.replace(splitDoc[1], "   ").replace(splitDoc[3], "   ");
    }

    public static String getOnlyLettersInLowerCase(String docNumber) {
        String[] splitDoc = docNumber.split("-");
        char[] splitLastBlock = splitDoc[4].toCharArray();
        String onlyLettersString = splitDoc[1] + "/" + splitDoc[3] + "/" + splitLastBlock[1] + "/" + splitLastBlock[3];
        return onlyLettersString.toLowerCase();
    }

    public static String getOnlyLettersInUpperCase(String docNumber) {
        String[] splitDoc = docNumber.split("-");
        char[] splitLastBlock = splitDoc[4].toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(splitDoc[1]).append('/').append(splitDoc[3]).append('/').append(splitLastBlock[1]).append('/').append(splitLastBlock[3]);
        return sb.toString().toUpperCase();
    }

    public static boolean isContainsABC(String docNumber) {
        return docNumber.toLowerCase().contains("abc");
    }

    public static boolean isBeginsWith555(String docNumber) {
        return docNumber.startsWith("555");
    }

    public static boolean isEndsWith1a2b(String docNumber) {
        return docNumber.endsWith("1a2b");
    }

}
