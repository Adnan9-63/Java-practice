public class functionns {
    /*
    syntax of function in java:
    return_type function_name(parameters){
        //code to be executed
    }
    
    */
    //formal parameters>>parameters which are used in function definition
    //actual parameters>>parameters which are used in function call
    //call by value>>when we pass the value of variable to function
    //call by reference>>when we pass the address of variable to function

    //factorial of a number using recursion
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int num=5;
        int fact=factorial(num);
        System.out.println("Factorial of "+num+" is: "+fact);
        int n=5;
        int r=2;
        int binomial=binomial_coefficient(n,r);
        System.out.println("Binomial coefficient of "+n+" and "+r+" is: "+binomial);
    }

    //binomial coefficient using only factorial function
    static int binomial_coefficient(int n,int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    
    
    }


}
