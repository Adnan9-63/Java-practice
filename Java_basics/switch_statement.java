import java.util.Scanner;
public class switch_statement {
    /*
    switch (expression) {
        case value1:
            // code block
            break;
        case value2:
            // code block
            break;
        default:
            // code block
    }
    */
   static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number: ");
   int number = sc.nextInt();
   switch (number) {
        case 1:
            System.out.println("Number is 1");
            break;
        case 2:
            System.out.println("Number is 2");
            break;
        case 3:
            System.out.println("Number is 3");
            break;
        default:
            System.out.println("Number is not 1, 2 or 3 and it is: "+number);
    }
    
}
}