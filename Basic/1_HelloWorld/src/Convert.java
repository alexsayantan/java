public class Convert {
    public static void main(String[] args) {
        System.out.println("Kilometers = 100");
        double kilometer = (100 * 1.60d);
        System.out.println("Miles = " + kilometer);

        int var1 = 20;
        int var2
                =
                15;

        System.out.println(var1);
        System.out.println(var2);
        ++var1;
        --var2;
        System.out.println(var1);
        System.out.println(var2);
        if (var1 == 22) {
            System.out.println("If Statement");
        }
        else if (var2 == 15)
                System.out.println("Else if Statement");
        else {
            System.out.println("Else Statement");
            System.out.println("Good");
        }
    }
}
