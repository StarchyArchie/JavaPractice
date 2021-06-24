/**
 * Vishal Nigam
 * 8/29/19
 */
import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        reverse(num);

    }
    public static int reverse(int i){
        int rev = 0;
        while(i!=0){
            int digit = i%10;
            i/=10;
            rev = (rev*10)+digit;
        }
        System.out.println(rev);
        return rev;
    }
}
