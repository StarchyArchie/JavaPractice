import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/5/19
 */
public class DecimalToBase15 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        if(decimal==0){
            System.out.println(decimal);
        }
        StringBuilder base = new StringBuilder();
        while(decimal>0){
            if(decimal%15==10){
                base.insert(0, "A");
            }
            else if(decimal%15==11){
                base.insert(0, "B");
            }
            else if(decimal%15==12){
                base.insert(0, "C");
            }
            else if(decimal%15==13){
                base.insert(0, "D");
            }
            else if(decimal%15==14){
                base.insert(0, "E");
            }
            else {
                base.insert(0, decimal % 15);
            }
            decimal = decimal/15;
        }
        System.out.println(base);
    }
}
