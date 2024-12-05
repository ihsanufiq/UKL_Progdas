import java.util.Scanner;

public class mudah3 {
    
 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan awal: ");
        int end = scanner.nextInt();

        System.out.print("Masukkan bilangan terakhir: ");
        int start = scanner.nextInt();

        for (int i = start; i > end; i--) {
            if (i % 4 == 0) {
                System.out.println(i + ". saya anak moklet");
            } else if (i % 4 == 1) {
                System.out.println(i + ". saya anak wikusama");
            } else if (i % 4 == 2) {
                System.out.println(i + ". saya angkatan 33");
            } else {
                System.out.println(i + ". saya senang");
            }

        }
        System.out.println(1 + ". ini nomor terakhir ");
    }
}
