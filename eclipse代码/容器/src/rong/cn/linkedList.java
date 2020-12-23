package rong.cn;

import java.util.LinkedList;

public class linkedList {
	
	private Node first;
	private Node last;
	private int size;
	
	public void add(Object obj) {
		Node node=new Node(obj);
		if(first==null) {
			first=node;
			last=node;
			node.previous=null;
			node.next=null;
			
		}else {
			node.previous=last;
			node.next=null;
			last.next=node;//给上一个node.next ，由于上一个node在这个过程变了 用上一步last保存了
			last=node;
		}
	}
	public void add02(Object obj) {
		Node node=new Node(obj);
		
		if(first==null) {
			first=node;
			last=node;
			node.previous=null;
			node.next=null;
			
		}else {
			node.previous=null;
			node.next=last;
			first=last;
			last=node;
		}
	}
	public String toString2() {
		StringBuilder sb=new StringBuilder();
		Node temp=first;
		while(temp!=null) {
			sb.append(temp.element+" ");
			temp=temp.next;
		}
		return sb.toString();
	}

	public String toString() {
		StringBuilder sb=new StringBuilder();
		Node temp=first;
		while(temp!=null) {
			sb.append(temp.element+" ");
			temp=temp.next;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		linkedList list=new linkedList();
		
		list.add("s");
		list.add("t");
		list.add("u");
		list.add("d");
		list.add("y");
		System.out.println(list);
		linkedList list02=new linkedList();
		list02.add02(list);
		System.out.println(list02);
		
	}
}
