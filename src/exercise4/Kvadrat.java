package exercise4;

public class Kvadrat {
    public static void main(String[] args) {
kvadrat(5);

    }
    public static int kvadrat(int x){

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return x;
    }
}
