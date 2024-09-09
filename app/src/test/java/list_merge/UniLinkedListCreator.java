package list_merge;

import java.util.Random;

public class UniLinkedListCreator {
    private int maxValueShift = 50;
    private int minBorder = -100;
    private int maxBorder = 100;

    public UniLinkedList createSorted(int startElement, int size) {
        return create(startElement, size, true);
    }

    public UniLinkedList createUnsorted(int startElement, int size) {
        return create(startElement, size, false);
    }

    public UniLinkedList create(int startElement, int size, boolean sorted) {
        var head = new UniLinkedList(startElement);
        var random = new Random();
        var currentValue = startElement;
        var currentNode = head;
        for (int i = 0; i < size - 1; i++) {
            int nextValue;
            if (sorted) {
                nextValue = currentValue + random.nextInt(maxValueShift);
            } else {
                nextValue = random.nextInt(minBorder, maxBorder);
            }
            currentValue = nextValue;
            var newNode = new UniLinkedList(currentValue);
            currentNode.setNext(newNode);
            currentNode = newNode;
        }
        return head;
    }
}
