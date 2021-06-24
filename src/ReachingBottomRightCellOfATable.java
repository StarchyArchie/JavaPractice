import java.util.Scanner;

/**
 * Vishal Nigam
 * 11/21/19
 */
public class ReachingBottomRightCellOfATable {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
//        if(row==1||column==1){
//            System.out.println(1);
//        }
        int table[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            table[i][0] = 1;
        }
        for (int j = 0; j < column; j++) {
            table[0][j] = 1;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                table[i][j] = table[i - 1][j] + table[i][j - 1];
            }
        }
       System.out.println(table[row - 1][column - 1]);
    }
    /*
    Time complexity: O(rows*columns) or O(mn) have to traverse each row in the table for all possibilities
    taking n time and do it m times for each column
    Space complexity: O(mn) since we have to save the entire 2 dimensional table
     */
}

