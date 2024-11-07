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
    Node<T> p = head;
    
    // Find the first node containing e1
    while (p != null && !p.data.equals(e1)) {
        p = p.next;
    }
    
    // If e1 is not found, return
    if (p == null) {
        return;
    }
    
    Node<T> q = p.next;
    
    // Find the first node containing e2 after e1
    while (q != null && !q.data.equals(e2)) {
        q = q.next;
    }
    
    // If e2 is not found, return
    if (q == null) {
        return;
    }
    
    // Connect p to q, effectively removing nodes between them
    p.next = q;
    if (q != null) {
        q.previous = p;
    }
    
    // Reset current pointer, if necessary
    current = head;
}

}


    // If either e1 or e2 doesn't exist, do nothing
 

    // Adjust the pointers to remove the elements between e1 and e2
  

    // Move current to head if the removal is successful

    }

