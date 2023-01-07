public class Laki_laki extends Hitung{
    private float tinggiLaki;

    public float getTinggiLaki() {
        return tinggiLaki;
    }

    public void setTinggiLaki(float tinggiLaki) {
        this.tinggiLaki = tinggiLaki;
    }

    public float hitungLaki(float tinggiLaki){
        return (float) ((tinggiLaki-100)-(0.10 * (tinggiLaki-100)));
    }
}
