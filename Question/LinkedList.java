class LinkedList
{
	Node head;
	static int count=0;

	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next = null;
		}
	}
	
	public void display()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	
	
	public void insert(int new_data)
	{
		Node n = head;
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		head = new_node;
		count++;
	}
	
	
		
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		
		
		l.insert(6);
		l.insert(5);
		l.insert(4);
		l.insert(3);
		l.insert(2);
		l.insert(1);
		
		System.out.println("Before : ");
		l.display();
		
		l.swap(1,2);
		l.swap(3,4);
		l.swap(5,6);
		
		System.out.println("After : ");
		l.display();
		
	}



	private void swap(int n, int m) {
		
		if(n == m)
			return;
		
		Node n1 = null;
		Node n2 = head;
		while(n2!=null && n2.data!=n) {
			n1 = n2;
			n2 = n2.next;
		}
		
		Node m1 = null;
		Node m2 = head;
		while(m2!=null && m2.data!=m) {
			m1 = m2;
			m2 = m2.next;
		}
		
		if(n2==null || m2==null) {
			return;
		}
		
		if(n1!=null) {
			n1.next = m2;
		}else {
			head = m2;
		}
		
		if(m1!=null) {
			m1.next = n2;
		}else {
			head = n2;
		}
		
		Node temp = n2.next;
		n2.next = m2.next;
		m2.next = temp;
	}
}

