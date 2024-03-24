import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    String NIM;
    String Nama;
    List<Matkul> mataKuliahList;

    public Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.mataKuliahList = new ArrayList<>();
    }
    public void tambahMataKuliah(Matkul mataKuliah) {
        mataKuliahList.add(mataKuliah);
    }

    public String getNim() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public List<Matkul> getMataKuliahList() {
        return mataKuliahList;
    }
}