import java.util.Scanner;
import java.util.Arrays;
public class empat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Dragon of Loowater-----");
        System.out.print("Masukkan jumlah ksatria : ");
        int jumlahksatria = sc.nextInt();
        int[] data = new int[jumlahksatria];

        System.out.print("Masukkan tinggi ksatria : ");
        for (int a = 0; a<(jumlahksatria-1);a++)
            data[a] = sc.nextInt();
        int knights = sc.nextInt();
        Arrays.sort(data);

        int[] isii = null;
        System.out.print("Masukkan jumlah naga : ");
        int jumlahnaga = sc.nextInt();
        isii = new int[jumlahnaga];

        System.out.print("Masukkan diameter naga : ");
        for (int b = 0; b<(jumlahnaga-1); b++)
            isii[b] = sc.nextInt();
        int dragons = sc.nextInt();
        Arrays.sort(isii);

        int indeksnaga = 0;
        int power = 0;

        for (int x : isii) {
            if (indeksnaga < isii.length) {
                if (x >= isii[indeksnaga]) {
                    power += x;
                    indeksnaga++;
                }
            }
        }
        if (indeksnaga == isii.length) {
            System.out.println("Minimum Power : " + power);
        } else {
            System.out.println("Knight Fall");
        }
    }
}
