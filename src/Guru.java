import java.util.Date;

public class Guru {
    private int id;
    private String namaLengkap;
    private String kodeNama;
    private String nip;
    private String mataKuliah;
    private String pendidikanTerakhir;
    private String tanggalLahir;
    private String alamat;

    public Guru() {

    }

    public Guru(int id, String namaLengkap, String kodeNama, String nip, String mataKuliah, String pendidikanTerakhir, String tanggalLahir, String alamat) {
        this.id = id;
        this.namaLengkap = namaLengkap;
        this.kodeNama = kodeNama;
        this.nip = nip;
        this.mataKuliah = mataKuliah;
        this.pendidikanTerakhir = pendidikanTerakhir;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
    }

    public Guru(String namaLengkap, String nip) {
        this.namaLengkap = namaLengkap;
        this.nip = nip;
    }



    public void mengajarDiKelas(){
        System.out.println("12 IPS 1");
    }

    public void matkulYangDiKuasai(){
        System.out.println("Geografi");
    }

    public void caraMengajar(){
        System.out.println("Baik dan mudah untuk dipahami");
    }

    public void memberikanPenilaianPadaSiswa(){
        System.out.println("Sangat baik");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getKodeNama() {
        return kodeNama;
    }

    public void setKodeNama(String kodeNama) {
        this.kodeNama = kodeNama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
