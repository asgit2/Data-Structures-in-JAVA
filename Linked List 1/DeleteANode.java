
public class DeleteANode {

public static int length(LinkedListNode<Integer> head) {
		
		int l=0;
		while(head!=null) {
			l++;
			head=head.next;
		}
		return l;
		
	}

public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }

public static LinkedListNode<Integer> delete(LinkedListNode<Integer> head,int index){
		
		if(head==null) {
			return head;
		}
		if(index>=length(head)) {
			return head;
		}
		if(index==0) {
			return head.next;
		}
		int i=1;
		LinkedListNode<Integer> curr=head,prev=null;
		while(i<=index) {
			prev=curr;
			curr=curr.next;
			i++;
		}
		prev.next=curr.next;
		return head;
		
		
	}
}
