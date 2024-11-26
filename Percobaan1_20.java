public class Percobaan1_20 {

    static int faktorialRekusif (int n){
        if (n==0) {
            return (1);
        } else {
            return (n* faktorialRekusif(n-1));
        }
    }
    
    static int faktorialInteratif (int n){
        int faktor = 1 ;
        for (int i = n ; i >= 1; i--){
            faktor = faktor * i; 
        }
        return faktor; 
    }

    public static void main(String[] args) {
        System.out.println(faktorialRekusif(5));
        System.out.println(faktorialInteratif(5));
    }
}

