import java.util.Scanner;

public class Percobaan2_20 {

    static int hitungPangkat(int x, int y, StringBuilder deret){
        if (y==0) {
            deret.append(1);
            return (1);
        } else {
            deret.append(x).append(" * ");
            return x * hitungPangkat(x,y - 1, deret);
        }
    }
    static String DeretPangkat (int bilangan,int pangkat){
        StringBuilder deret = new StringBuilder();
        int hasil = hitungPangkat(bilangan, pangkat, deret);
        return deret.toString() + "="+hasil ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan, pangkat;

        System.out.print("Bilangan yang ingin dihitung : ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        pangkat = sc.nextInt();

        String hasilDeretPangkat = DeretPangkat(bilangan, pangkat);
        System.out.println(hasilDeretPangkat);
        
       
    }
}


