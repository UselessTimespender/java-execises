package list_merge;

import org.junit.jupiter.api.Test;

class MergerTest {

    private UniLinkedListCreator listCreator = new UniLinkedListCreator();

    @Test
    void mergeSorted() {
        var firstList = listCreator.createSorted(1, 10);
        var secondList = listCreator.createSorted(5, 7);
        System.out.println("firstList: " + firstList);
        System.out.println("secondList: " + secondList);
        var mergeTwoSequentially = new Merger();
        var merge = mergeTwoSequentially.mergeTwoSorted(firstList, secondList);
        System.out.println("merge: " + merge);
    }
}