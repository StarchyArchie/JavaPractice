import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/12/19
 */
public class ArrayPartitioning {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int partition = input.nextInt();
        input.nextLine();
        String nums = input.nextLine();
        String[]numsarray = nums.split(" ");
        int[] partarray = new int[numsarray.length];
        for(int i = 0; i < numsarray.length; i++) {
            partarray[i] = Integer.parseInt(numsarray[i]);
        }
        //Ensure that integers in array which are <= partition come in indexes which are smaller than integers which are >partition
        //Pointers set at position zero and final position in array
        int pointerlow = 0;
        int pointerhigh = partarray.length-1;
        //Loop terminates when pointers meet, meaning the array is properly sorted.
        while(pointerlow<pointerhigh){
            //When low pointer is above partition point, check the high pointer to find a suitable swap partner from the end of the array.
            if(partarray[pointerlow]>partition){
                if(partarray[pointerhigh]<=partition){
                    //Xor swap of variables
                    partarray[pointerlow]^=partarray[pointerhigh];
                    partarray[pointerhigh]^=partarray[pointerlow];
                    partarray[pointerlow]^=partarray[pointerhigh];
                    //increment pointers
                    pointerhigh--;
                    pointerlow++;
                }
                else{
                    //move higher pointer
                    pointerhigh--;
                }
            }
            else{
                //move lower pointer
                pointerlow++;
            }
        }
        for(int i=0;i<partarray.length;i++){
            //Print final array
            System.out.print(partarray[i]+" ");
        }
    }
}
