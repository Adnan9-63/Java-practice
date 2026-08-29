import java.util.*;

public class basic3 {
    public static void main(String[] args) {
        byte b = 8; // 1 byte, only 256 numbers [-128 to 127] can be stored in byte data type
        System.out.println("Value of b is: " + b);

        char ch = 'a'; // default value of char is '\u0000' (the null character), not the reference
                       // 2 bytes ['a'to 'z', 'A' to 'Z', '0' to '9', special characters]
        System.out.println("Value of ch is: " + ch);

        boolean var = false; // 1 byte
        int k = 5; // 4 bytes , -2billion to 2 billion, default value of int is 0
        float price = 10.5f;
        System.out.println("Value of price is: " + price);

        // long, double, short
        long l = 1000000L; // big integer value
        System.out.println("Value of l is: " + l);

        short n = 240; // 2 bytes, range from -32,768 to 32,767
        System.out.println("Value of n is: " + n);

        double d = 10.5; // default value of double is 0.0, for big floats
        System.out.println("Value of d is: " + d);

        /*
         * how is our code running in java?
         * 1. Write the code in .java file
         * 2. Compile the code using javac command, it will create .class file
         * 3. Run the code using java command, it will run the .class file
         * 4. JVM will convert the .class file into machine code and run it on the
         * system
         * 5. JVM is platform independent, it can run on any platform , it is a portable
         * language.
         * 
         * Scanner class in java is used to take input from the user.
         * It is a part of java.util package.
         * It is used to read the input from the console.
         * It can read the input of different types like int, float, double, string,
         * etc.
         * 
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // sc.next() will only take input the first word, scc.nextLine() will take the
                                     // whole line as input
        System.out.println("Hello " + name + "!!");
        System.out.print("Enter your age: ");
        int number = sc.nextInt(); // for integer input, sc.nextInt() will take input of integer type
        System.out.println("You entered age is : " + number);
        System.out.print("Enter your price: ");
        float price1 = sc.nextFloat(); // for float input, sc.nextFloat() will take input of float type
        System.out.println("You entered price is : " + price1);
        System.out.print("Enter your double value: ");
        double m = sc.nextDouble(); // for double input, sc.nextDouble() will take input of double type
        System.out.println("You entered: " + m);


        //Area of a circle
        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();
        float area = (float) (3.14 * radius * radius);
        System.out.println("Area of the circle is: " + area);

    }
}