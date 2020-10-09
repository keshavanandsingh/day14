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
		System.out.println("tree size is " + treeSize);

		Assert.assertEquals(3, treeSize);
	}

	@Test
	public void given13NumbersWhenAddedToBinaryTreeShouldReturnSize13() {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(60);
		binarySearchTree.add(95);
		binarySearchTree.add(11);
		binarySearchTree.add(65);
		binarySearchTree.add(3);
		binarySearchTree.add(16);
		binarySearchTree.add(63);
		binarySearchTree.add(67);

		int treeSize = binarySearchTree.getSize();
		System.out.println("tree size is " + treeSize);

		Assert.assertEquals(13, treeSize);
	}

	@Test
	public void givenANumberWhenSearchedInBinaryTreeShouldReturnTrue() {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(60);
		binarySearchTree.add(95);
		binarySearchTree.add(11);
		binarySearchTree.add(65);
		binarySearchTree.add(3);
		binarySearchTree.add(16);
		binarySearchTree.add(63);
		binarySearchTree.add(67);

		boolean searchNode = binarySearchTree.search(63);

		Assert.assertTrue(searchNode);
	}
}
