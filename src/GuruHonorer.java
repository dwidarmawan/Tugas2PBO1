public class GuruHonorer extends Guru{
    private String nipk;
    private String pekerjaan;
    private String jabatan;

    public void tugasDiSekolah(){
        System.out.println("Mengajar sebagai guru honor");
    }

    public void jabatanGuruHonor(){
        System.out.println("Non PNS");
    }

    public String getNipk() {
        return nipk;
    }

    public void setNipk(String nipk) {
        this.nipk = nipk;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    @Override
    public void caraMengajar() {
        System.out.println("Santai");
    }

    @Override
    public void matkulYangDiKuasai() {
        System.out.println("Sejarah");
    }
}
