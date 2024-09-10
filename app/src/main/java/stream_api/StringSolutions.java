package stream_api;

import java.util.List;

public class StringSolutions {

    /**
     * @param source строка целых чисел, разделенная пробелами, пример:
     *  "100 1 7 15 3 0 1 10 25"
     * @return отсортированный список, содержащий все числа из входной строки
     */
    public List<Integer> sortNumericString(String source) {
        return null;
    }

    record MinMaxAvg (int min, int max, double avg) {}

    /**
     * @param source строка целых чисел, разделенная пробелами, пример:
     *  "100 1 7 15 3 0 1 10 25"
     * @return минимальное, максимальное и среднее значения
     */
    public MinMaxAvg findMinMaxAvg(String source) {
        return new MinMaxAvg(0, 0, 0.0);
    }


    /**
     * @param source строка групп целых чисел, сгруппированных по скобкам, разделенная пробелами внутри группы,
     * группы разделены запятыми, пример:
     *  "(100), (15 3 0), (1 10 25), (30 40 60)"
     * @return максимальную сумму внутри группы среди всех групп
     */
    public int findMaxSumInGroup(String source) {
        return 0;
    }

}
