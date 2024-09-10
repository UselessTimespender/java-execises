package list_merge;

import org.junit.jupiter.api.Test;

class MergerTest {

    private UniLinkedNodeCreator listCreator = new UniLinkedNodeCreator();

    @Test
    void mergeSorted() {
        var firstList = listCreator.createSorted(1, 4);
        var secondList = listCreator.createSorted(5, 6);
        System.out.println("firstList: " + firstList);
        System.out.println("secondList: " + secondList);
        var mergeTwoSequentially = new Merger();
        var merge = mergeTwoSequentially.mergeTwoSorted(firstList, secondList);
        System.out.println("merge: " + merge);
    }
}