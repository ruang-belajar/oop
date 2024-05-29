# Sistem Informasi Kampus

## Desain Database
- mahasiswa
  - nim: VARCHAR(10) PRIMARY KEY
  - nama: VARCHAR(30)
  - alamat: TEXT
  - angkatan: VARCHAR(4)
  - lahirTempat: VARCHAR(20)
  - lahirTanggal: DATE | NULL
  - usersId: VARCHAR(20) --> tidak jadi dipakai
  - status: ENUM(AKTIF,LULUS,DO)
  - ipk: DOUBLE
- dosen
  - nid: VARCHAR(10) PRIMARY KEY
  - nama: VARCHAR(30)
  - status: ENUM(AKTIF,CUTI,RESIGN)
- users
  - id: VARCHAR(10) PRIMARY KEY
  - passwd: VARCHAR(32) 
  - tipe: ENUM(DOSEN,SISWA)
  - status: ENUM(AKTIF,NONAKTIF)
- mataKuliah:
  - kode: VARCHAR(10) PRIMARY KEY
  - nama: VARCHAR(30)
  - status: ENUM(AKTIF,NONAKTIF)
- kelas:
  - kode: VARCHAR(10) PRIMARY KEY
  - dosenNid: VARCHAR(10)
  - status: ENUM(AKTIF,SELESAI,BATAL)
- peserta:
  - kelasKode: VARCHAR(10) PRIMARY KE
  - nim: VARCHAR(10) PRIMARY KEY
  - kehadiran: DOUBLE
  - tugas: DOUBLE
  - ujian: DOUBLE
  - grade: VARCHAR(1)

## Site Map
- **Login**
- **Halaman Utama** (Mahasiswa)
  - link ke **Profil**
  - link ke **Daftar Nilai**
- **Halaman Utama** (Dosen)
  - link ke **Profil**
  - link ke **Daftar Kelas**
- **Halaman Utama** (Admin)
  - link ke **Profil**
  - link ke **Daftar Mata Kuliah**
  - link ke **Daftar Kelas**
  - link ke **Daftar Mahasiswa**
- **Profil**: menampilkan informasi user dan form untuk ganti password 
- **Daftar Nilai**: berisi list kelas dan nilai mahasiswa
- **Daftar Kelas**: Hanya bisa diakses dosen dan admin.
  - link ke **Detail Kelas** untuk tambah dan update _kelas_
- **Daftar Mata Kuliah**: bisa diakses oleh admin dan dosen
  - link ke **Detail Mata Kuliah** untuk tambah dan update _mata kuliah_.
- **Daftar Kelas**: bisa diakses oleh admin dan dosen.
  - link ke **Detail Kelas** untuk tambah dan update _kelas_
- **Daftar Mahasiswa**: Menampilkan, update, menambah mahasiswa
- **Detail Kelas**: Tambah, update kelas, menampilkan peserta, menambahkan peserta
- **Detail Mata Kuliah**: Tambah & update kelas
- **Daftar User**: Tambah dan Update user, Ganti Password

## Class Diagram
```
* Mahasiswa
  * property:
    + nim: String
    + nama: String
    + alamat: String
    + angkatan: String
    + lahirTempat: String
    + lahirTanggal: Date
    + usersId: String
    + status: String
    - ipk: Double
    # errMsg: String
  * method:
    + tambah(): boolean
    + update(): boolean
    + baca(nim: String)
    + rekalkulasiIpk() 
    + getIpk(): Double
    + getList(): List<Mahasiswa>
    - getErrMsg(): String
* Dosen
  * property
    + nid: String
    + nama: String
    + status: String
    # errMsg: String
  * method:
    + tambah(): boolean
    + update(): boolean
    + baca(nid: String)
    + getList(): List<Dosen>
    - getErrMsg(): String
* MataKuliah:
  * property:
    + kode: String
    + nama: String
    + status: ENUM(AKTIF,NONAKTIF)
    # errMsg: String
  * method: 
    + tambah(): boolean
    + update(): boolean
    + baca(kode: String)
    + getList(): List<MataKuliah>
    - getErrMsg(): String
* Kelas:
  * property:
    + kode: String
    + dosenNid: String
    + status: String
    # errMsg: String
  * method:
    + tambah(): boolean
    + update(): boolean
    + baca(kode: String)
    + tambahPeserta(nim: String)
    + getPeserta(): List<Peserta>
    + getList(): List<Kelas>
    - getErrMsg(): String
* peserta:
  * property:
    + kelasKode: String
    + nim: String
    - mahasiswaNama: String
    + kehadiran: Double
    + tugas: Double
    + ujian: Double
    # errMsg: String
  * method:
    + tambah(): boolean
    + update(): boolean
    + baca(kelasKode: String, nim: String)
    + hapus(): boolean
    + getMahasiswaNama(): String
    # getErrMsg(): String
    + getList(kelasKode: String): List<Peserta>

        
```