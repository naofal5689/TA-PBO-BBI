import java.util.Scanner; // untuk menginputkan
public class main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        String nama, asal_kota,usia;
        int jenis_kelamin, tgl, bln, thn;
        float berat, tinggi, bmi, meter, hasilP, hasilL;
        double broca;
        Laki_laki l = new Laki_laki();
        Perempuan p = new Perempuan();
        bmi b = new bmi();

        // Menu awal
        System.out.println();
        System.out.println("Program Java Menghitung Berat Badan Ideal ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Silahkan Inputkan Identitas");
        System.out.println("1. Nama");
        System.out.println("2. Usia");
        System.out.println("3. Asal");
        System.out.println("4. Tanggal Lahir");
        System.out.println("5. Bulan Lahir");
        System.out.println("6. Tahun Lahir");
        System.out.println();
        System.out.println("Pilih Jenis Kelamin");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        System.out.println("-------------------------------------------");

        // logic
        System.out.println("Masukan Nama Lengkap Anda\t:");
        nama = input.nextLine();
        System.out.println("Masukan Usia Anda\t:");
        usia = input.nextLine();
        System.out.println("Masukan Asal Kota Anda\t:");
        asal_kota = input.nextLine();
        System.out.println("Masukan Tanggal Lahir Anda\t:");
        tgl = input.nextInt();
        System.out.println("Masukan Bulan Lahir Anda (angka)\t:");
        bln = input.nextInt();
        System.out.println("Masukan Tahun Lahir Anda\t:");
        thn = input.nextInt();
        System.out.println("Masukan Jenis Kelamin | 1. Laki-laki | 2. Perempuan |\t:");
        jenis_kelamin = input.nextInt();
        System.out.println("Masukan Berat Badan (kg)\t:");
        berat = input.nextFloat();
        System.out.println("Masukan Tinggi Badan (cm)\t:");
        tinggi = input.nextFloat();
        meter = tinggi / 100;

        // spasi
        System.out.println();
        System.out.println();

        // Menampilkan hasil inputan
        System.out.println("Haaiii " + nama);
        System.out.println("Yang berusia " + usia + " tahun");
        System.out.println("Asal dari " + asal_kota);
        System.out.println("Yang Lahir pada " + tgl + "-" + bln + "-" + thn);
        System.out.println("Berjenis kelamin " + jenis_kelamin);
        System.out.println("Dengan berat badan " + berat + " kg");
        System.out.println("Dan tinggi badan " + tinggi + " cm");

        // spasi
        System.out.println();
        System.out.println();

        // rumus BMI (Body Mass Index)

        // perhitungan dengan rumus broca
        switch (jenis_kelamin)
        {
            case 1 :
                hasilL = l.hitungLaki(tinggi);
                System.out.println("Berat badan ideal anda menurut Broca : "+hasilL);
                break;
            case 2 :
                hasilP = p.hitungPerempuan(tinggi);
                System.out.println("Berat badan ideal anda menurut Broca : "+hasilP);
                break;
            default :
                broca = 0;
        }

        bmi = b.hitungBmi(berat,meter);

        // cetak Berat Badan BMI
        System.out.print("Hasil perhitungan BMI yaitu: " + bmi + " dengan kategori ");

        if (bmi < 18.5){
            System.out.println("Kurus");
        } else if (bmi <= 22.9){
            System.out.println("Normal");
        } else if (bmi < 24.9){
            System.out.println("Overweight");
        } else {
            System.out.println("Obesitas");
        }

        System.out.println();
//        hasil = (int) broca;
//        System.out.println("Berat Badan Ideal Anda Menurut Broca " + hasil + " Kg");
    }
}