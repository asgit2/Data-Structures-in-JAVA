//  Even after Odd LinkedList

// For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers.
//  The relative order of the odd and even terms should remain unchanged.

//--------------------------CODE-------------------------------------------------------

public class EvenAfterOddLL {

	public static LinkedListNode<Integer> evenAfterOddLL(LinkedListNode<Integer> head){

		LinkedListNode<Integer> headOdd=null,tailOdd=null,headEven=null,tailEven=null;
		while(head!=null) {

			if(head.data%2==0) {

				if(headEven==null) {
					headEven=head;
					tailEven=head;
				}else {
					tailEven.next=head;
					tailEven=head;
				}


			}
			else {

				if(headOdd==null) {
					headOdd=head;
					tailOdd=head;
				}else {
					tailOdd.next=head;
					tailOdd=head;
				}

			}
			head=head.next;

		}
		if(headOdd==null) {
			return headEven;
		}
		if(headEven==null) {
			return headOdd;
		}
		tailOdd.next=headEven;
		tailEven.next=null;
		return headOdd;

	}
	public static void main(String[] args) {

		LinkedListNode<Integer> head=LinkedListNode.takeInput();
		head=evenAfterOddLL(head);
		LinkedListNode.print(head);
		
	}
}
