import java.util.Scanner;

public class OnlineExaminationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        String[] questions = {"What is the capital of India?", "What is the currency of Japan?", "What is the largest continent in the world?", "What is the smallest country in the world?"};
        String[][] options = {{"1. New Delhi", "2. Mumbai", "3. Kolkata", "4. Chennai"}, {"1. Yen", "2. Won", "3. Yuan", "4. Dollar"}, {"1. Asia", "2. Europe", "3. Africa", "4. North America"}, {"1. Monaco", "2. Vatican City", "3. Nauru", "4. Tuvalu"}};
        int[] answers = {1, 1, 1, 2};
        System.out.println("Welcome to the online examination system.");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Enter your answer: ");
            int userAnswer = sc.nextInt();
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }
        System.out.println("Your score is " + score + " out of " + questions.length + ".");
    }
}
