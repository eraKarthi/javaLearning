
public class SinglyLinkedList {
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		private ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void display(ListNode head){
		int count = 0;
		while(head != null){
			count++;
			System.out.print(head.data+ "-->");
			head = head.next;
		}
		
		System.out.println(head);
		System.out.println("list length : " + count);
		System.out.println("");
	}

	public static ListNode insertAtPosition(ListNode head,int data,int position){
		
		ListNode newNode = new ListNode(data);
		int count= 1;
		ListNode current = head;
		
		while(count < position-1){
			current = current.next;
			count++;
			}
		newNode.next = current.next;
		current.next = newNode;
		return head;
	}
	
	public static ListNode insertAfter(ListNode previous,int data){
		ListNode newNode = new ListNode(data);
		if (previous == null){
		
		}
		newNode.next = previous.next;
		return previous.next = newNode;
	}
	
	public static ListNode insertAtBegining(ListNode head,int data){
		ListNode newNode = new ListNode(data);
		if (head == null){
			return newNode;
		}
		newNode.next = head;
		return head = newNode;
	}

	public static ListNode insertAtEnd(ListNode head,int data){
		ListNode newNode = new ListNode(data);
		if (head == null){
			return newNode;
		}
	ListNode current = null;
	current = head;
	while(null != current.next){
		current = current.next;
	}
	current.next = newNode;
	return head;
	}
	
	public static ListNode deleteFirstNode(ListNode newHead1){
		
		ListNode temp = newHead1;
		newHead1 = newHead1.next;
		temp.next = null;
		return newHead1;
	}	
	
	public static ListNode deleteLastNode(ListNode newHead1){
		
		ListNode last = newHead1;
		ListNode previousToLast = null;
		
		while (last.next != null){
			previousToLast = last;
			last = last.next;
			}
		previousToLast.next = null;
		return last;
	}
	
	public static ListNode deleteSpecifiedNode(ListNode newHead1, int position){
		
		ListNode current = newHead1;
		ListNode last = null;
		int count = 1;		
		while (count < position - 1){
			current = current.next;
			count++;
			}
		last = current.next;
		current.next = null;
		return last;
	}
	
	public static boolean searchNode(ListNode head, int data){
		
		ListNode current = head;
		while(current != null){
			if(current.data == data){
				return true;
			}
			current = current.next;
		}
			return false;
	}
	
public static ListNode reverseList(ListNode head){
		
ListNode current = head;
ListNode previous = null;
ListNode next = null;

while(current != null){
	next = current.next;
	current.next = previous;
	previous = current;
	current = next;
}
return previous;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		System.out.println("Display a List");
		SinglyLinkedList sLL = new SinglyLinkedList();
		sLL.display(head);
		
			
		/*ListNode newHead2 = SinglyLinkedList.insertAfter(second,999);
		sLL.display(newHead2);*/
		System.out.println("Insert After Specified Position");
		SinglyLinkedList afterSP = new SinglyLinkedList();
		//SinglyLinkedList.insertAfter(second, 20);
		afterSP.insertAfter(second, 20);
		afterSP.display(head);
		
		System.out.println("Insert At Specified Position i.e. @ 3rd position");
		//SinglyLinkedList.insertAtPosition(head, 100, 3);
		SinglyLinkedList atSP = new SinglyLinkedList();
		atSP.insertAfter(second, 20);
		atSP.display(head);
		
		System.out.println("Insert At Begining Of a List");
		ListNode newHead = SinglyLinkedList.insertAtBegining(head,99);
		sLL.display(newHead);
		
		System.out.println("Insert At End Of a List");
		ListNode newHead1 = SinglyLinkedList.insertAtEnd(newHead,999);
		sLL.display(newHead1);
	
		System.out.println("Delete First Node");
		ListNode newHead2 = SinglyLinkedList.deleteFirstNode(newHead1);
		sLL.display(newHead2);
		
		System.out.println("Delete Last Node");
		ListNode last = SinglyLinkedList.deleteLastNode(newHead2);
		sLL.display(last);
		
		//System.out.println(last.data);
		System.out.println("");
		
		System.out.println("Delete Specified Node i.e position 2");
		ListNode last1 = SinglyLinkedList.deleteSpecifiedNode(head,2);
		System.out.println(last1.data);
		System.out.println("");
		
		System.out.println("Search a Node");
		boolean search = SinglyLinkedList.searchNode(head,2);
		System.out.println(search);
		System.out.println("");
	
		System.out.println("Reverse a List");
		
		ListNode rL = SinglyLinkedList.reverseList(newHead2);
		
		sLL.display(rL);
		System.out.println("");
				
	}
}
