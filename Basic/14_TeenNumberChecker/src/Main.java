public class Main {
    public static void main(String[] args){

        boolean q = hasTeen(12,19,99);
        System.out.println(q);
        boolean s = hasTeen(23,15,42);
        System.out.println(s);
        System.out.println(hasTeen(12,25,65));

        System.out.println("Teen Age is " + isTeen(14));
        System.out.println("Teen Age is " + isTeen(12));
    }
    public static boolean hasTeen(int a,int v,int c){

        if ((a >= 13 && a <= 19) || (v >= 13 && v <= 19) || (c >= 13 && c <= 19))
        return true;
        else
            return false;
    }
    public static boolean isTeen(int teen){
       return (teen >= 13 && teen <= 19);
    }
}
