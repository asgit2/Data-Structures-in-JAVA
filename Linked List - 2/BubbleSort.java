// Bubble Sort (Iterative) LinkedList
// Given a singly linked list of integers, sort it using 'Bubble Sort.' 
// 1 <= t <= 10^2
// 0 <= M <= 10^5
// Where M is the size of the singly linked list.

// Time Limit: 1sec
// Sample Input 1 :

// 1
// 10 9 8 7 6 5 4 3 -1

// Sample Output 1 :

//  3 4 5 6 7 8 9 10 
//--------------------------CODE-------------------------------------------------------


public class BubbleSort {

	public static int length(LinkedListNode<Integer> head){

		int l=0;
		while(head!=null){
			l++;
			head=head.next;
		}
		return l;
	}




	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
		//Write your code here
		LinkedListNode<Integer>	orginalHead= head;
		int n=length(head);
		for(int i=0;i<n-1;i++){
			LinkedListNode<Integer> prev=null,curr=orginalHead;
			for(int j=0;j<n-i-1;j++){                        
				if(curr.data <=curr.next.data){

					prev=curr;
					curr=curr.next;

				}
				else{

					if(prev==null){

						LinkedListNode<Integer> curr2= curr.next; 
						LinkedListNode<Integer>  temp= curr2.next;
						curr2.next= curr;
						curr.next=temp;
						prev=curr2;
						orginalHead= curr2;

					}
					else{
						LinkedListNode<Integer> curr2= curr.next;
						LinkedListNode<Integer>  temp= curr2.next;
						prev.next=curr2;
						curr2.next=curr;
						curr.next=temp;
						prev= curr2;
					}


				}

			}

		}
		return orginalHead;


	}

}
