import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();

        int result = 1;

        int i = 0;
        int o = 0;
        for (i = 6; i > 0; i--) {
            for (o = 1; o <= value; o++) {
                if (i * o == value) {
                    System.out.println("Числа");
                    System.out.println();
                    System.out.println(i + " * " + o);
                }
            }
        }



    }
}
