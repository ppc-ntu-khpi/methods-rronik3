// Клас, що реалізує шифр Цезаря
public class Exercise {

    // Метод для шифрування тексту шифром Цезаря
    public static String Calculate(String text, int N) {
        StringBuilder result = new StringBuilder(); // Для збереження зашифрованого тексту
        N = N % 26; // Оптимізація зсуву (щоб не виходив за межі алфавіту)

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) { // Шифруємо тільки букви
                char base = Character.isUpperCase(c) ? 'A' : 'a'; // Визначаємо базовий символ ('A' або 'a')

                // Обчислюємо зміщену літеру
                char encryptedChar = (char) (base + (c - base + N + 26) % 26);
                result.append(encryptedChar);
            } else {
                result.append(c); // Якщо це пробіл або розділовий знак, залишаємо без змін
            }
        }
        return result.toString();
    }
}
