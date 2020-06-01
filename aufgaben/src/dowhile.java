import java.util.Scanner;
public class dowhile {
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);

            int i1;
            int zaehler = 0;
            int test;



            do{
                i1 = scanner.nextInt();
                zaehler++;
            }while(i1 > 0);
            System.out.println(zaehler -1 );
        }
    }

}
