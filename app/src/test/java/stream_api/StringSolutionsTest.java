package stream_api;

import org.junit.jupiter.api.Test;
import stream_api.StringSolutions.MinMaxAvg;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StringSolutionsTest {

    @Test
    void sortNumericString() {
        var source = "100 1 7 15 3 0 1 10 25";
        List<Integer> expectedResult = Arrays.asList(0, 1, 1, 3, 7, 10, 15, 25, 100);
        var actualResult = new StringSolutions().sortNumericString(source);
        assertThat(actualResult).containsExactlyElementsOf(expectedResult);
    }

    @Test
    void findMinMaxAvg() {
        var source = "100 1 7 15 3 0 1 10 25";
        var expectedResult = new MinMaxAvg(0, 100, 18.0);
        var actualResult = new StringSolutions().findMinMaxAvg(source);
        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expectedResult);
    }

    @Test
    void findMaxSumInGroup() {
        var source = "(100), (15 3 0), (1 10 25), (30 40 60)";
        var actualResult = new StringSolutions().findMaxSumInGroup(source);
        var expectedResult = 130;
        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expectedResult);
    }
}