import java.util.Scanner; // Імпортуємо клас Scanner для зчитування введених даних

public class TestResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Створюємо об'єкт Scanner для зчитування введення користувача

        // Запитуємо у користувача введення тексту для шифрування
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        // Запитуємо у користувача величину зсуву
        System.out.print("Введіть зсув: ");
        int shift = scanner.nextInt();

        // Викликаємо метод Calculate для шифрування тексту і виводимо результат
        System.out.println("Зашифрований текст: " + Exercise.Calculate(text, shift));

        scanner.close(); // Закриваємо Scanner, щоб уникнути витоків пам'яті
    }
}
