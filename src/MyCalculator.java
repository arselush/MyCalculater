import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int execution = reportHelloMessage(scanner);
        int firstNum = askForFirstNum(scanner);
        int secondNum = askForSecondNum(scanner);
        calculateResult(execution, firstNum, secondNum);
    }

    static int reportHelloMessage(Scanner scanner) {
        String helloMessage = "Hello!\nChoose operation u want to execute:\n1 - addition\n2 - subtraction" +
                "\n3 - multiply\n4 - division";
        System.out.println(helloMessage);
        int execution = scanner.nextInt();
        return (execution);
    }

    static int askForFirstNum(Scanner scanner) {
        String enterFirstNum = "Please, enter ur first number:";
        System.out.println(enterFirstNum);
        int firstNum = scanner.nextInt();
        return (firstNum);
    }

    static int askForSecondNum(Scanner scanner) {
        String enterSecondNum = "Please, enter ur second number:";
        System.out.println(enterSecondNum);
        int secondNum = scanner.nextInt();
        return (secondNum);
    }

    static void calculateResult(int execution, int firstNum, int secondNum) {
        int result;
        if (execution == 1) {
            result = addTwoNumbers(firstNum, secondNum);
            System.out.println("result is" + result);
        } else if (execution == 2) {
            result = differTwoNumbers(firstNum, secondNum);
            System.out.println("result is" + result);
        } else if (execution == 3) {
            result = multiTwoNumbers(firstNum, secondNum);
            System.out.println("result is" + result);
        } else if (execution == 4) {
            result = divideTwoNumbers(firstNum, secondNum);
            System.out.println("result is" + result);
        } else {
            System.out.println("Error :-) !");
        }
    }

    static int addTwoNumbers(int firstNum, int secondNum) {
        return (firstNum + secondNum);
    }

    static int differTwoNumbers(int firstNum, int secondNum) {
        return (firstNum - secondNum);
    }

    static int multiTwoNumbers(int firstNum, int secondNum) {
        return (firstNum * secondNum);
    }

    static int divideTwoNumbers(int firstNum, int secondNum) {
        return (firstNum / secondNum);
    }
}