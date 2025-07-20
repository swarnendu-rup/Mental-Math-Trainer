//--Swarnendu-Rup repositories-->

import java.util.Scanner;
import java.util.Random;

public class Mental_Math_Trainer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        int totalQuestions = 10;
        int level = 1;

        System.out.println("===== MENTAL MATH TRAINER =====");

        for (int i = 1; i <= totalQuestions; i++) {
            if (i % 5 == 1 && i != 1) {
                level++;
                System.out.println("\nLevel Up! 🔓 Now Level " + level);
            }

            int num1 = rand.nextInt(level * 10) + 1;
            int num2 = rand.nextInt(level * 10) + 1;
            int operation = rand.nextInt(4); // 0:+, 1:-, 2:x, 3:÷

            int correctAnswer = 0;
            String opSymbol = "";

            switch (operation) {
                case 0:
                    correctAnswer = num1 + num2;
                    opSymbol = "+";
                    break;
                case 1:
                    correctAnswer = num1 - num2;
                    opSymbol = "-";
                    break;
                case 2:
                    correctAnswer = num1 * num2;
                    opSymbol = "x";
                    break;
                case 3:
                    num1 = num1 * num2; // Ensure divisible
                    correctAnswer = num1 / num2;
                    opSymbol = "÷";
                    break;
            }

            System.out.println("\nQuestion " + i + ": " + num1 + " " + opSymbol + " " + num2 + " = ?");
            System.out.print("Your answer: ");
            int userAnswer = sc.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct! ✅");
                score++;
            } else {
                System.out.println("Wrong ❌ | Correct Answer: " + correctAnswer);
                score--;
            }
        }

        System.out.println("\n==============================");
        System.out.println("FINAL SCORE: " + score + " / " + totalQuestions);
        System.out.println("Thanks for playing, genius! 💯");
    }
}
