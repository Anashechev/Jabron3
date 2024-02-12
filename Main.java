import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите стороны треугольника:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (isRightTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника");
        } else if (isIsoscelesTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника");
        } else if (isEquilateralTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника");
        } else if (isValidTriangle(a, b, c)) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами обычного треугольника");
        } else {
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника");
        }

        scanner.close();
    }

    private static boolean isRightTriangle(int a, int b, int c) {
        return (a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b);
    }

    private static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || b == c || c == a;
    }

    private static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }
}