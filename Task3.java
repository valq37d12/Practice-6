import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Введіть значення для пошуку: ");
        int searchValue = scanner.nextInt();
        System.out.print("Введіть нове значення: ");
        int newValue = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchValue) {
                array[i] = newValue;
                found = true;
            }
        }

        if (found) {
            System.out.println("Оновлений масив:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Значення не знайдено.");
        }
    }
}
