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
		if (node == null || node.next == null || node.next.next == null) {
            return false;
        }
        Node slow = node;
        Node fast = node.next.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
	}
	public static void main(String[] args){
		Node fourthNode = new Node(4, null); // Tail
		Node thirdNode = new Node(3, fourthNode);
		Node secondNode = new Node(2, thirdNode);
		Node firstNode = new Node(1, secondNode); // node
		//fourthNode.next = firstNode;
		System.out.println(isCircular(firstNode));
	}
}


