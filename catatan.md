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
- [Ruang Belajar - Java / Cheatsheet](https://github.com/ruang-belajar/java/blob/main/docs/00-cheatsheet-1.md)
- [Ruang Belajar - Java / GUI](https://github.com/ruang-belajar/java/blob/main/docs/20-gui.md)
- [Ruang Belajar - Java / GUI Reference](https://github.com/ruang-belajar/java/blob/main/docs/20-gui-referensi.md)
- Pelajari tutorial berikut:
	- [Kelas Tersembunyi - Tutorial GUI Java - Mengubah Nilai TextField Dan Jlabel Dengan Tombol](https://www.youtube.com/watch?v=28KrP9615DQ)
	- [MDN Channel - hitung luas dan keliling persegi panjang menggunakan JFrame Netbeans](https://www.youtube.com/watch?v=2q8Xwh4Cu78)
- Latihan: 
	- Folder: **Persegi1**
		- buat form untuk menghitung luas dan keliling persegi panjang.
		- Ketika tombol "Hitung" diklik, maka *Luas* dan *Keliling* akan muncul.
	- Tambahkan element *tinggi* menggunakan JSpinner, luas menjadi perhitungan *volume*.
	- Tambahkan combo box (cm/m/km). Tambahkan *satuan* pada luas (contoh: *30 cm kubik*)
- **Tugas:**
	- 💼 Folder: **Pos1**
		- buat form input barang yang terdiri dari:
			- *Nama Barang*: `JComboBox`
			- *Harga*: `JLabel`
			- *Qty*: `JTextField`
			- *Hitung*: `JButton`
		- Ketika barang dipilih, maka label *Harga* akan memunculkan harga barang.
		- Harga barang:
			- Pensil: Rp. 6.000
			- Penggaris: Rp.7.000
			- Ballpoint: Rp. 13.000
		- Ketika tombol *Hitung* diklik, maka muncul nilai total (*harga* x *qty*) berupa *message box*.
		- Gunakan `JOptionPane` untuk memunculkan *message box*.

## Pertemuan 10

- Review Tugas
- Prep database `kampus`.
	- Buat tabel `mahasiswa`
		- `nik`: VARCHAR(20) PRIMARY
		- `nama`: VARCHAR(50)
		- `jeniskelamin`: CHAR(1)
		- `lahirTahun`: INT
	- Buat tabel `dosen`
		- `nip`: VARCHAR(20) PRIMARY
		- `nama`: VARCHAR(50)
		- `masukTahun`: INT
- [Koneksi ke database](https://github.com/ruang-belajar/java/blob/main/docs/22-koneksi-database.md)
- Buat project 💼 `Kampus1`
	- ⚠️ Untuk selanjutnya, setiap form buat dalam project ini.
- Buat 💼 `FormMahasiswa1`
	- Buat Text Field *NIM* & *Nama*
	- Buat tombol **CARI**, **UPDATE**, **INSERT**
- **Tugas:**
	- Tambahkan text field *Tahun Lahir*
		- text: *[kosong]*
	- Tambahkan combo box *Jenis Kelamin*
		- model: *L, P*
	- Tambahkan tombol **DELETE**.
		- text: *Hapus*

## Pertemuan 11

- Review tugas
- Membuat class 💼 `Mahasiswa`
	```
	Mahasiswa
	==========
	+ nik
	+ nama
	+ jenisKelamin
	+ lahirTahun
	----------
	+ getUmur(): int
	+ insert(): boolean
	+ update(): boolean
	+ baca(nik): boolean
	+ load(nik): TMahasiswa <STATIC>
	+ hapus(nik): void <STATIC>
	+ list(): ArrayList <STATIC>
	```
- [Membuat fungsi *static*](https://github.com/ruang-belajar/java/blob/main/docs/12-static.md)
- Buat 💼 `FormMahasiswa2` 
- Buat proses yang sama dengan FormMahasiswa1, proses *INSERT, DELETE, UPDATE, SELECT*. Gunakan method yang disediakan class `Mahasiswa`.
- Membuat method `getUmur()`:
	- Google Search: [java get current year](https://www.google.com/search?q=java+get+current+year).

## Pertemuan 12

- Review
	- Lengkapi class `Mahasiswa` sesuai class diagram (`getUmur()`, `insert()`, `update()`, `baca()`, `hapus()`, `load()`)
- Buat `list()` class `Mahasiswa`
	```java
	public static ArrayList<String[]> list() {
        Connection connection = null;
        
        // siapkan array yang akan menampung hasil
        ArrayList<String[]> hasil = new ArrayList<>();
        
        try {
            // buat koneksi ke server mysql.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kampus", "root", "");

            // siapkan objek statement untuk query
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;

            // eksekusi query
            resultSet = statement.executeQuery("select * from mahasiswa");

            // baca dan tampilkan data dari query
            while(resultSet.next()) {
                hasil.add(new String[]{
                    resultSet.getString("nik"),
                    resultSet.getString("nama")
                });
            } 
            // hapus objek dan koneksi
            resultSet.close();
            statement.close();
            connection.close();
            return hasil;
        }
        catch (Exception exception) {
            // tampilkan pesan error (jika terjadi kesalahJan)
            return null;
        }
    }
	```
- Buat `FormDaftarMahasiswa`
	- Tambahkan `daftarMahasiswa` : `JTable`
	- Tambahkan `tombolLoad` : `JButton`
		- text: *Load*
		- actionPerformed
			```java
			DefaultTableModel model = (DefaultTableModel) daftarMahasiswa.getModel();

	        ArrayList<String[]> dataList = Mahasiswa.list();
	        for (String[] row : dataList) {
	            model.addRow(row);
	        }
			```
	- Tambahkan method `tampilkan()` di class `FormMahasiswa2`
		```java
		public void tampilkan(String nik) {
	        textNim.setText(nik);
	        tombolCari.doClick();
	        setVisible(true);
	    }
		```
	- Tambahkan `tombolEdit` : `JButton`
		```java
		int viewRow = daftarMahasiswa.getSelectedRow();

		if (viewRow != -1) {
			// 1. Convert the view index to the model index
			//    (crucial for sorted/filtered tables)
			int modelRow = daftarMahasiswa.convertRowIndexToModel(viewRow);

			// 2. Fetch data from a specific column index (e.g., column 0)
			String nik = (String) daftarMahasiswa.getModel().getValueAt(modelRow, 0);
			
			//new FormMahasiswa2().tampilkan(nik);
			FormMahasiswa2 form = new FormMahasiswa2();
			form.tampilkan(nik);
		}
		```

## Pertemuan 13

- Modifikasi `FormDaftarMahasiswa`
	- Tambah `tombolHapus`: `JButton`
		- actionPerformed: hapus entry yang dipilih
- **Tugas & kehadiran pertemuan 14**
	- Buat tabel `buku` dengan detail sebagai berikut:
		- kode VARCHAR(20)
		- judul VARCHAR(50)
		- pengarang VARCHAR(50)
		- tahunBeli INT
		- hargaBeli INT
	- Buat class `Buku` mengikuti *class diagram* berikut:
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

	- Buat 💼 `FormBuku`
	- Tambahkan text field untuk kode, judul, pengarang, tahun beli dan harga beli.
	- Tambahkan tombol *Cari, Update, Tambah* dan *Hapus*. Tambahkan kode program sesuai fungsinya
	- Di `FormUtama`, tambahkan menu *Utility - Buku*, tambahkan kode untuk membuka `FormBuku` pada menu tersebut
- Java dalam bahasa pemrograman lain: *C++, JavaScript, PHP, Python, Rust, VBA, C*.
	- Kode program
		```java
		abstract class BangunDatar {
		    String warna;
		
		    public BangunDatar(String warna) {
		        this.warna = warna;
		    }
		
		    abstract double hitungLuas();

		    public void info() {
		        System.out.println("Bangun datar ini berwarna " + warna);
		    }
		}
		
		class Lingkaran extends BangunDatar {
		    double jariJari;
		
		    public Lingkaran(String warna, double jariJari) {
		        super(warna); 
		        this.jariJari = jariJari;
		    }
		
		    @Override
		    double hitungLuas() {
		        return Math.PI * jariJari * jariJari;
		    }
		}
		```
	