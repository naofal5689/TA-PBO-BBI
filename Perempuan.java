public class Perempuan extends Hitung{
    private float tinggiPerempuan;

    public float getTinggiPerempuan() {
        return tinggiPerempuan;
    }

    public void setTinggiPerempuan(float tinggiPerempuan) {
        this.tinggiPerempuan = tinggiPerempuan;
    }

    public float hitungPerempuan(float tinggiPerempuan){
        return (float) ((tinggiPerempuan-100)-(0.10 * (tinggiPerempuan-100)));
    }
}
