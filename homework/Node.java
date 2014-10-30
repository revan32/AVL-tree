package homework;

public class Node 
{
	Node parent;
	Node leftChild;
	Node rightChild;
	int value;
	int height;
	
	Node()
	{
		this.parent = null;
		this.leftChild = null;
		this.rightChild = null;
		this.value = 0;
		int counter = 0;
		while(parent != null)
		{
			parent = parent.parent;
			counter++;
		}
		this.height = counter;
	}
	Node(Node parent, Node leftChild, Node rightChild, int value)
	{
		this.parent = parent;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.value = value;
	}
	
	boolean isInternal()
	{
		if(this.leftChild!=null || this.rightChild!=null)
			return true;
		else
			return false;
	}
	
	boolean isExternal()
	{
		if(this.leftChild==null && this.rightChild==null)
			return true;
		else
			return false;
	}
	
	boolean isRoot()
	{
		if(parent == null)
			return true;
		else
			return false;
	}
	
	boolean hasLeft()
	{
		if(this.leftChild == null)
			return false;
		else 
			return true;
	}
	
	boolean hasRight()
	{
		if(this.rightChild == null)
			return false;
		else 
			return true;
	}
	
	Node left()
	{
		return this.leftChild;
	}
	
	Node right()
	{
		return this.rightChild;
	}
	
}
