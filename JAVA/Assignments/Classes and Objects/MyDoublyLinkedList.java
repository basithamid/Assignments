import java.util.Scanner;
class Node{
	Node prev;
	int data;
	Node next;
	Node(){
		this.prev=null;
		this.next=null;
	}
	Node(Node prev, int data, Node next){
		this.prev=prev;
		this.data=data;
		this.next=next;
	}
}

class MyDoublyLinkedList{

	private static Node head,tail;
	
	public static void addNode(Node newNode){
		if(head==null){
			head=newNode;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
			temp.next.prev=temp;
			tail=temp.next;
		}
	}

	public static void printNodes(){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.data+"\n");
			temp=temp.next;
		}
	}

	public static int countNodes(){
		Node temp = head;
		int count = 0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}

	public static void insertBeginning(){
		if(head==null){
			head=newNode;
		}
	}
	public static void insertNode(int data){
		Node temp = head;
		while(temp.data!=data){
			temp=temp.next;
			if(temp==null){
				System.out.println("Element not found");
			}
			else{
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter data part for new element");
				int newData=scan.nextInt();
				Node newNode=new Node(null,newData,null);
				newNode.next=temp.next;
				temp.next=newNode;
				newNode.prev=temp;
				newNode.next.prev=newNode;

			}
		}
	}

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int data;
		while(true){
			System.out.println("Enter your choice:\n0. Exit\n1. Add Node\n2. Insert Node\n3. Delete Node\n4. Count Nodes\n5. Print Nodes");
			int choice=scan.nextInt();
			switch(choice){
				case 0:
					System.exit(0);
				case 1: 
					System.out.println("Enter Node data:");
					data=scan.nextInt();
					Node newNode=new Node(null,data,null);
					addNode(newNode);
					break;
				case 2:
					System.out.println("Enter element:\n1. At the beginning\n2. In the middle\n3. At the end");
					int ch=scan.nextInt();
					if(ch==1){
						insertBeginning();
					}
					else if(ch==2){
						insertNode();
					}
					else if(ch==3){
						insertEnd();
					}
					System.out.println("Enter data of element after which node has to be inserted:");
					data = scan.nextInt();
					insertNode(data);
					break;
				case 4:
					int count = countNodes();
					System.out.println("Number of nodes = "+count);
					break;
				case 5:
					printNodes();
			}	
		}
	}
}

