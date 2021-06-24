import java.util.Scanner;

/**
 * Vishal Nigam
 * 8/27/19
 */
//Modify it to take two inputs, the first for the number of integers to run on and the second for said integers.
//Might want to use a string then deconstruct into integers.
public class FizzBuzzSeveralInts {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //System.out.println("Input Integer: ");
        int number = input.nextInt();
        input.nextLine();
        //System.out.println("Input Integer Sequence: ");
        //Scanner input2 = new Scanner(System.in);
        String nums = input.nextLine();
        String[]numsarray = nums.split(" ");
        int[] exec = new int[numsarray.length];
        for(int i = 0; i < numsarray.length; i++) {
            exec[i] = Integer.parseInt(numsarray[i]);
        }
        for(int j = 0; j<number; j++){
            for(int i=1;i<=exec[j];i++){
                if(i%3==0&&i%5==0){
                    System.out.println("FizzBuzz");
                }
                else if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                else{System.out.println(i);}
            }
        }
        input.close();
        //input2.close();
    }
}
