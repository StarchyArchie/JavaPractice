import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/5/19
 */
public class DecimalToOctal {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        StringBuilder octal = new StringBuilder();
        if(decimal==0){
            System.out.println(decimal);
        }
        while(decimal>0){
            octal.insert(0,decimal%8);
            decimal = decimal/8;
        }
        System.out.println(octal);
    }
    //Octal base 8, digits -> 8^n...8^2,8^1,8^0
}
