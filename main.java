import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String nama, asal_kota,usia;
        int jenis_kelamin, tgl, bln, thn;
        float berat, tinggi, bmi, meter, hasilP, hasilL;
        double broca;
        Laki_laki l = new Laki_laki();
        Perempuan p = new Perempuan();
        bmi b = new bmi();

        // main Menu
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
        System.out.println("Masukan Bulan Lahir Anda\t:");
        bln = input.nextInt();
        System.out.println("Masukan Tahun Lahir Anda\t:");
        thn = input.nextInt();
        System.out.println("Masukan Jenis Kelamin\t:");
        jenis_kelamin = input.nextInt();
        System.out.println("Masukan Berat Badan\t:");
        berat = input.nextFloat();
        System.out.println("Masukan Tinggi Badan\t:");
        tinggi = input.nextFloat();
        meter = tinggi / 100;

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
        System.out.print("BMI: " + bmi + " ");

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