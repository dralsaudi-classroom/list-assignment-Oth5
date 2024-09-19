package com.example.project;

public class DLL<T> {
	private DLLNode<T> head;
	private DLLNode<T> current;

    public DLL() {
        head = current = null;
    }
    public boolean empty() {
        return head == null;
    }
    public boolean last() {
        return current.next == null;
    }
    public boolean first() {
        return current.previous == null;
    }
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public void findPrevious() {
        current = current.previous;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T val) {
        current.data = val;
    }
    public void insert(T val) {
        DLLNode<T> tmp = new DLLNode<T>(val);
        if(empty()) {
            current = head = tmp;
        }
        else {
            tmp.next = current.next;
            tmp.previous = current;
            if(current.next != null)
                current.next.previous = tmp;
            current.next = tmp;
            current = tmp;
        }
    }
    public void remove() {
        if(current == head) {
            head = head.next;
            if(head != null)
               head.previous = null;
        }
        else {
            current.previous.next = current.next;
            if(current.next != null)
               current.next.previous = current.previous;
        }
        if(current.next == null)
            current = head;
        else
            current = current.next;
    }
    public void removeBetween(T e1, T e2) {
	    
          // First, find the nodes corresponding to e1 and e2
    DLLNode<T> nodeE1 = null;
    DLLNode<T> nodeE2 = null;

    current = head;
    while (current != null) {
        if (current.data.equals(e1)) {
            nodeE1 = current;
        } else if (currentNode.data.equals(e2)) {
            nodeE2 = current;
        }
        current = current.next;
    }

    // If either e1 or e2 doesn't exist, do nothing
    if (nodeE1 == null || nodeE2 == null) {
        return;
    }

    // Adjust the pointers to remove the elements between e1 and e2
    if (nodeE1.next != nodeE2) {
        nodeE1.next = nodeE2;
        nodeE2.previous = nodeE1;
    }

    // Move current to head if the removal is successful
    current = head;
}
    }
}
