import java.util.Scanner;
public class sulit3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        System.out.println("Masukkan nilai: ");
        int[]array = new int[n];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

     // Menyimpan apakah elemen sudah dihitung
     boolean sudahDihitung[] = new boolean[array.length];
        
     // Menghitung frekuensi elemen
     for (int i = 0; i < array.length; i++) {
         // Jika elemen sudah dihitung, lewati
         if (sudahDihitung[i]) {
             continue;
         }
         
         int frekuensi = 1;  // Setiap elemen muncul setidaknya sekali
         // Hitung jumlah kemunculan elemen yang sama
         for (int j = i + 1; j < array.length; j++) {
             if (array[i] == array[j]) {
                 frekuensi++;
                 sudahDihitung[j] = true;  // Tandai elemen yang sudah dihitung
             }
         }
         
         // Menampilkan hasil frekuensi untuk elemen yang belum dihitung
         System.out.println(array[i] + " muncul " + frekuensi + " kali");
     }
 }
}