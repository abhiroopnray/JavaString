package com.practice.main;

public class FindMatcher {

    public void findMatch(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        boolean matchFound = false;
        int count = 0;

        for (int i = 0; i < len2; i++) {
            int matchSize = i + len2;
            /*String s = str1.substring(i, matchSize);*/
            if ((str1.substring(i, matchSize).equals(str2)) && matchFound == false) {
                matchFound = true;
                count = count + 1;
                System.out.println("Match found: " + true);
                System.out.println("Matched char: " + str1.charAt(i));
                StringBuilder builder = new StringBuilder(str1);
                builder.replace(i, i,"$"); //Here Builder is used as String is immutable and will create new String changing all the similar values
                /*str1 = str1.replace(str1.charAt(i), '$');*/
                System.out.println("Changed string: " + builder);
                System.out.println("Number of characters needs to be changed: " + count);
                //break;
                //return true;

            }
        }
        //return false;
    }
}
