public class LinkStack {
    private LinkList theList;

    public LinkStack() {
        theList = new LinkList();
    }

    public void push(char d) { //yığına eleman eleman eklemek için kullanılır.
        theList.insertToHead(d);
    }

    public char pop() { //yığından eleman çıkartmak için kullanılır.
        return theList.deleteFromHead();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public char peek() {
        return theList.displayHead();
    } //yığının tepe elemanı

}
