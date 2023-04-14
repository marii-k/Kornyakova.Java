package task;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 9, 10, 12, 15};
        System.out.print("Элементы массива, кратные 3: ");
        for (int i : array) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}