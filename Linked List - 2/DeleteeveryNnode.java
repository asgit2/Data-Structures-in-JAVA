// Delete every N nodes 
// You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. Continue the same until the end of the linked list.
// To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.


public class DeleteeveryNnode {

	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int m, int n) {
         if(m==0) {
	            return null;
	        }
	        LinkedListNode<Integer> orginal=head;
	        LinkedListNode<Integer> temp1=head,temp2=head;
	        while(head!=null) {
	            temp1=head;
	            for(int i=1;i<m && temp1!=null;i++) {
	                temp1=temp1.next;
	            }
	            if(temp1!=null) {
	                temp2=temp1.next;
	            }
	            for(int i=1;i<n && temp2!=null;i++) {
	                temp2=temp2.next;
	            }
	            if(temp2!=null) {
	                temp2=temp2.next;
	            }
	            if(temp1!=null)
	                temp1.next=temp2;
	            head=temp2;



	        }
	        return orginal;
	}

}
