public class PositiveNegativeZero {
    public static void main(String[] args) {
        int a = 10;
        checkNumber(a);
        int b = -10;
        checkNumber(b);
        int c = 0;
        checkNumber(c);

    }

    public static void checkNumber (int number) {
        if (number > 0) {
            System.out.println("positive");
        }
        else if (number < 0) {
            System.out.println("negative");
        }
        else
            System.out.println("Zero");
    }
}
