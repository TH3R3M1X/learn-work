import java.util.Scanner;
public class realtionalop2 {


    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int i1;
            int i2;
            int i3;

            i1 = scanner.nextInt();
            i2 = scanner.nextInt();
            i3 = scanner.nextInt();

            boolean ask = i1 == i2 || i2 == i3 || i1 == i3;

            System.out.println(!ask);
            // put your code here
        }
    }

}
