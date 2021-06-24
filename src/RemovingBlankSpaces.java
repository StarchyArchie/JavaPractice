import java.util.Scanner;

/**
 * Vishal Nigam
 * 10/8/19
 */
public class RemovingBlankSpaces {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int numLines = input.nextInt();
        input.nextLine();
        for (int j = 0; j < numLines; j++) {
            String sentence = input.nextLine();
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < sentence.length(); i++) {
                output.append(sentence.charAt(i));
                if (sentence.charAt(i) == ' ') {
                    while (sentence.charAt(i + 1) == ' ') {
                        i++;
                    }
                }
            }
            System.out.println(output);
        }
    }
}
