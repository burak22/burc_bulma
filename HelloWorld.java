import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz ay: ");
        int month = input.nextInt();

        System.out.println("Doğduğunuz gün: ");
        int day = input.nextInt();

        if(month>0 && month<=12 && day>0){
            if(month == 1){
                if (day <= 21) {
                    System.out.println("Oğlak Burcu");
                } 
                else if(day<=31){
                    System.out.println("Kova Burcu");
                }
                else{
                    System.out.println("Hatalı Giriş");
                }
            }
            if(month == 2){
                if (day <= 19) {
                    System.out.println("Kova Burcu");
                } 
                else if(day <=30){
                    System.out.println("Balık Burcu");
                }
                else{
                    System.out.println("Hatalı Giriş");
                }
            }
            if(month == 3){
                if(day<20){
                    System.out.println("Balık Burcu");
                }
                else if(day<=31){
                    System.out.println("Koç Burcu");
                }
                else{
                    System.out.println("Hatalı Giriş");
                }
            }
            if(month == 4){
                if(day<20){
                    System.out.println("Koç Burcu");
                }
                else if(day<=30){
                    System.out.println("Boğa Burcu");
                }
                else{
                    System.out.println("Hatalı Giriş");
                }
            }
            if(month ==5){
                if(day<21){
                    System.out.println("Boğa Burcu");
                }
                else if(day<=31){
                    System.out.println("İkizler Burcu");
                }
                else{
                    System.out.println("Hatalı Giriş");
                }
            }
            if(month ==6){
                if(day<22){
                    System.out.println("İkizler Burcu");
                }
                else if(day<=30){
                    System.out.println("Yengeç Burcu");
                }
                else{
                    System.out.println("Hatalı Giriş");
                }
            }
            if(month ==7){
                if(day<22){
                    System.out.println("Yengeç Burcu");
                }
                else if(day<=31){
                    System.out.println("Aslan Burcu");
                }
                else{
                    System.out.println("Hatalı Giriş");
                }
            }
            if(month ==8){
                if(day<22){
                    System.out.println("Aslan Burcu");
                }
                else if(day<=31){
                    System.out.println("Başak Burcu");
                }
                else{
                    System.out.println("Hatalı Giriş");
                }
            }
            if(month ==9){
                if(day<22){
                    System.out.println("Başak Burcu");
                }
                else if(day<=30){
                    System.out.println("Terazi Burcu");
                }
                else{
                    System.out.println("Hatalı Giriş");
                }
            }
            if(month ==10){
                if(day<22){
                    System.out.println("Terazi Burcu");
                }
                else if(day<=31){
                    System.out.println("Akrep Burcu");
                }
                else{
                    System.out.println("Hatalı Giriş");
                }
            }
            if(month ==11){
                if(day<21){
                    System.out.println("Akrep Burcu");
                }
                else if(day<=30){
                    System.out.println("Yay Burcu");
                }
                else{
                    System.out.println("Hatalı Giriş");
                }
            }
            if(month ==12){
                if(day<21){
                    System.out.println("Yay Burcu");
                }
                else if(day<=31){
                    System.out.println("Oğlak Burcu");
                }
                else{
                    System.out.println("Hatalı Giriş");
                }
            }
        }
        else{
            System.out.println("Hatalı Giriş Yaptınız.");
        }

    }
}