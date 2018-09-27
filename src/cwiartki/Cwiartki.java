package cwiartki;
import java.util.Scanner;

public class Cwiartki {

    public static void main(String[] args) {

        double x;
        double y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź wspołrzędną X");
        x = scan.nextDouble();

        System.out.println("Wprowadź wspołrzędną Y");
        y = scan.nextDouble();
        scan.nextLine();


        if (x>0 && y>=0) {
            System.out.println("ćwiartka pierwsza");
        } else if (x>=0 && y<0) {
            System.out.println("ćwiartka druga");
        } else if (x<0 && y<=0) {
            System.out.println("ćwiartka trzecia");
        } else if (x<=0 && y>0) {
            System.out.println("ćwiartka czwarta");
        } else {
            System.out.println("Początek układu - punkt (0,0)");
        }

    }

}
