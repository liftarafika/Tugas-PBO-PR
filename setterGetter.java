public class setterGetter {
    public static void main(String[] args) {

        class Anggota {
            String namaAnggota;
            int idAnggota;
            String Gender;
            String email;
            int nomorHp;
            String Periode;
            int jumlahAcaraikut;
            int jumlahpertemuanikut;

            public Anggota(String nama, int id, String gen, int acara, int temu) {
                namaAnggota = nama;
                Gender = gen;
                jumlahAcaraikut = acara;
                jumlahpertemuanikut = temu;
            }

            public void setPeriode(String z) {
                this.Periode = z;
            }

            public String getPeriode() {
                return this.Periode;
            }
        }

            //insialisasi objek
            Anggota anggota1 = new Anggota("Alifta Rafika", 1101, "Wanita", 3, 5);
            Anggota anggota2 = new Anggota("Linanda Savitri", 1002, "Wanita", 2, 6);
            Anggota anggota3 = new Anggota("Noraini Latifah", 1003, "Wanita", 4, 3);
            Anggota anggota4 = new Anggota("Aisyah Auliana", 1004, "Wanita", 3, 5);
            Anggota anggota5 = new Anggota("Rayyan Rizky", 1005, "Pria", 2, 5);
            Anggota anggota6 = new Anggota("Daffa Muhammad", 1006, "Pria", 3, 6);

            System.out.println("CLASS ANGGOTA");

            //setter method
            System.out.println("Setter method ");
            anggota1.setPeriode("2020/2021");
            anggota2.setPeriode("2020/2021");
            anggota5.setPeriode("2019/2020");
            System.out.println("Periode anggota 1 : " + anggota1.Periode);
            System.out.println("Periode anggota 2 : " + anggota2.Periode);
            System.out.println("Periode anggota 5 : " + anggota5.Periode);

            //getter methode
            System.out.println("\nGetter method ");
            System.out.println(anggota1.getPeriode());
            System.out.println(anggota2.getPeriode());
            System.out.println(anggota5.getPeriode());

        class UKM {
            String Fakultas;
            String Universitas;
            String NamaUKM;
            Anggota anggota1;
            Anggota anggota2;
            Anggota anggota3;
            Anggota anggota4;
            Anggota anggota5;
            Anggota anggota6;
            int jumlahAcara;
            String acara;
            int jumlahpertemuan;

            public UKM(String a, String b, String c) {
                Fakultas = a;
                Universitas = b;
                NamaUKM = c;
            }

            public void setAcara(String f) {
                this.acara = f;
            }

            public String getAcara() {
                return this.acara;
            }
        }
            //insialisasi objek
            UKM LAOS = new UKM("Ilmu Komputer", "Universitas Jember", "LAOS");

            System.out.println("\nCLASS UKM");

            //setter method
            System.out.println("Setter method ");
            LAOS.setAcara("LAOS ARENA");
            System.out.println("Acara : " + LAOS.acara);
//            System.out.println(" ");

            //Getter method
            System.out.println("\nGetter method ");
            System.out.println(LAOS.getAcara());

    }

}
