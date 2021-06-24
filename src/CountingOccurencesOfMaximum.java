import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/16/19
 */
public class CountingOccurencesOfMaximum {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String nums = input.nextLine();
        String[]numsarray = nums.split(" ");
        int count = 0;
        int max = 0;
        for(int i = 0; i < numsarray.length; i++) {

           if(Integer.parseInt(numsarray[i])>max){
               count=1;
               max = Integer.parseInt(numsarray[i]);
           }
           else if(Integer.parseInt(numsarray[i])==max){
               count++;
           }
        }
        System.out.print(count);
    }
}
