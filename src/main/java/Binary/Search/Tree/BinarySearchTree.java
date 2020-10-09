package Binary.Search.Tree;

public class BinarySearchTree<K extends Comparable<K>> {
	private BinarySearchTreeNode<K> rootNode;

	public void add(K key) {
		this.rootNode = this.addNodeRecursively(rootNode, key);

	}

	private BinarySearchTreeNode<K> addNodeRecursively(BinarySearchTreeNode<K> currentNode, K key) {
		if (currentNode == null)
			return new BinarySearchTreeNode<>(key);

		if (key.compareTo(currentNode.key) == 0)
			return currentNode;

		if (key.compareTo(currentNode.key) < 0) {
			currentNode.leftNode = addNodeRecursively(currentNode.leftNode, key);
		}

		else {
			currentNode.rightNode = addNodeRecursively(currentNode.rightNode, key);
		}
		return currentNode;
	}

	public int getSize() {

		return this.getSizeRecursively(rootNode);
	}

	private int getSizeRecursively(BinarySearchTreeNode<K> currentNode) {

		return (currentNode == null) ? 0
				: 1 + this.getSizeRecursively(currentNode.leftNode) + this.getSizeRecursively(currentNode.rightNode);
	}

	public boolean search(K key) {
		return (searchRecursively(rootNode, key) != null) ? true : false;
	}

	private BinarySearchTreeNode<K> searchRecursively(BinarySearchTreeNode<K> currentNode, K key) {

		if (currentNode == null)
			return null;
		else {
			if (key.compareTo(currentNode.key) == 0)
				return currentNode;

			if (key.compareTo(currentNode.key) < 0) {
				return searchRecursively(currentNode.leftNode, key);
			}

			else {
				return searchRecursively(currentNode.rightNode, key);
			}
		}

	}
}
