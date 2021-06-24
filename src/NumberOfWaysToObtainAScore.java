import java.util.ArrayList;
import java.util.Scanner;

/**
 * Vishal Nigam
 * 11/21/19
 */
public class NumberOfWaysToObtainAScore {
    static int count = 0;
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int score = input.nextInt();
        input.nextLine();
        String nums = input.nextLine();
        String[]numsarray = nums.split(" ");
        ArrayList<Integer> pointsArray = new ArrayList<Integer>(numsarray.length);
        for(int i=0; i<numsarray.length;i++){
            pointsArray.add(Integer.parseInt(numsarray[i]));
        }
        counter(pointsArray,score);
        System.out.println(count);
    }

    public static boolean noDuplicates(ArrayList<Integer> arr){
        for(int i=1; i<arr.size();i++)
        {
            if(arr.get(i-1)>arr.get(i))
                return false;
        }
        return true;
    }
    static void sumCount(ArrayList<Integer> numbers, int total, ArrayList<Integer> part)
    {
        int s = 0;
        if (!(noDuplicates(part))){
            return;
        }
        for (int x : part)
            s += x;
        if (s == total)
            count++;
        if (s >= total)
            return;
        for (int i = 0; i < numbers.size(); i++)
        {
            int n = numbers.get(i);
            ArrayList<Integer> partial_rec = new ArrayList<Integer>(part);
            partial_rec.add(n);
            sumCount(numbers, total, partial_rec);
        }

    }

    static void counter(ArrayList<Integer> numbers, int target)
    {
        sumCount(numbers, target, new ArrayList<Integer>());
    }
    /*
     Time Complexity: O(n) because the program has to go through all combinations that equal the score, with a check to stop any repeats from processing
     n time to translate the input from an array to an arraylist but it ends up at O(2n) or just O(n)
     Space Complexity: O(m+n) where m is the number of point combinations and n is the number of point possibilities, all of which are saved into arraylists.
     */

}
