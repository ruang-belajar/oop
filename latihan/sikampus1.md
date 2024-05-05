# Sistem Informasi Kampus

## Desain Database
- mahasiswa
  - nim: VARCHAR(10) PRIMARY KEY
  - nama: VARCHAR(30)
  - alamat: TEXT
  - angkatan: VARCHAR(4)
  - lahirTempat: VARCHAR(20)
  - lahirTanggal: DATE
  - usersId: VARCHAR(20)
  - status: ENUM(AKTIF,LULUS,DO)
- dosen
  - nid: VARCHAR(10)
  - nama: VARCHAR(30)
  - status: ENUM(AKTIF,CUTI,RESIGN)
- users
  - id: VARCHAR(20)
  - password: VARCHAR(32) 
  - status: ENUM(AKTIF,NONAKTIF)
- mataKuliah:
  - id: VARCHAR(10)
  - nama: VARCHAR(30)
- kelas:
  - id: VARCHAR(10)
  - dosenNid: VARCHAR(10)
  - status: ENUM(AKTIF,SELESAI,BATAL)
- peserta:
  - kelasId: VARCHAR(10)
  - nim: VARCHAR(10)
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
    + ipk: Double
  * method:
    + tambah()
    + update()
    + baca(nim: String)
    + rekalkulasiIpk() 
* Dosen
  * property
    + nid: String
    + nama: String
    + status: String
  * method:
    + tambah()
    + update() 
    + baca(nid: String)
* Users
  * property:
    + id: String
    + status: String
  * method:
    + tambah()
    + update()
    + baca(id: String)
* MataKuliah:
  * property:
    + kode: String
    + nama: String
    + status: ENUM(AKTIF,NONAKTIF)
  * method: 
    + tambah()
    + update() 
    + baca(kode: String)
* kelas:
  * property:
    + kode: String
    + dosenNid: String
    + status: String
  * method:
    + tambah()
    + update()
    + baca(kode: String)
    + tambahPeserta(nim: String)
    + getPeserta(): List<Peserta>
* peserta:
  * property:
    + kelasKode: String
    + nim: String
    + kehadiran: Double
    + tugas: Double
    + ujian: Double
    + grade: String
  * method:
    + tambah()
    + update()
    + baca(kelasKode: String, nim: String)
    + hapus()
    
```