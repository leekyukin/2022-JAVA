package stack;

public class MyListStackMain {
    public static void main(String[] args) {

        MyListStack listStack = new MyListStack();
        listStack.push("A");
        listStack.push("B");
        listStack.push("C");
        listStack.printAll();
        System.out.println(listStack.pop()+" 삭제");
        listStack.printAll();
        System.out.println(listStack.getElement(0).getData());
    }
}

