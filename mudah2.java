import java.util.Scanner;

public class mudah2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan bilangan: ");
        int bilangan1 = input.nextInt();
        System.out.print("Masukkan bilangan: ");
        int bilangan2 = input.nextInt();

       
        for(int i = bilangan1; i<= bilangan2; i++){
         if (i % 2 == 0) {
            System.out.println(i + " adalah bilangan genap.");
        } else {
            System.out.println(i + " adalah bilangan ganjil.");
        }
    }
}
}