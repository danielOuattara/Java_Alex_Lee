package java_Intermediate._06_this_keyword;

public class Main {

    int a;
    int b;

    private void setData(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Main one = new Main();
        one.setData(4, 3);
        System.out.println(one.a);
        System.out.println(one.b);
    }
}
