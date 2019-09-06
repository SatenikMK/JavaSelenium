package Array;

public class PrintElementsofArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        numbers[1] = 10;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}



