import java.util.Scanner;

public class Percobaan3_20 {
    static double hitungLaba(double saldo, int tahun){
        if (tahun==0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double SaldoAwal;
        int tahun;

        System.out.print("Saldo awal : ");
        SaldoAwal = sc.nextDouble();
        System.out.print("Pada tahun : ");
        tahun = sc.nextInt();

        System.out.println("Jumlah Saldo Setelah " +tahun+" tahun : ");
        System.out.println(hitungLaba(SaldoAwal, tahun));

    }
}
