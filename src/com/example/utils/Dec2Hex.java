package com.example.utils;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Dec2Hex {

    private static final Logger LOGGER = Logger.getLogger(Dec2Hex.class.getName());

    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length == 0) {
            LOGGER.log(Level.SEVERE, "Error: No input argument provided.");
            return; // Exit the program
        }

        int arg1;
        try {
            // Attempt to parse the argument as an integer
            arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            // If parsing fails, log an error and exit
            LOGGER.log(Level.SEVERE, "Error: Input must be an integer.");
            return; // Exit the program
        }

        // Continue with the conversion if input is valid
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        int num = arg1;
        StringBuilder hexadecimal = new StringBuilder();

     	LOGGER.log(Level.INFO, "Converting the Decimal Value {0} to Hex...", num);

        while (num != 0) {
            rem = num % 16;
            hexadecimal.insert(0, ch[rem]);
            num = num / 16;
        }

        LOGGER.info("Hexadecimal representation is: " + hexadecimal);
    }
}

