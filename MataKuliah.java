public class Matkul {
    String kodeMK;
    String namaMK;
   double nilaiAngka;

    public Matkul(String kodeMK, String namaMK, double nilaiAngka) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.nilaiAngka = nilaiAngka;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public double getNilaiAngka() {
        return nilaiAngka;
    }

    public String getNilaiHuruf() {
        if (nilaiAngka >= 80) {
            return "A";
        } else if (nilaiAngka >= 70) {
            return "B";
        } else if (nilaiAngka >= 60) {
            return "C";
        } else if (nilaiAngka >= 50) {
            return "D";
        } else {
            return "E";
        }
    } 
}
