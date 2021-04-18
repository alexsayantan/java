public class method {
    public static void main(String[] args) {
        int a = 300;
        int b = 200;
        System.out.println(a+b);
        add();
        System.out.println(sub(a,b));
    }
    //method or function
    public static void add() {
        int a = 300;
        int b = 400;
        System.out.println(a+b);
    }
    // method passing parameters
    public static int sub(int abc,int bac){
        int sub1 = (abc-bac);

        return sub1;
    }

}
