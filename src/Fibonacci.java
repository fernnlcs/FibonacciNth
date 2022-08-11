import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> generateUntil(int nth) {
        List<Integer> sequence = new ArrayList<>();

        if (nth > 0) {
            sequence.add(0);
        }

        if (nth > 1) {
            sequence.add(1);
        }

        for (int i = 1; i < nth; i++) {
            sequence.add(sequence.get(sequence.size() - 1) + sequence.get(sequence.size() - 2));
        }

        return sequence;
    }

    public static void printUntil(int nth) {
        List<Integer> sequence = Fibonacci.generateUntil(nth);

        for (Integer value : sequence) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static int find(int nth) {
        List<Integer> sequence = Fibonacci.generateUntil(nth);

        return sequence.get(sequence.size() - 1);
    }

    public static int recursivelyFind(int nth) {
        if (nth == 0 || nth == 1) {
            return nth;
        }
        return Fibonacci.recursivelyFind(nth - 1) + Fibonacci.recursivelyFind(nth - 2);
    }

    public static void fib(int nth) {
        System.out.println(Fibonacci.recursivelyFind(nth));
    }
}
