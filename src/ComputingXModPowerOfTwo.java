import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/24/19
 */
public class ComputingXModPowerOfTwo {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int divisor = input.nextInt();
        int mod = input.nextInt();
        int div,mult,out;
        div = divisor / mod;
        mult = div * mod;
        out = divisor - mult;
        System.out.println(out);
    }
}
/*
 divisor&(mod-1) -> only works for powers of 2
 */