import java.util.Scanner;
public class looops {
   //whileloop,forloop,do while loop
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            System.out.println("While loop iteration: "+i);
            i++;
        }
        
        for(int j=1;j<=5;j++){
            System.out.println("For loop iteration: "+j);
        }
        
        int k=1;
        do{
            System.out.println("Do-While loop iteration: "+k);
            k++;
        }while(k<=5);


        //printing square patterns
        for (int row=1; row <=5; row++) {
            for (int col=1; col <=5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

      //printing right triangle patterns
        for (int row=1; row <=5; row++) {
            for (int col=1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //printing inverted right triangle patterns
        for (int row=5; row >=1; row--) {
            for (int col=1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //reversing the number using while loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  THE  NUMBER THAT YOU WANT TO REVERSE : ");
        int num = sc.nextInt(); 
    
        

        int last_num;
        int reversed_num=0;
        while(num>0){
            last_num=num%10;
            num=num/10;
            reversed_num=reversed_num*10 + last_num;

        }
        System.out.println("the reversed number is :"+reversed_num);

        //checking the number is prime or not using for loop
        System.out.print("Enter a number to check if it is prime or not: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        for(int n=2;n<=number/2;n++){
            if(number%n==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number+" is a prime number.");
        }else{
            System.out.println(number+" is not a prime number.");
        }

    }
}
