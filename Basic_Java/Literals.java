public class Literals {
    public static void main(String[] args) {
        // A literal is a fixed value written directly into the source code. Unlike a
        // variable, a literal's value is exactly what it appears to be and cannot be
        // changed.

        // 1. Integer Literals
        int decimal = 100; // Standard Base 10
        int binary = 0b1100100; // Base 2 (Prefix 0b) -> 100
        int octal = 0144; // Base 8 (Prefix 0) -> 100
        int hex = 0x64; // Base 16 (Prefix 0x)-> 100

        // Large numbers with underscores for readability
        long phone = 987_654_3210L; // Suffix 'L' makes it a long literal

        System.out.println(decimal + ", " + binary + ", " + octal + ", " + hex);
        // All will print 100 because println converts to decimal by default

        // 2. Float Literals
        double standard = 3.14; // Default is double
        // float f = 3.14; // ERROR: Cannot convert double to float
        float f = 3.14f; // CORRECT: Suffix 'f' required

        double scientific = 1.2e3; // 1.2 * 10^3 = 1200.0

        System.out.println("Float value: " + f);
        System.out.println("Scientific: " + scientific);


        // 3. Character & String Literals
        // Character: Single quotes ONLY
        char letter = 'A';
        char unicode = '\u0041'; // Unicode for 'A'
        char newLine = '\n'; // Escape sequence

        System.out.println("letter " + letter);
        System.out.println("unicode " + unicode);

        // String: Double quotes ONLY
        String name = "Dev";
        String empty = "";

        // Memory Note: String Constant Pool
        String s1 = "GLA";
        String s2 = "GLA";
        System.out.println("Is s1 is equal to s2:  " + (s1 == s2)); // true. They point to the same memory location.

        String a1 = "Shobhit";
        String a2 = new String();
        a2 = "Dev";
        System.out.println("Is a1 is equal to a2: " + (a1 == a2)); // True, because a1 and a2 points same literals

        String a3 = new String("Dev");
        System.out.println("Is a1 is equal to a3: " + (a1 == a3)); // False, because a1 is in SCP and a3 is in heap memory


        
    }
}