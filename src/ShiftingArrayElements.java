import java.util.ArrayList;
import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/16/19
 */
public class ShiftingArrayElements {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String nums = input.nextLine();
        String[]numsarray = nums.split(" ");
        int shift = input.nextInt();
        ArrayList<Integer> shiftedArray = new ArrayList<>();
        if(shift==0){
            for(int i=0;i<numsarray.length;i++){
                System.out.print(numsarray[i]+ " ");
            }
        }
        if(shift>0&&shift<=nums.length()){
            int destination = shift;
            for(int i=0;i<numsarray.length;i++){
                if(destination+1>numsarray.length){
                    destination = 0;
                }
                shiftedArray.add(Integer.parseInt(numsarray[destination]));
                destination++;
            }
        }
        for(int i=0;i<shiftedArray.size();i++){
            System.out.print(shiftedArray.get(i)+" ");
        }
    }
}
