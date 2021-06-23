import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil,yil2,yil3, yil4;
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz:");
        yil = input.nextInt();
        yil2 = yil%4;
        yil3 = yil%100;
        if(yil2==0)
        {
            if(yil3==0)
            {
                yil4= yil%400;
                if(yil4==0) System.out.println(yil+ " artık bir yıldır!");
                else System.out.println(yil+ " artık bir yıl değildir!");
            }else {
                System.out.println(yil+ " artık bir yıldır!");
            }

        }else System.out.println(yil+ " artık bir yıl değildir!");
    }
}
