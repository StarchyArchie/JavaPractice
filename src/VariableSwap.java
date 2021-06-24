/**
 * Vishal Nigam
 * 8/29/19
 */
import java.util.Scanner;

public class VariableSwap {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        swap(a,b);

    }
    public static void swap (int a, int b){
        a = a+b;
        b = b-a;
        if(b<0){
            b=b*-1;
        }
        a=a-b;
        System.out.print("a = "+a+", b = "+b);
    }
}
/*
1
2
1+2 = 3
2-3=-1
|-1|=1
3-1=2
*/