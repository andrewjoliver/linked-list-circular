import java.util.HashMap;

class LinkedListCreation{
	static class Node{
		int data;
		Node next;
		Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
	}
	public static Boolean isCircular(Node node){
		if (node == null || node.next == null){
			return false;
		}
		HashMap<Node, Integer> myMap = new HashMap<Node, Integer>();
		while (node.next != null){
			if (myMap.containsKey(node)){
				return true;
			}
			myMap.put(node, 0);
			node = node.next;
		}
		return false;
	}
	public static void main(String[] args){
		Node fourthNode = new Node(4, null); // Tail
		Node thirdNode = new Node(3, fourthNode);
		Node secondNode = new Node(2, thirdNode);
		Node firstNode = new Node(1, secondNode); // Head
		fourthNode.next = firstNode;
		System.out.println(isCircular(thirdNode));
	}
}


