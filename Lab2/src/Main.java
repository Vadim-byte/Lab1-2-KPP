
public class Main {
    public static void main(String[] args) {
        int[] arr = {-322,-12,0,2,4,3,6,8,10,15,17,11,12,23,321};
        System.out.println("Найбільший парний елемент - " + Main.maxElement(arr));
    }

    public static int maxElement(int[] arr) {
        int maxEl = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEl && arr[i] % 2 != 1) {
                maxEl = arr[i];
            }
        }
        return maxEl;
    }
}