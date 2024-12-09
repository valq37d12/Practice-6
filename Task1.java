import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int size = 10; // Розмір масиву
        int[] array = new int[size];
        Random random = new Random();

        int evenCount = 0, oddCount = 0;

        // Заповнення масиву випадковими числами
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Випадкове число від 0 до 99
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Вивід результатів
        System.out.println("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nКількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
    }
}
