import java.util.Scanner;

/**
 * Vishal Nigam
 * 9/26/19
 */
public class KeywordSearch_CaseInsensitive {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String search = input.nextLine().toUpperCase();
        String sentence = input.nextLine().toUpperCase();
        int count = 0;
        int pointer = 0;
        for(int i=0;i<sentence.length();i++){
            if(search.charAt(pointer)==sentence.charAt(i)){
                pointer++;
                for(int j=pointer;j<search.length();j++){
                    //System.out.println("for loop triggered"+j);
                    if(pointer<=search.length()) {
                        if (search.charAt(pointer) == sentence.charAt(i + j)) {
                            pointer++;
                            //System.out.println("pointer move");
                            if (pointer == search.length()) {
                                //System.out.println("Pointer at end");
                                if (Character.isAlphabetic(sentence.charAt(i + j + 1))) {
                                    //System.out.println("pointer reset");
                                    pointer = 0;
                                }
                                else{
                                    //System.out.println("found one");
                                    count++;
                                    pointer=0;
                                }
                            }
                        }
                        else {
                            pointer = 0;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
