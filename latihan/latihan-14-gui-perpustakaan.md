
💠 Siapkan database MySQL `perpustakaan`

💠 Buat tabel `buku` dengan detail sebagai berikut:
- kode VARCHAR(20)
- judul VARCHAR(50)
- pengarang VARCHAR(50)
- tahunBeli INT
- hargaBeli INT

💠 Buat class `Buku` mengikuti class diagram berikut:
```
=======================
Buku
-----------------------
+ kode: String
+ judul: String
+ pengarang: String
+ tahunBeli: int
+ hargaBeli: int
-----------------------
+ tambah(): boolean
+ update(): boolean
+ baca(kode): boolean
+ hapus(kode): void <STATIC>
=======================
```

💠 Buat `FormBuku`

💠 Tambahkan text field untuk kode, judul, pengarang, tahun beli dan harga beli.