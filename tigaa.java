import java.util.Scanner;
import java.util.Arrays;
public class tigaa {
    public static void main(String[] args) {
        int [] data = null;
        int awal, tengah, akhir, temp;
        System.out.println("-----BINARY SEARCH-----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int jumlahdata = sc.nextInt();
        data = new int[jumlahdata];

        System.out.print("Masukkan " + jumlahdata + " angka : ");

        for (int a = 0; a<jumlahdata; a=a+1)
            data[a] = sc.nextInt();
        System.out.print("Masukkan angka yang ingin dicari : ");
        int find = sc.nextInt();
        Arrays.sort(data);

        awal = 0;
        akhir = jumlahdata-1;
        tengah = (awal+akhir)/2;

        while(awal <= akhir){
            if(data[tengah] < find)
                awal = tengah + 1;
            else if (data[tengah] == find){
                System.out.println("Angka " + find + " ditemukan pada index ke " + tengah);
                System.out.println("  ");
                break;
            }
            else
                akhir = tengah -1 ;
                tengah = (awal+akhir)/2;
        }
        if (awal > akhir ){
            System.out.println("Angka " + find + " tidak ditemukan");
        }

    }
}
