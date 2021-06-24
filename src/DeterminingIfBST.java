import java.util.Scanner;

/**
 * Vishal Nigam
 * 11/5/19
 */
public class DeterminingIfBST {
    static boolean bst = true;
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        BinaryTreeNode<Integer> root = BinaryTreeUtility.readBinaryTreeFromText(input);
        traverse(root);
        if(bst){
            System.out.println("The tree IS a binary search tree.");
        }
    }
    public static void traverse(BinaryTreeNode<Integer> node){
        if (node!=null){
            if(node.getLeftChild()!=null&&node.getLeftChild().getData()>node.getData()){
                notTree();
            }
            if(node.getRightChild()!=null&&node.getRightChild().getData()<node.getData()){
                notTree();
            }
            if(node.getLeftChild()==null){
                if(node.getRightChild()!=null){
                    if(node.getRightChild().getRightChild()!=null){
                        notTree();
                    }
                    if(node.getRightChild().getLeftChild()!=null){
                        notTree();
                    }
                }
            }
            if(node.getRightChild()==null){
                if(node.getLeftChild()!=null){
                    if(node.getLeftChild().getRightChild()!=null){
                        notTree();
                    }
                    if(node.getLeftChild().getLeftChild()!=null){
                        notTree();
                    }
                }
            }
            traverse(node.getLeftChild());
            traverse(node.getRightChild());
        }

    }
    public static void notTree(){
        if(bst) {
            bst = false;
            System.out.println("The tree IS NOT a binary search tree.");
        }
    }
    /*
    Time complexity: O(n) because it passes over the whole tree once and makes a static number of comparisons each step.
    Space Complexity O(1) No extra space used aside from a single boolean value.
     */
}
