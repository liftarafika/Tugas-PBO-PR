import java.util.Scanner;
public class satu {
    public static void main(String[] args){
        System.out.println("------Check Prime Number------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        int check = 0;

        for (int i=2; i<=angka; i++){
            if (angka%i==0)
            {check++;}
        }
        if (check == 1) {
            System.out.println(angka + " merupakan bilangan prima");
        }
        else {
            System.out.println(angka + " bukan merupakan bilangan prima");
        }
    }
}

