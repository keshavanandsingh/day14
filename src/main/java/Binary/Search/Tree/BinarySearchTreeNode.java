package Binary.Search.Tree;

public class BinarySearchTreeNode<K extends Comparable<K>> {
	K key;
	BinarySearchTreeNode<K> leftNode;
	BinarySearchTreeNode<K> rightNode;

	public BinarySearchTreeNode(K key) {
		this.key = key;
		this.leftNode = null;
		this.rightNode = null;
	}
}
