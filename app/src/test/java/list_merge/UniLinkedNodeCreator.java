package list_merge;

import java.util.Random;

public class UniLinkedNodeCreator {
    private int maxValueShift = 50;
    private int minBorder = -100;
    private int maxBorder = 100;

    public UniLinkedNode createSorted(int startElement, int size) {
        return create(startElement, size, true);
    }

    public UniLinkedNode createUnsorted(int startElement, int size) {
        return create(startElement, size, false);
    }

    public UniLinkedNode create(int startElement, int size, boolean sorted) {
        var head = new UniLinkedNode(startElement);
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
            var newNode = new UniLinkedNode(currentValue);
            currentNode.setNext(newNode);
            currentNode = newNode;
        }
        return head;
    }
}
