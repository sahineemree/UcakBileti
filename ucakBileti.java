import java.util.*;
public class ucakBileti {
    public static void main(String[] args) {
        int age, mesafe , tip;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Km cinsinden giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age= input.nextInt();
        System.out.print("Yolculuk tipini giriniz ( 1=> Tek Gidiş , 2=> Gidiş-Dönüş) : ");
        tip = input.nextInt();

double fiyat = mesafe * 0.10;

if ( (age >= 1) && (age<=12) && (tip == 1) ) {

double ucret1 = fiyat - (fiyat*0.5);
    System.out.println("Ödeyeceğiniz tutar: " + ucret1 + "TL");
}
else if ((age>=1) && (age<=12) && (tip == 2)) {

    double ucret2x = fiyat - (fiyat*0.5);
    double ucret2 = 2*(ucret2x - (ucret2x*0.2));

    System.out.println("Ödeyeceğiniz tutar: " + ucret2 + "TL");
}
else if ((age>=13) && (age<=24) && (tip == 1)) {
    double ucret3 = fiyat - (fiyat*0.1);
    System.out.println("Ödeyeceğiniz tutar: " + ucret3 + "TL");
}
else if ((age>=13) && (age<=24) && (tip == 2)) {

    double ucret4x = fiyat - (fiyat*0.1);
    double ucret4 = 2*(ucret4x - (ucret4x*0.2));

    System.out.println("Ödeyeceğiniz tutar: " + ucret4 + "TL");
}
else if ((age>=25) && (age<=64) && (tip == 1 )) {
    double ucret5 = fiyat ;
    System.out.println("Ödeyeceğiniz tutar: " + ucret5 + "TL");
}
else if ((age>=25) && (age<=64) && (tip == 2 )) {
    double ucret6 = 2*(fiyat - (fiyat*0.2));
    System.out.println("Ödeyeceğiniz tutar: " + ucret6 + "TL");
}
else if ((age>=65) && (tip == 1 )) {
    double ucret7 = fiyat - (fiyat * 0.3);
    System.out.println("Ödeyeceğiniz tutar: " + ucret7 + "TL");
}
else if ((age>=65) && (tip == 2 )) {
    double ucret8x = fiyat - (fiyat*0.3);
    double ucret8 = 2*(ucret8x - (ucret8x*0.2));
    System.out.println("Ödeyeceğiniz tutar: " + ucret8 + "TL");
}
else {
    System.out.println("HATALI GİRİŞ YAPTINIZ. TEKRAR DENEYİNİZ.");
}
    }
}