import java.util.ArrayList;
import java.util.Scanner;

/**
 * Vishal Nigam
 * 10/8/19
 */
public class SearchingForPrefixes {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();
        String sentence = input.nextLine();
        String[]stringsarray = sentence.split(" ");
        ArrayList<String> stringsList = new ArrayList<>(1);
        int pointer = 0;
        for(int i=0;i<stringsarray.length;i++) {
            for (int k = 0; k < stringsarray[i].length(); k++) {
                pointer=0;
                if (search.charAt(pointer) == stringsarray[i].charAt(k)) {
                    if (search.length()==1) {
                        if (Character.isAlphabetic(stringsarray[i].charAt(1))) {
                            stringsList.add(stringsarray[i]);
                        }
                    }
                    else {
                        pointer++;
                        for (int j = pointer; j < search.length(); j++) {
                            if (pointer <= search.length()) {
                                if (search.charAt(pointer) == stringsarray[i].charAt(j)) {
                                    pointer++;
                                    if (pointer == search.length()) {
                                        if (Character.isAlphabetic(stringsarray[i].charAt(j + 1))) {
                                            stringsList.add(stringsarray[i]);
                                        } else {
                                            pointer = 0;
                                        }
                                    }
                                } else {
                                    pointer = 0;
                                }
                            }
                        }
                    }
                }
                else{
                    k+=stringsarray[i].length();
                }
            }
        }
        if(stringsList.isEmpty()){
            System.out.println("***A word containing the given prefix was not found.***");
        }
        else {
            for (int s = 0; s < stringsList.size(); s++) {
                System.out.println(stringsList.get(s));
            }
        }
    }
}
