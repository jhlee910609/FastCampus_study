package djfklajl;

public class LinkedList<T> {
	
	// 길이를 늘리고, 줄이고 유연함.
	// 선형 리스트와 다르게 첫 번째 노드만 알면 됨.

	Node<T> head;
	int length;
	
	// 양방향일 때는 꼬리 값이 필요함.
	// Node<T> tail;
	
	public void add(int index, T data){
		if(index<1){
			Node<T> temp = new Node<T>(data);
			temp.setNext(head);
			return;
		}
		
		Node<T> before = get(index - 1);
		Node<T> current = before.getNext();
		before.setNext(new Node<T> data);
		before.getNext().setNext(current.getNext());
	}
	
	public Node<T> get(int index){
		Node<T> temp = head;
		for(int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp;
	}	
	
	public void remove(int index) {
		if(index < 1) {
			head = head.getNext();
			return;
		} else if (index == length -1) {
			get(index - 1).setNext(null);
			return;
		}
	}

	class Node<P> {
		private P value;
		private Node<P> next;

		public P getValue() {
			return value;
		}

		public void setValue(P value) {
			this.value = value;
		}

		public Node<P> getNext() {
			return next;
		}

		public void setNext(P data) {
			this.next = data;
		}
	}
}
