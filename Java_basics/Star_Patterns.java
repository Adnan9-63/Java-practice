public class Star_Patterns {
    
    //print inverted start pattern
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    //print star pattern
     for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    // print half pyramid pattern
    int r=5;
    for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
    }

    //print character pattern
    char ch = 'A';
    for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            
            System.out.println();
        }   

    }
}
