import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/24/19
 */
public class ReplacingRightmostZeroesWithOnes {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        StringBuilder binary = new StringBuilder();
        int in = input.nextInt();
        if (in == 0) {
            System.out.println(0);
        } else {
            while (Math.abs(in) > 0) {
                binary.insert(0, Math.abs(in) % 2);
                in = in / 2;
            }
            //System.out.println(binary);
            int lastOne = binary.lastIndexOf("1");
            //System.out.println(lastOne + " " + binary.length());
            int length = binary.length();
            for (int i = lastOne; i < length; i++) {
                binary.replace(i, length, "1");
            }
            String j = binary.toString();
            //System.out.println(j);
            double out = Double.parseDouble(j);

            int output = 0;
            for (int i = 0; i < binary.length(); i++) {
                int temp = (int) out % 10;
                output += temp * Math.pow(2, i);
                //System.out.println(output);
                out = out / 10;
            }
            System.out.println(output);
        }
    }
}
//x=(input-1)|input; System.out.println(x);