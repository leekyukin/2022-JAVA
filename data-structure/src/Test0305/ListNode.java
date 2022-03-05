package Test0305;

public class ListNode {

    private String data;
    public ListNode next;

    public ListNode() {
        data = null;
        next = null;
    }

    public ListNode(String data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(String data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return this.data;
    }
}
