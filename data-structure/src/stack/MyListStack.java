package stack;

import linkedList.MyLinkedList;
import linkedList.MyListNode;

public class MyListStack extends MyLinkedList implements IStack{

    MyListNode top;

    public MyListStack() {
        top = null;
    }

    @Override
    public void push(String data) {
        MyListNode newNode = insertElement(0,data);
        if(isEmpty()) {
            top = newNode;
            return;
        }
        top = newNode;
        System.out.println(newNode.getData() + " push");
    }

    @Override
    public String pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        String data = top.getData();
        top = top.next;
        return data;
    }

    @Override
    public void printAll() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        MyListNode temp = top;
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}
