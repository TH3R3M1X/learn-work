import java.util.Scanner;
public class conditionalstatement1 {


    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);

            int a;
            int b;
            int c;

            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            if (c < a){
                System.out.println("Deficiency");
            }else if (c > b){
                System.out.println("Excess");
            }else{
                System.out.println("Normal");
            }
        }
    }
}
