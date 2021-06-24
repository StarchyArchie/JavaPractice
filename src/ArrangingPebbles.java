import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/16/19
 * w->g->r
 */
public class ArrangingPebbles {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String pebbles = input.nextLine();
        String[]pebbleArray = pebbles.split(" ");
        int pointer = pebbleArray.length-1;
        int count = 0;
        while(count<pointer){
            char x = pebbleArray[count].charAt(0);
            char y = pebbleArray[pointer].charAt(0);
            if(x!='w') {
                if(y=='w'){
                    x ^= y;
                    y ^= x;
                    x ^= y;
                    pebbleArray[count] = String.valueOf(x);
                    pebbleArray[pointer] = String.valueOf(y);
                    count++;
                    pointer--;
                }
                else{
                    pointer--;
                }
            }
            else{
                count++;
            }
        }
        count=0;
        pointer=pebbleArray.length-1;
        while(count<pointer){
            char x = pebbleArray[count].charAt(0);
            char y = pebbleArray[pointer].charAt(0);
            if(x=='r') {
                if(y=='g'){
                    x ^= y;
                    y ^= x;
                    x ^= y;
                    pebbleArray[count] = String.valueOf(x);
                    pebbleArray[pointer] = String.valueOf(y);
                    count++;
                    pointer--;
                }
                else{
                    pointer--;
                }
            }
            else{
                count++;
            }
        }
        for(int i=0;i<pebbleArray.length;i++){
            System.out.print(pebbleArray[i]+" ");
        }
    }
}
