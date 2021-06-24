import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/5/19
 */
public class DecimalToNumInArbitraryBase {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        int base = input.nextInt();
        if(decimal==0){
            System.out.println(decimal);
        }
        StringBuilder nBase = new StringBuilder();
        while(decimal>0){
            nBase.insert(0,decimal%base);
            decimal = decimal/base;
        }
        System.out.println(nBase);
    }
}
