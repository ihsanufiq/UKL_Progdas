import java.util.Scanner;
public class sulit2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen array");
        int n = input.nextInt();

        System.out.println("Masukkan nilai: ");
        int[]array = new int[n];
        
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        
        MenemukanDuplicate(array);
        }
        
    public static void MenemukanDuplicate(int[] array) {
        boolean[] visited = new boolean[array.length];
        
        for (int i = 0; i < array.length; i++) {
          if (!visited[i]) {
             int count = 1;
        for (int j = i + 1; j < array.length; j++) {
             if (array[i] == array[j]) {
              count++;
               visited[j] = true;
        }
    }
        if (count > 1) {
      System.out.println("Angka " + array[i] + " memiliki duplikat sebanyak " + count + " kali.");
      }
   }
 }
    }
}