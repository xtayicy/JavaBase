
public class NodeTest{
	public static void main(String[] args) {
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		
		one.next = two;
		two.next = three;
		three.next = four;
		
		print(one);
		
		print(reverse(one));
	}
	
	public static Node reverse(Node node){
		Node head = new Node();
		Node previous = null;
		
		while(node != null){
			Node temp = new Node(node.val);
			head.next = temp;
			
			if(previous != null){
				head.next.next = previous;
			}
			
			previous = head.next;
			node = node.next;
		}
		
		return head.next;
	}
	
	
	public static void print(Node node){
		while(node != null){
			System.out.println(node.val);
			node = node.next;
		}
	}
}

class Node{
	int val;
	Node next;
	
	public Node(){
		this.val = 0;
	}
	
	public Node(int val){
		this.val = val;
	}
}