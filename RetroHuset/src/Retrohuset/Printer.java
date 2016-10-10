/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Face
 */
public class Printer {
    public Printer (String string) {
        System.out.println(string);
    }
    public Printer (int integer) {
        System.out.println(integer);
    }
    public Printer (float floatValue) {
        System.out.println(floatValue);
    }
    public Printer (double doubleValue) {
        System.out.println(doubleValue);
    }
    public Printer (String string, Object... args) {
        System.out.printf(string, args);
        String test = String.format(string, args);
        System.out.println(test);
    }
    
}
