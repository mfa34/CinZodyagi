import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthdate;
        String burcunuz ="";
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dogum yilinizi giriniz:");
        birthdate=input.nextInt();

        if (birthdate%12==0){
            System.out.println("Maynun");
        } else if (birthdate%12==1) {
            burcunuz="horoz";
            System.out.println("Çin Zodyağı Burcunuz :" + burcunuz);
        } else if (birthdate%12==2) {
            burcunuz="kopek";
            System.out.println("Çin Zodyağı Burcunuz :" + burcunuz);
        } else if (birthdate%12==3) {
            burcunuz="Domuz";
            System.out.println("Çin Zodyağı Burcunuz :" + burcunuz);
        } else if (birthdate%12==4) {
            burcunuz="Fare";
            System.out.println("Çin Zodyağı Burcunuz :" + burcunuz);
        } else if (birthdate%12==5) {
            burcunuz="Öküz";
            System.out.println("Çin Zodyağı Burcunuz :" + burcunuz);
        } else if (birthdate%12==6) {
            burcunuz="Kaplan";
            System.out.println("Çin Zodyağı Burcunuz :" + burcunuz);
        } else if (birthdate%12==7) {
            burcunuz="Tavşan";
            System.out.println("Çin Zodyağı Burcunuz :" + burcunuz);
        } else if (birthdate%12==8) {
            burcunuz="Ejderha";
            System.out.println("Çin Zodyağı Burcunuz :" + burcunuz);
        } else if (birthdate%12==9) {
            burcunuz="Yılan";
            System.out.println("Çin Zodyağı Burcunuz :" + burcunuz);
        } else if (birthdate%12==10) {
            burcunuz="At";
            System.out.println("Çin Zodyağı Burcunuz :" + burcunuz);
        } else if (birthdate%12==11) {
            burcunuz="Koyun";
            System.out.println("Çin Zodyağı Burcunuz :" + burcunuz);
        } else {
            System.out.println("Hatali giris gerceklestirdiniz.");
        }


    }
}
