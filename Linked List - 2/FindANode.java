// Find a node in LL (recursive)

// Given a singly linked list of integers and an integer n, find and return the index for the first occurrence of 'n' in the linked list. -1 otherwise.
// Follow a recursive approach to solve this.

//--------------------------CODE-------------------------------------------------------


public class FindANode {
	
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
         if(head==null){
            return -1;
        }
        if(head.data==n){
            return 0;
        }
        int smallAns= findNodeRec(head.next,n);
        if(smallAns==-1){
            return -1;
        }
        return 1+ smallAns;
	}

}
