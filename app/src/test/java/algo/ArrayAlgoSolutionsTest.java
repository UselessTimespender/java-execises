package algo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayAlgoSolutionsTest {

    @ParameterizedTest
    @MethodSource("findElementInSortedArrayParameters")
    void findElementInSortedArray(int[] source, int searchElement, boolean expectedResult) {
        var actualResult = new ArrayAlgoSolutions().findElementInSortedArray(source, searchElement);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @MethodSource("fillIncrementallyBySpiralParameters")
    void fillIncrementallyBySpiral(int sideSize, int[][] expectedResult) {
        var actualResult = new ArrayAlgoSolutions().fillIncrementallyBySpiral(sideSize);
        assertThat(actualResult).isDeepEqualTo(expectedResult);
    }

    private static Stream<Arguments> findElementInSortedArrayParameters() {
        return Stream.of(
                Arguments.of(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 100, 101, 1000 }, 5, true),
                Arguments.of(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 100, 101, 1000 }, 1000, true),
                Arguments.of(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 100, 101, 1000 }, 0, true),
                Arguments.of(new int[] { 0 }, 0, true),
                Arguments.of(new int[] { 2, 2}, 2, true),
                Arguments.of(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 100, 101, 1000 }, -5, false),
                Arguments.of(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 100, 101, 1000 }, 999, false),
                Arguments.of(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 100, 101, 1000 }, 5000, false),
                Arguments.of(new int[] { 0 }, -1, false),
                Arguments.of(new int[] { 2, 2 }, 22, false)
        );
    }

    private static Stream<Arguments> fillIncrementallyBySpiralParameters() {
        return Stream.of(
                Arguments.of(1, new int[][] {
                        { 1 }
                }),
                Arguments.of(2, new int[][] {
                        { 1, 2 },
                        { 4, 3 }
                }),
                Arguments.of(3, new int[][] {
                        { 1, 2, 3 },
                        { 8, 9, 4 },
                        { 7, 6, 5 }
                }),
                Arguments.of(4, new int[][] {
                        { 1,  2,  3,  4 },
                        { 12, 13, 14, 5 },
                        { 11, 16, 15, 6 },
                        { 10, 9,  8,  7 }
                })
        );
    }
}