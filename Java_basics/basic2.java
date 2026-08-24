public class basic2 {
    public static void main(String[] args)  {
        System.out.print("hello world!!"); //no default next line
        System.out.println("Same line but next statement on next line");  // default next line
        System.out.println("Now on the next line");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        // Variables in  java
        int a=10;
        int b=20;
        System.out.println("Sum of a and b is: "+(a+b));
        a=b;
        System.out.println("Value of a is: "+a);
        

        /*
         TWO types of Datatype in java 

            1. Primitive Datatype - byte,short,char,int,long,float,double,boolean   
            2. Non-Primitive Datatype - string, array, class, interface, object, etc.   

        
        */  
         
         byte d=8;
         System.out.println("Value of b is: "+d);
         char ch = 'a'; // default value of char is null
         System.out.println("Value of ch is: "+ch); // default value of char is null
         boolean var = false;
        //  float price=10.5f;
         //long, double, short

         short n=240;
        //  System.out.println(ch+n+price);
        // float res = (float)(ch+n+price);
        // System.out.println("Result is: "+res);
        byte x=10;
        byte y=20;
        int z=x+y;
        byte res = (byte)(x+y);
        System.out.println("Result is: "+res);

    }   

    
}
