package com.kyukin.linkedList;

public class MyLinkedList {

    private MyListNode head;
    private int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    // 끝에 추가
    public MyListNode addElement(String data) {
        MyListNode newNode = new MyListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            MyListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;
        return newNode;
    }

    //해당 위치에 추가
    public MyListNode insertElement(int position, String data) {
        MyListNode tempNode = head;
        MyListNode newNode = new MyListNode(data);

        if (position < 0 || position > count) {
            System.out.printf("Position Erorr !!. This list has %d nodes\n", count);
            return null;
        }

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            MyListNode preNode = null;
            for (int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position) {
        MyListNode tempNode = head;

        if (position < 0 || position > count) {
            System.out.printf("Position NOT FOUND EXCEPTION !!. This list has %d nodes\n", count);
            return null;
        }
        if (position == 0) {
            head = tempNode.next;
        } else {
            MyListNode preNode = null;
            for (int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;
        System.out.println(position + "th node was deleted.");

        return tempNode;
    }

    public MyListNode getElement(int position) {
        MyListNode tempNode = head;

        if (position < 0 || position > count) {
            System.out.println("POSITION NOT FOUND ERROR! Now, count of list is " + count + ".");
            return null;
        }

        if (position == 0) {
            return head;
        }

        for (int i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    public void removeAll() {
        head = null;
        count = 0;
    }

    public int getSize() {
        return count;
    }

    public void printAll() {
        if(count == 0) {
            System.out.println("There's no data");
            return;
        }

        MyListNode temp = head;
        while(temp  != null) {
            System.out.print(temp.getData());
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public boolean isEmpty() {
        if(head == null) return true;
        else return false;
    }
}