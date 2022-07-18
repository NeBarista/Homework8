public class Main {
    public static void main(String[] args) {
        del(8, 4);
        del(7, 0);
    }

    static void del(int number1, int number2) {
        if (number2 != 0) {
            println(number1 / number2);
        }
    }

    static void println(int number) {
        System.out.println(number);
    }
}
