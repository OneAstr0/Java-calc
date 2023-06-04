import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /, ^, !, sqrt): ");
        String operator = scanner.next();

        if (operator.equals("!")) {
            result = factorial((int) num1);
            System.out.println("Факториал числа " + num1 + " равен: " + result);
        } else if (operator.equals("sqrt")) {
            result = squareRoot(num1);
            System.out.println("Корень числа " + num1 + " равен: " + result);
        } else {
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Результат сложения: " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Результат вычитания: " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Результат умножения: " + result);
                    break;
                case "/":
                    result = num1 / num2;
                    System.out.println("Результат деления: " + result);
                    break;
                case "^":
                    result = Math.pow(num1, num2);
                    System.out.println("Результат возведения в степень: " + result);
                    break;
                default:
                    System.out.println("Некорректный оператор.");
            }
        }
    }

    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Корень из отрицательного числа не определен.");
        }

        return Math.sqrt(number);
    }

    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен.");
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}