package array;

import java.math.BigDecimal;
import java.util.List;

public class SumTest {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);

        System.out.println("sum(numbers) = " + sum(numbers));
    }

    public static int sum(List<Integer> numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

//    public static BigDecimal sum(List<BigDecimal> numbers) {
//        BigDecimal result = BigDecimal.ZERO;
//
//        for (BigDecimal number : numbers) {
//            result = result.add(number);
//        }
//
//        return result;
//    }
}
