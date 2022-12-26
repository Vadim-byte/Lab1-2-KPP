public class Main {
    public static void main(String[] args) {

        int[] array = {1, -3, 5, 4, 8, -1, 9, 0, -4, 5, 6};

        // Task 1
        int max = array[0];

        for (int j : array) {
            if (j > max)
                max = j;
        }

        //Task 2

        int[] array2 = {1, -5, -2, -6, -3, 5, 4, 8, -1, 9, 0, -4, 7, 6};
        int indexStart = 0, indexEnd = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < 0) { indexStart = i; break; }
        }

        for (int i = array2.length - 1; i >= indexStart ; i--) {
            if (array2[i] < 0) { indexEnd = i; break; }
        }

        int sum = 0;

        for (int i = indexStart + 1; i < indexEnd; i++)
            sum += array2[i];

        System.out.println("Task1 = " + max);
        System.out.println("Task2 = " + sum);


    }
}
