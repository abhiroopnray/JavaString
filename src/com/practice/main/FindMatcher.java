package com.practice.main;

public class FindMatcher {

    public void findMatch(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        int count = 0;

        for (int i = 0; i < len2; i++) {
            int matcherLength = i + len2;

            if (matcherLength < len1) {
                if ((str1.substring(i, matcherLength).equals(str2))) {
                    count = count + 1; //TODO: Needs to check!

                    System.out.println("Match found: " + true);
                    System.out.println("Matched char: " + str1.charAt(i));
                    //Here Builder is used as String is immutable and will create new String changing all the similar values
                    StringBuilder builder = new StringBuilder(str1);
                    //The end index starts from 1 so 1 is added with i
                    builder.replace(i, i + 1, "$");
                    System.out.println("Changed string: " + builder);
                    System.out.println("Minimum number of characters needs to be changed: " + count);
                }

            }
        }
        if(count == 0){
            System.out.println("No substring matched!");
            System.out.println("Number of characters needs to be changed: " + count);
        }
    }
}
