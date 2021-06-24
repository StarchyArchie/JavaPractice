import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/17/19
 *
 * << left shift - Drops first bit and add an extra zero to the end, >> right shift looks at leftmost bit,
 * if it's a zero insert zeroes, if it's a one insert ones.
 *
 */
public class CharToBinary {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input character: ");
        String start = input.nextLine();
        char symbol = start.charAt(0);
        System.out.println(Integer.toBinaryString(symbol));
        System.out.println("Input integer: ");
        int num = input.nextInt();
        System.out.println(numOnes(num));
    }
    public static int numOnes(int i){
        int counter = 0;
        while(i!=0){
            if(i%2==1){
                counter++;
            }
            i=i>>>1;//Shift i one bit to the right.
        }
        return counter;
    }
    public static int numOnesAlt(int i){
        int counter = 0;
        while(i!=0){
            counter+=i&1;
            i=i>>>1;//Shift i one bit to the right.
        }
        return counter;
    }
    public static int numOnesEfficientAlt(int i){
        int counter = 0;
        while(i!=0){
            counter++;
            i=i&(i-1);
        }
        return counter;
    }
}
