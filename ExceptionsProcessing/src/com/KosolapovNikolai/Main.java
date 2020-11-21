package com.KosolapovNikolai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        /*                       ------------------ Exceptions -------------------
                                 |                                               |
                                 |                                               |
                            CheckedExceptions                          UncheckedExceptions
                        (Required to processing)      (Lack of writing programming. Don't required to processing)
       */

        // UncheckedExceptions:

        // Example 1 (ArithmeticException (divide by zero)):
        System.out.println("Example 1: ");

        /*int x = 1/0;             Without processing.
        System.out.println(x);
        */

        int x;

        try {
            x = 1 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException: " + ae.getMessage());
        }/*finally {     (Optional)
            System.out.println(".");
          }
          */


        //Example 2 (NullPointerException :
        System.out.println("Example 2: ");

        /*Cat cat = null;     Without processing.
        cat.meow();
         */

        Cat cat = null;

        try {
            cat.meow();
        } catch (NullPointerException nullPExc) {
            System.out.println("NullPointerException: " + nullPExc.getMessage());
        }/* finally {     (Optional)
            System.out.println(".");
        }
        */

        // 'throws' in method's signature.
        String[] sounds = {"48413", "!$#$!", "tsssss"};
        /*
        Cat cat1 = new Cat();     Without processing.
        cat.meowFromArray(sounds , 2);
         */

        Cat cat1 = new Cat();

        try {
            cat1.meowFromArray(sounds, 234);
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }/*finally {     (Optional)
            System.out.println(".");
        }*/

        // Several 'catch'

        Cat cat2 = null;
        Cat[] cats = new Cat[2];

        try {
            cat2.meow();
            cats[43446] = cat2;
        } catch (NullPointerException exc) {
            System.out.println("NullPointerException: " + exc.getMessage());
        } catch (ArrayIndexOutOfBoundsException arrExc) {
            System.out.println("ArrayIndexOutOfBoundsException: " + arrExc.getMessage());
        }/*finally {     (Optional)
                System.out.println(".");
        }*/

        // CheckedException:

        // Example 1 (FileNotFoundException):

          /*File file = new File("E://file.txt");      Without processing.
          FileReader fR = new FileReader(file);
           */

        try {
            File file = new File("E://file.txt");
            FileReader fR = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }/*finally {     (Optional)
                System.out.println(".");
        }*/
    }
}


