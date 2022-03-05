package Test0305;

public class LinkedListImpl {

    private ListNode head;
    private int count;

    public LinkedListImpl() {
        head = null;
        count = 0;
    }

    public ListNode addElement(String data) {
        ListNode newNode = new ListNode(data);
        if(head == null) {
            head = newNode;
        }
        else {
            ListNode temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;
        return newNode;
    }

    public ListNode insertElement(int position, String data) {
        ListNode tempNode = head;
        ListNode newNode = new ListNode(data);

        if (position < 0 || position >= count) {
            System.out.println("POSITION NOT FOUND EXCEPTION!! Current count of node is " + count + ".");
            return null;
        }

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            ListNode preNode = null;
            for(int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = tempNode;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public ListNode removeElement(int position) {
        ListNode tempNode = head;

        if (position < 0 || position >= count) {
            System.out.println("POSITION NOT FOUND EXCEPTION!! Current count of node is " + count + ".");
            return null;
        }

        if(position == 0) {
            head = tempNode.next;
        }
        else {
            ListNode preNode = null;
            for(int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;
        System.out.println(position + "번째 항목 삭제되었습니다.");

        return tempNode;
    }

    public ListNode getElement(int position) {
        ListNode tempNode = head;

        if (position < 0 || position >= count) {
            System.out.println("POSITION NOT FOUND EXCEPTION!! Current count of node is " + count + ".");
            return null;
        }

        if(position == 0) {
            return head;
        }

        for(int i = 0; i < position; i++) {
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
            System.out.println("There's nothing to print!!");
        }

        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp!=null){
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
