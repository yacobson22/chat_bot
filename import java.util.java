import java.util.Scanner;
import java.util.Random;

public class SimpleChatBot {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Привет! Я простой чат-бот. Задайте мне вопрос или попросите рассказать шутку.");

        while (true) {
            System.out.print("Вы: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("пока")) {
                System.out.println("Чат-бот: До скорых встреч!");
                break;
            }

            respondToUser(userInput);
        }
    }

    private static void respondToUser(String input) {
        
        if (input.equalsIgnoreCase("скажи шутку")) {
            tellAJoke();
        } else {
            System.out.println("Чат-бот: Извините, я не умею отвечать на такие вопросы.");
        }
    }

    private static void tellAJoke() {
        String[] jokes = {
            "Как называется самая маленькая мама? Минимама!",
            "Что сказал электрон протону? Ты положительный!",
            "Как два океана говорят друг другу? Ничего, они просто волнуются."
        };
        Random random = new Random();
        System.out.println("Чат-бот: " + jokes[random.nextInt(jokes.length)]);
    }
}
