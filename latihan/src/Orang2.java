public class Orang2 {
    // property
    private String namaDepan;
    private String namaBelakang;

    public Orang2(String depan, String belakang) {
        this.namaDepan = depan.toUpperCase();
        this.namaBelakang = belakang.toUpperCase();
    }

    public String getNamaBelakang() {
        return this.namaBelakang;
    }

    public String getNamaDepan() {
        return this.namaDepan;
    }

}
