//!BaekJoon #2346//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SingleLinkedList {
	public static class Node<Integer>{
		int data;
		int num_order;
		Node<Integer> prev;
		Node<Integer> next;
		
		Node(int data, int num_order){
			this.data=data;
			this.num_order=num_order;
			this.prev=null;
			this.next=null;
		}
		
	// 입력받은 수를 헤더 노드부터 시작해 노드로 연결- add() 메소드
		public void add(int data, int order) {
			Node<Integer> balloon= this;
			
			while(balloon.next != null)
				balloon = balloon.next;
			balloon.next= new Node<>(data, order);
			if(balloon.prev== null)
				balloon.prev= balloon.next;
				balloon.next = balloon;
		}
		
		public int remove(Node<Integer> balloon) {
			if (balloon.prev.prev == balloon) {
				System.out.println(balloon.num_order +" ");
				System.out.println(balloon.prev.num_order+" ");
				return 0;
			}
			Node<Integer> temp = balloon.prev;
			temp.next.next = balloon.next;
			temp=temp.next;
			temp.prev=balloon.prev;
			System.out.print(balloon.num_order+" ");
			
			return balloon.data;
		}	
	}
	public static void main()
}
