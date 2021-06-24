import java.util.Scanner;
import java.util.ArrayList;
/**
 * Vishal Nigam
 * 9/9/19
 */
public class RockClimbing {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> output = new ArrayList<String>();
        int maxHeight = 0;
        int totalAscent = 0;
        int endHeight = 0;
        int number = input.nextInt();
        input.nextLine();
        for(int i=0;i<number;i++) {
            String nums = input.nextLine();
            String[] numsarray = nums.split(" ");
            int[] climb = new int[numsarray.length];
            for (int y = 0; y < numsarray.length; y++) {
                climb[y] = Integer.parseInt(numsarray[y]);
            }
            for (int j = 0; j < climb.length; j++) {
                endHeight = climb[j]+endHeight;
                if(climb[j]>0){
                    totalAscent = totalAscent+climb[j];
                }
                if(endHeight>maxHeight){
                    maxHeight=endHeight;
                }
                if(endHeight<0){
                    endHeight = 0;
                }
            }
            //Highest point, Ending height, Total climbing
            output.add(i,maxHeight+" "+endHeight+" "+totalAscent);
            maxHeight=0;
            endHeight=0;
            totalAscent=0;
        }
        for (int i = 0; i < output.size(); i++)
            System.out.println(output.get(i));
    }
}
