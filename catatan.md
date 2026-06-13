# Catatan Kuliah 2026

## Pertemuan 1
- [Pendahuluan](01-pendahuluan.md)
- [Terminologi OOP](terminologi-penting.md)
- Latihan
  - Check [Latihan 1](latihan/latihan-01.md)
- Tugas:
  - Download & install [JDK 21](https://www.oracle.com/id/java/technologies/downloads/#jdk21-windows)
  - Download & install [Visual Studio Code](https://code.visualstudio.com/download)
		- [Extension Pack for Java](marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
  - Buat akun [Github](https://github.com)
  - Download & Install [Github Desktop](https://desktop.github.com)

## Pertemuan 2
- Review Scratch:
	- Contoh Scratch: [Spaceship 1](https://scratch.mit.edu/projects/1299234602)
- [Review Java](https://github.com/ruang-belajar/java/)
  - Materi umum:
    - Variabel
    - Operasi
    - IF
    - Loop
    - Membuat fungsi
    - Menggunakan fungsi standard  
  - [Syntax dasar](https://github.com/ruang-belajar/java/blob/main/docs/03-syntax.md)
  - Hal yang perlu diperhatikan
    - Java adalah bahasa pemrograman yang _case sensitive_
    - Perhatikan aturan penulisan nama variabel (_naming convension_)
    - Nama _class_ selalu sama dengan nama file
- [Membuat Class](02-membuat-class.md)
	- Method & Property
- Latihan: GameTebakAngka
	- GameTebakAngka dengan paradigma imperatif
	- GameTebakAngka dengan implementasi OOP

## Pertemuan 3
- Review membuat class
- [4 Pilar OOP](03-4-pilar.md): [Encapsulation](03-encapsulation.md)
- GameTebakAngka dengan implementasi prinsip *Encapsulation*.
- Intro: Constructor
- Latihan:
	- Buat class `Lingkaran`
	- Tentukan dan buat properti dan method

## Pertemuan 4
* Review *Encapsulation*
* Review: *Constructor*
	* `super()`
* 4 Pilar OOP: [Inheritance](03-inheritance.md)
* Latihan:
	* Buat class `Orang` 
		* constructor `Orang(namaDepan, namaBelakang)`
			* konversi `namaDepan` dan `namaBelakang` menjadi huruf kapital
		* property private: `namaDepan`, `namaBelakang`
		* method public: `getNamaDepan()`, `getNamaBelakang()`
	* Buat class `LatihanOrang` untuk menguji class `Orang`
	* Buat class `OrangSunda` turunan dari `Orang`
		* method `namaPanggilan()`, contoh output:
			* `Aa Budi`
			* `Aa Asep`
	* Buat class `OrangJawa` turunan dari `Orang`
		* constructor `OrangJawa(namaDepan, namaBelakang, jenisKelamin)`		* 
		* method `namaPanggilan()`, contoh output:
			* `Mba Yanti`
			* `Mas Mono`
* **Tugas:**
	* Buat class `SuperHero` (file 💼 `SuperHero.java`) yang merupakan turunan dari `Orang`
		* Tambahkan property `alias`
		* `SuperHero` memiliki konstruktor `SuperHero(namaDepan, namaBelakang, alias)`
		* Buat method `namaPanggilan()` dengan contoh output sebagai berikut:
			* `Bruce "Batman" Wayne`
			* `Clark "Superman" Kent`
			* `Diana "Wonder Woman" Prince`
		* Buat class `LatihanSuperHero` (file 💼 `LatihanSuperHero.java`) untuk menguji class `SuperHero()`
	* Buat class `Celsius` (file 💼  `Celcius.java`)
		* `Celcius` memiliki konstruktor `Celcius(suhu)`
		* method `fahrenheit()`, `kelvin()`, `reamur()`
		* Buat class `LatihanCelsius` (file 💼  `LatihanCelcius.java`) untuk menguji class `Celsius()`

## Pertemuan 5 (🤔)


## Pertemuan 6

- Review tugas
- 4 Pilar OOP: [Polimorphism](03-polymorphism.md)

## Pertemuan 7

- Review [Polimorphism](03-polymorphism.md) & [Inheritance](03-inheritance.md)
- 4 Pilar OOP: [Abstraction](03-abstraction.md)
	- [latihan/abstraction/](latihan/abstraction/)
- [Simulasi UTS](https://docs.google.com/forms/d/e/1FAIpQLSco9hkcFV78rdCKJF8MencuiiBPnjOrHIAqoMXdRy1hw60-oA/viewform?usp=header)
	- Bahas [SuperHero.java](latihan/src/SuperHero.java)

---

## UTS

---

## Pertemuan 8

* Review [4 Pilar OOP](03-4-pilar.md): [Encapsulation](03-encapsulation.md), [Inheritance](03-inheritance.md), [Polimorphism](03-polymorphism.md) & [Inheritance](03-inheritance.md)
* [UML](06-uml.md)
* [Class Diagram](06-uml-class-diagram.md)
	* [Latihan UML: Model Java](latihan/latihan-13-uml-java-model.md)
* Latihan:
	* [Latihan UML: Model Laravel](latihan/latihan-13-uml-laravel-model.md)
	* [Latihan 10: Class Diagram to Code](latihan/latihan-10.md). **Soal 1**
* **Tugas:**
	* [Latihan 10: Class Diagram to Code](latihan/latihan-10.md). **Soal 2** (File: 💼 `Animal.java`, 💼 `Duck.java`, 💼 `Fish.java`, 💼 `Zebra.java`)

## Pertemuan 9

- Review **Netbeans**
- 🟡 Semua project yang dibuat menggunakan Netbeans, simpan di *folder-kerja/GUI*
- [Ruang Belajar - Java / GUI](https://github.com/ruang-belajar/java/blob/main/docs/20-gui.md)
- [Ruang Belajar - Java / GUI Reference](https://github.com/ruang-belajar/java/blob/main/docs/20-gui-referensi.md)
- Pelajari tutorial berikut:
	- [Kelas Tersembunyi - Tutorial GUI Java - Mengubah Nilai TextField Dan Jlabel Dengan Tombol](https://www.youtube.com/watch?v=28KrP9615DQ)
	- [MDN Channel - hitung luas dan keliling persegi panjang menggunakan JFrame Netbeans](https://www.youtube.com/watch?v=2q8Xwh4Cu78)
- Latihan: 
	- Folder: **Persegi1**
		- buat form untuk menghitung luas dan keliling persegi panjang.
		- Ketika tombol "Hitung" diklik, maka *Luas* dan *Keliling* akan muncul.
	- Folder: **Pos1**
		- buat form input barang yang terdiri dari:
			- *Nama Barang*: JComboBox
			- *Harga*: JLabel
			- *Qty*: JTextBox
			- *Hitung*: JButton
		- Ketika barang dipilih, maka label *Harga* akan memunculkan harga barang.
		- Harga barang:
			- Pensil: Rp. 6.000
			- Penggaris: Rp.7.000
			- Ballpoint: Rp. 13.000
		- Ketika tombol *Hitung* diklik, maka muncul nilai total (*harga* x *qty*) berupa *message box*.
- **Tugas:**
	- 💼 folder: **Bio1**
		- buat form menampilkan form pendaftaran dengan detail sebagai berikut:
			- NIK: `JTextField`
			- Nama: `JTextField`
			- Jenis Kelamin: `JComboBox`
			- Usia: `JSpinner`
			- Simpan: `JButton`
		- Ketika klik tombol *Simpan*, maka muncul *message box*:
			- "Halo Budi, usiamu 30 tahun"
		- Gunakan `JOptionPane` untuk memunculkan *message box*.

## Pertemuan 10

- Prep database `kampus`.
	- `nik`: VARCHAR(20) PRIMARY
	- `nama`: VARCHAR(50)
	- `jeniskelamin`: CHAR(1)
	- `usia`: TINYINT 
- Koneksi ke database
- Membuat class `Mahasiswa`