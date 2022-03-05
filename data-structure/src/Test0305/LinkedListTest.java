package Test0305;


public class LinkedListTest {
        public static void main(String[] args) {

            LinkedListImpl list = new LinkedListImpl();
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

