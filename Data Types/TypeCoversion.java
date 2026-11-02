public class TypeCoversion {
    
    public static void main(String[] args) {
        // Implicit Type Conversion (Widening)
        int num1 = 10;
        System.out.println("Original int value: " + num1);
        double num2 = num1; // int to double
        System.out.println("Implicit Type Conversion: " + num2);

        // Explicit Type Conversion (Narrowing)
        double num3 = 9.78;
        int num4 = (int) num3; // double to int
        System.out.println("Explicit Type Conversion: " + num4);
    }
    
}
