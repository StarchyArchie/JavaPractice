import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/19/19
 */
public class BoomerAtGiftShop {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int numlines = input.nextInt();
        input.nextLine();
        for(int i=0;i<numlines;i++){
            double cost = 0.0;
            double cash = 0.0;
            String line = input.nextLine();
            String[] numsarray = line.split(" ");
            int numItems = Integer.parseInt(numsarray[0]);
            for(int j=1;j<numsarray.length-2;j+=2) {
                double numObj = Double.parseDouble(numsarray[j]);
                double objCost = Double.parseDouble(numsarray[j+1]);
                cost+=numObj*objCost;
            }
            cash = Double.parseDouble(numsarray[numsarray.length-1]);
            if(cash<cost){
                System.out.println("BOOMER NEEDS MORE MONEY");
            }
            else if(cash==cost){
                System.out.println("BOOMER HAS THE EXACT AMOUNT HE NEEDS");
            }
            else if(cash>cost){
                System.out.println("BOOMER HAS MORE THAN ENOUGH");
            }
        }
    }
}
