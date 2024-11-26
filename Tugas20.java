import java.util.Scanner;

public class Tugas20 {

    static int jumlahdalamRekusif (int[] angka, int jumlah){
        if (jumlah == 0) {
            return 0;
        } else {
            return angka [jumlah-1] + jumlahdalamRekusif(angka, jumlah-1); 
        }
    }

    static int jumlahdalamIteratif (int[]angka){
        int jumlah =0;
        for (int num : angka){
            jumlah += num; 
        } 
        return jumlah;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai (N): ");
        int n = input.nextInt();

        int [] angka = new int[n];
        for (int i = n; i>0; i--){
            System.out.print("Masukkan Angka Ke-"+ i +": ");
            angka [n-i] = input.nextInt();
        }

        int total = jumlahdalamIteratif(angka);

        System.out.println("Total dari " +n+ " angka yang dimasukkan adalah: " + total );
    }
}