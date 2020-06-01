import java.util.Scanner;
public class realtionalop3 {


    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int i1;
            int i2;
            int i3;

            i1 = scanner.nextInt();
            i2 = scanner.nextInt();
            i3 = scanner.nextInt();

            boolean test = (((i1 < i2) && (i1 > i3)) || ((i1 > i2) && (i1 < i3)) || ((i1 == i2) && (i1 == i3)));

            System.out.println(test);
        }
    }
}
