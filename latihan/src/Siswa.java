class Siswa {
    private String nama;
    private int umur;
    private String nis; // Nomor Induk Siswa
    private String kelas;

    public Siswa(String nama, int umur, String nis, String kelas) {
        this.nama = nama;
        this.umur = umur;
        this.nis = nis;
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    // Method untuk menampilkan informasi siswa
    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur);
        System.out.println("NIS   : " + nis);
        System.out.println("Kelas : " + kelas);
    }
}
