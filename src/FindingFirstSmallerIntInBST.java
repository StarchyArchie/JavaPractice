import java.util.Scanner;

/**
 * Vishal Nigam
 * 10/31/19
 */
public class FindingFirstSmallerIntInBST {
    static int smaller = -1;
    static boolean canSet = true;
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        BinaryTreeNode<Integer> root = BinaryTreeUtility.readBinaryTreeFromText(input);
        traverse(root, key);
        int small = getSmaller();
        if(small==-1){
            System.out.println("There is no node in the BST whose value is smaller than the given key.");
        }
        else{
            System.out.println(small);
        }
    }
    public static void traverse(BinaryTreeNode<Integer> node, int key){
        if (node!=null){
            //System.out.println("Node value: "+node.getData()+" Key value: "+key);
            if (node.getData()<key){
                //System.out.println(node.getData());
                key = -9999;
                setSmaller(node.getData());
            }
            else if(node.getData()>=key){
                traverse(node.getLeftChild(), key);
                traverse(node.getRightChild(), key);
            }
        }

    }
    public static void setSmaller(int i){
        if(canSet) {
            smaller = i;
            canSet=false;
        }
    }
    public static int getSmaller(){
        return smaller;
    }
    /*
    Time Complexity: O(n) Since the code traverses the tree with number of elements n one time, performing one comparison on each step.
    Space Complexity: O(1) The only extra space used outside of the tree itself are integer and boolean declarations and print statements, which all take a static amount of space.
    */
}
