import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/2/19
 */
public class FibonacciPrinter {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int starter = 0;
        int starter2 = 1;
        for(int i=0;i<number;i++){
            System.out.print(starter+" ");
            int sum = starter + starter2;
            starter = starter2;
            starter2 = sum;
        }
    }
}
