import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Виберіть перевірку (1 - зростання, 2 - спадання): ");
        int choice = scanner.nextInt();

        boolean isOrdered = true;
        for (int i = 0; i < size - 1; i++) {
            if (choice == 1 && array[i] > array[i + 1]) {
                isOrdered = false;
                break;
            } else if (choice == 2 && array[i] < array[i + 1]) {
                isOrdered = false;
                break;
            }
        }

        if (isOrdered) {
            System.out.println("Масив відповідає вибраній умові.");
        } else {
            System.out.println("Масив НЕ відповідає вибраній умові.");
        }
    }
}
