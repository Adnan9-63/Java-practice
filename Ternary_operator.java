import java.util.*;

public class Ternary_operator {


    /*
    variable = (condition) ? expressionTrue : expressionFalse;
    boolean LARGER = (a > b) ? true : false;
    
    */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b; // Ternary operator to find the maximum of a and b
        System.out.println("Maximum value is: " + max);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks will tell you ,you are pass or   fail: ");
        int marks = sc.nextInt();
        String result = (marks >= 40) ? "Pass" : "Fail"; // Ternary operator to check if marks are greater than or equal to 40
        System.out.println("You are: " + result);
        sc.close();
    }
    
}
