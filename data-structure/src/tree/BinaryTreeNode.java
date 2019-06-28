package tree;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/6/10 19:12
 * @Description: 二叉树节点
 */
public class BinaryTreeNode<T> {
    private T data;
    private BinaryTreeNode<T> leftChild;
    private BinaryTreeNode<T> rightChild;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }
}
