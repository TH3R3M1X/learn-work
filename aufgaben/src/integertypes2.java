import java.util.Scanner;
public class integertypes2 {


    static class Main {
        public static void main(String [] args) {
            int zahl;
            int zahl1;

            Scanner scanner = new Scanner(System.in);
            zahl = scanner.nextInt();
            if (zahl % 2 == 0){
                zahl1 = zahl + 2;
            }else {
                zahl1 = zahl + 1;
            }

            System.out.println(zahl1);
        }
    }
}
