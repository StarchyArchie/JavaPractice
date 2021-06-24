import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/24/19
 */
public class CountingNumberOfBits_DeletingRightMostOne {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int i=input.nextInt();
        while(i!=0){
            counter++;
            i=i&(i-1);
        }
        System.out.println(counter);
    }
}
