package com.kyukin.linkedList;

public class MyLinkedListMain {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addElement("A");
        list.addElement("B");
        list.addElement("C");
        list.printAll();
        list.insertElement(1, "D");
        list.printAll();
        list.removeElement(0);
        list.printAll();

        System.out.println(list.getElement(3));
        System.out.println(list.getSize());

        list.addElement("A");
        list.printAll();
        list.removeAll();
        list.printAll();
    }

}
