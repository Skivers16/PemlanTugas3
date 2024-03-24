public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("2315040711013", "Fariez Imaddin Aslam F");

        mahasiswa.tambahMataKuliah(new Matkul("MK001", "Statistika", 85));
        mahasiswa.tambahMataKuliah(new Matkul("MK002", "Pemograman Lanjut", 75));
        mahasiswa.tambahMataKuliah(new Matkul("MK003", "PPB", 90));
        mahasiswa.tambahMataKuliah(new Matkul("MK004", "DBD", 95));
        mahasiswa.tambahMataKuliah(new Matkul("MK005", "Agama Islam", 65));



        cetakKHS(mahasiswa);
    }

    public static void cetakKHS(Mahasiswa mahasiswa) {
        System.out.println("KHS Mahasiswa:");
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Mata Kuliah:");

        for (Matkul mk : mahasiswa.getMataKuliahList()) {
            System.out.println("- Kode MK: " + mk.getKodeMK());
            System.out.println("  Nama MK: " + mk.getNamaMK());
            System.out.println("  Nilai Huruf: " + mk.getNilaiHuruf());
        }
    }
}