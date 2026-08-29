import java.util.Scanner;

public class basic4 {
   /*  Conversion happpens in java when we assign a value of one data type to another data type. 
    There are two types of conversion in java:
    1. Implicit Conversion (Automatic)
    2. Explicit Conversion (Manual)
    byte -> short -> int -> long -> float -> double
    char -> int -> long -> float -> double

    destination data type should be larger than source data type for implicit conversion to happen.
    Explicit conversion is done by type casting.
    Type casting is done by putting the destination data type in parenthesis before the value to be converted.
    */

    public static void main(String[] args) {
        // Implicit Conversion
        int a = 10;
        double b = a; // Implicit conversion from int to double
        System.out.println("Implicit Conversion: " + b);

        // Explicit Conversion
        double c = 9.78;
        int d = (int) c; // Explicit conversion from double to int
        System.out.println("Explicit Conversion: " + d);


        // operators in java
        /*
        Arithmetic Operators (Binary/Unary ..>> pre/post)
        Relational Operators         
        Logical Operators (&&>>logical AND , ||>>logical OR, !>>logical NOT)
        Bitwise Operators
        Assignement Operators
        */

        // CONDITIONAL STATEMENTS

       // LARGEST OF TWO
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter FIRST NUMBER: ");
        int num1 = sc.nextInt(); 
    
        System.out.print("Enter your second number:");
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.println("first number that you enterd is LArger.");

        }else if (num2>num1){
            System.out.println("Second number that you enterd is larger");
        }else{
            System.out.println("Both numbers are equal:");
        }

       
    }
}
