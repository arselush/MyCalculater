public class Practice {
    public static void main(String[] args) {
        reportNumber(addTwoNumbers(1, 5));
    }

    static int addTwoNumbers(int one, int two) {
        int result = one + two;
        return result;
    }

    static void reportNumber(int number) {
        String massage = " Your number is ";
        System.out.println(massage + number);
    }
}
