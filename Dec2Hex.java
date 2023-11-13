public class Dec2Hex {

    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.err.println("Error: No input argument provided.");
            return; // Exit the program
        }

        int arg1;
        try {
            // Attempt to parse the argument as an integer
            arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            // If parsing fails, print an error and exit
            System.err.println("Error: Input must be an integer.");
            return; // Exit the program
        }

        // Continue with the conversion if input is valid
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        int num = arg1;
        StringBuilder hexadecimal = new StringBuilder();

        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal.insert(0, ch[rem]);
            num = num / 16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}

