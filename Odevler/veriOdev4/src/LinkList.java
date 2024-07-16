public class LinkList {
    private Link head;

    public LinkList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertToHead(char data) {
        Link newLink = new Link(data);
        newLink.next = head;
        head = newLink;
    }

    public char deleteFromHead() {
        Link temp = head;
        head = head.next;
        return temp.data;
    }

    public char displayHead() {
        return head.data;
    }
}
