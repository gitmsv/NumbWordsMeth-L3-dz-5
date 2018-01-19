package ua.jvlab.smlnk;

/* returns the number of words in a line of text */

/* @version 1.0.0;
 * @date 2018-01-19;
 * @author "$.m.lnk";
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a string of the words:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        System.out.print("This line contains " + countWords(str) + " words.");
    }

    // this method;
    public static int countWords(String str) {
        String[] txt = str.split("[ ]");
        return txt.length;
    }
}
