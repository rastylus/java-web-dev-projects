package org.launchcode;

public class HelloMethods {

    public static void main(String[] args) {
        String message = getMessage("fr");
        System.out.println(message);
    }

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else {
            return "Hello, World!";
        }
    }

}