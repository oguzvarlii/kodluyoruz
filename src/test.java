
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int  mat , fizik , kimya   ;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz : " );
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : " );
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : " );
        kimya = inp.nextInt();

        int toplam = (mat+fizik+kimya);

        double sonuc = toplam/6.0;

        System.out.println("Ortalamanız : "  + sonuc);
        
        System.out.println(sonuc>=60? "Geçtiniz" : "Kaldınız");









    }
}
