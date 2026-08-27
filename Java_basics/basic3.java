public class basic3 {
    public static void main(String[] args) {
        byte b = 8; // only 256 numbers can be stored in byte data type
        System.out.println("Value of b is: " + b);

        char ch = 'a'; // default value of char is '\u0000' (the null character), not the reference
                       // 'null'
        System.out.println("Value of ch is: " + ch);

        boolean var = false;

        float price = 10.5f;
        System.out.println("Value of price is: " + price);

        // long, double, short
        long l = 1000000L; // big integer value
        System.out.println("Value of l is: " + l);

        short n = 240;
        System.out.println("Value of n is: " + n);

        double d = 10.5; // default value of double is 0.0, for big floats
        System.out.println("Value of d is: " + d);
    }
}