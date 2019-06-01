class LinkedListCreation{
	static class Node{
		int data;
		Node next;
		Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
	}
	public static void main(String[] args){
		Node fourthNode = new Node(4, null);	  // Tail
		Node thirdNode = new Node(3, fourthNode);
		Node secondNode = new Node(2, thirdNode);
		Node firstNode = new Node(1, secondNode); // Head
	}
}


