package list_merge;

public class UniLinkedNode {
    private int value;
    private UniLinkedNode next;

    public UniLinkedNode() {
    }

    public UniLinkedNode(int value) {
        this.value = value;
    }

    public UniLinkedNode(int value, UniLinkedNode next) {
        this.value = value;
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public UniLinkedNode getNext() {
        return next;
    }

    public void setNext(UniLinkedNode next) {
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
