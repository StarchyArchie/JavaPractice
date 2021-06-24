import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/24/19
 */
public class CountNumberOfBits_ANDandShift {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int i=input.nextInt();
        while(i!=0){
            counter+=i&1;
            i=i>>>1;//Shift i one bit to the right.
        }
        System.out.println(counter);
    }
    public static int numOnesAlt(int i){
        int counter = 0;
        while(i!=0){
            if(i%2==1){
                counter++;
            }
            i=i>>>1;//Shift i one bit to the right.
        }
        return counter;
    }
}
