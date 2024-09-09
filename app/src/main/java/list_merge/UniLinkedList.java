package list_merge;

public class UniLinkedList {
    private int value;
    private UniLinkedList next;

    public UniLinkedList() {
    }

    public UniLinkedList(int value) {
        this.value = value;
    }

    public UniLinkedList(int value, UniLinkedList next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public UniLinkedList getNext() {
        return next;
    }

    public void setNext(UniLinkedList next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        var current = this;
        builder.append("[");
        builder.append(value);
        current = next;
        while (current != null) {
            builder.append(", ").append(current.value);
            current = current.getNext();
        }
        builder.append("]");
        return builder.toString();
    }
}
