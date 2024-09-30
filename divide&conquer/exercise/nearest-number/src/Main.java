import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int inputNumbers = scanner.nextInt();

        scanner.nextLine();

        int[] numbers= new int[inputNumbers];

        String[] inputs = scanner.nextLine().split(" ");
        int searchNumber = scanner.nextInt();

        IntStream.range(0,numbers.length)
                .forEach(index -> numbers[index] = parseInt(inputs[index]));

        NearestNumber nearestNumber = new NearestNumber();
        System.out.println(nearestNumber.findNearestNumber(numbers, 0, inputNumbers - 1, searchNumber));

    }
}
