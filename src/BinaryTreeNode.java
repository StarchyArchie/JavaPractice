/**
 * Vishal Nigam
 * 10/24/19
 */
public class BinaryTreeNode<T> {

        private T data;

        private BinaryTreeNode<T> leftChild, rightChild;

        public BinaryTreeNode(T data) {this.data = data;}

        public T getData() {return data;}

        public void setLeftChild(BinaryTreeNode<T> child) {leftChild = child;}

        public void setRightChild(BinaryTreeNode<T> child) {rightChild = child;}

        public BinaryTreeNode<T> getLeftChild() {return leftChild;}

        public BinaryTreeNode<T> getRightChild() {return rightChild;}

}
