package homework;

public class AVLTree 
{
	Node root;
    int size;
	
	//constructor
	AVLTree()
	{
		this.root = null;
		this.size = 0;
	}
	
	Node root()
	{
		return root;
	}
	
	boolean isEmpty()
	{
		if(root == null)
			return true;
		else
			return false;
	}
	
	int size()
	{
		return this.size;
	}
	
	//inserts an element x into the tree
	void insert(Node x, Node z)
	{
		this.size++; //increase the size variable every time a node is added
		if(x.value > z.value)
		{
			if(x.hasLeft())
				insert(x.leftChild, z);
			else
				x.leftChild = z;
		}
		else if(x.value < z.value)
		{
			if(x.hasRight())
				insert(x.rightChild, z);
			else
				x.rightChild = z;
		}
	}
	
	//returns true if a node containing element x is found else false
	boolean search(int x)
	{
		Node currentNode = root;
		while(currentNode!=null)
		{
			if(x > currentNode.value)
				currentNode = currentNode.rightChild;
			else if(x < currentNode.value)
				currentNode = currentNode.leftChild;
			else if(x == currentNode.value)
				return true;
		}
		return false;
	}
	
	static Node min(Node start)
	{
		
	}
	//returns successor of element with the smallest key greater than i
	Node successor(Node x, int i)
	{
		Node y;
		if(x.hasRight())
			return min(x.rightChild);
		y = x.parent;
		while(y == y.rightChild && x == y.rightChild)
		{ x=y; y=y.parent;}
		return y;
		
	}
	
	//returns the element containing the ith smallest key
	Node select(int i)
	{
		
	}
	
	//in order traversal
	int rank()
	{
		
	}
	
	//check to see if the tree is balanced
	static boolean balanced()
	{
		//for it not to be balanced a tree cant have height more than 
		//1 on either side
		
	}
	
	//balance the tree if it's not already
	static void balance()
	{
		
	}
	
	public static void main(String[] args)
	{
		
	}

}
