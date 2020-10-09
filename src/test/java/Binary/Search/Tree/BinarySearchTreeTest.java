package Binary.Search.Tree;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSize3() {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);

		int treeSize = binarySearchTree.getSize();
		System.out.println("tree size is "+treeSize);

		Assert.assertEquals(3, treeSize);
	}
}
