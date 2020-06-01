import java.util.Scanner;
public class incrementanddecrement1 {


    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int i1;
            int i2;
            int i3;
            int i4;

            i1 = scanner.nextInt();
            i2 = scanner.nextInt();
            i3 = scanner.nextInt();
            i4 = scanner.nextInt();

            i1--;
            i2--;
            i3--;
            i4--;
            System.out.print(i1);
            System.out.print(" ");
            System.out.print(i2);
            System.out.print(" ");
            System.out.print(i3);
            System.out.print(" ");
            System.out.print(i4);
        }
    }

}
