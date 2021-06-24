import java.util.Scanner;

/**
 * Vishal Nigam
 * 8/29/19
 */
public class ModifySeqOfNums {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String nums = input.nextLine();
        String[]numsarray = nums.split(" ");
        int[] exec = new int[numsarray.length];
        for(int i = 0; i < numsarray.length; i++) {
            exec[i] = Integer.parseInt(numsarray[i]);
        }
        for(int i=0;i<exec.length;i++){
            if(exec[i]<i){
                exec[i] = 0;
            }
            System.out.print(exec[i]+" ");
        }

    }
}
