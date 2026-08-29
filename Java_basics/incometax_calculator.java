import java.util.Scanner;

public class incometax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = sc.nextDouble();
        double taxrate = 0.0;
        if(income<500000){
            taxrate=0.0;
        }else if (income<=1200000 && income>=500000){
             taxrate=0.2;


        }else if (income>120000){
            taxrate=0.3;

        }
    
        double tax = income * taxrate; // Calculate tax
        System.out.println("Income Tax: " + tax);
        sc.close();
    }
}
