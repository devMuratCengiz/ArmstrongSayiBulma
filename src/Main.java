import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,tempNumber,basamak=0,sonuc=0;
        System.out.println("Enter number: ");
        number = scanner.nextInt();
        tempNumber = number;
        while(tempNumber!=0) {
            tempNumber /= 10;
            basamak++;
        }
        System.out.println("Basamak: " + basamak);
        tempNumber = number;
        while(tempNumber!=0) {
            System.out.println(tempNumber%10);
            sonuc += Math.pow(tempNumber%10,basamak);
            tempNumber /= 10;
        }

        if(sonuc==number){
            System.out.println("Bu sayı bir Armstrong Sayıdır.");
        }else {
            System.out.println("Bu sayı bir Armstron Sayı değildir!");
        }
    }
}