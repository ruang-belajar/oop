# Catatan Kuliah 2025

## Pertemuan 1
- [Pendahuluan](01-pendahuluan.md)
- [Terminologi OOP](terminologi-penting.md)
- Latihan
  - Check [Latihan 1](latihan/latihan-01.md)
- Tugas:
  - Download & install [JDK 23](https://www.oracle.com/id/java/technologies/downloads/#jdk23-windows)
  - Download & install [Netbeans 25](https://dlcdn.apache.org/netbeans/netbeans-installers/25/Apache-NetBeans-25-bin-windows-x64.exe)  

## Pertemuan 2
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
    - nama _package_ harus sama dengan _nama folder_    
  - [IF](https://github.com/ruang-belajar/java/blob/main/docs/07-pengambilan-keputusan.md)
  - [Looping](https://github.com/ruang-belajar/java/blob/main/docs/08-pengulangan.md)
- [Membuat Class](02-membuat-class.md)
- Kerjakan [Latihan 7](latihan/latihan-07.md)
- Tugas: Buat _class_ `Lingkaran`.
  - Class ini memiliki property `radius`
  - Class ini memiliki method `luas()` untuk menghitung luas
  - Class ini memiliki method `keliling()` untuk menghitung luas
  - Class ini memiliki method `diameter()` untuk menghitung diameter
  - Class ini memiliki method `perbesar(n)` untuk memperbesar `radius` sebanyak `n` kali
- Buat akun Github (nama akun harus bisa dikenali)
- Download & install Github


## Pertemuan 3
- Review tugas
- Setup Github
  - Accept assignment
  - Clone
  - Copy file ke folder repository
  - Commit & Push
  - Buka folder repostory menggunakan Netbeans
- [4 Prinsip OOP](03-4-pilar.md)
  - Prinsip: Inheritance
- Kerjakan **Soal 1** dan **Soal 2** di [Latihan 8](latihan/latihan-08.md) 
- Tugas: Kerjakan **Soal 3** di [Latihan 8](latihan/latihan-08.md) 

## Pertemuan 4
- Review tugas
- [4 Prinsip OOP](03-4-pilar.md)
  - Prinsip: Polymorphism
    - [Demo Polymorphism #1](https://leetcode.com/playground/Sx62MtHF)
    - [Demo Polymorphism #2](https://leetcode.com/playground/GAMmx5F2)
      - Tambahkan fungsi `salam(umur)`
  - Prinsip: Encapsulation
    - [Demo Encapsulation #1](https://leetcode.com/playground/o4fyisto)
    - [Demo Encapsulation #2](https://leetcode.com/playground/mDEJ65mo)
- Gunakan shortcut `Alt+Enter` untuk bantu membuat constructor dari class turunan
- Gunakan shortcut `Alt+Ins` untuk membuat fungsi _setter_ dan _getter_
- Latihan: Kerjakan [Latihan 9](latihan/latihan-09.md) **Soal 1**.\
  Simpan dengan nama file `OrangSunda1.java`
- Tugas: [Latihan 9](latihan/latihan-09.md) **Soal 2**\
  Simpan dalam format _docx_ (MS Word) dengan nama file `UML-OrangSunda1.docx`\
  Upload lewat repository github


## Pertemuan 5
- Review tugas
- [4 Prinsip OOP](03-4-pilar.md): _Abstraction_
- Check [DataKeluarga.java](latihan/abstraction/DataKeluarga.java), [Keluarga.java](latihan/abstraction/Keluarga.java), [Orang.java](latihan/abstraction/Orang.java), [OrangJawa.java](latihan/abstraction/OrangJawa.java), [OrangSunda.java](latihan/abstraction/OrangSunda.java).
- [Class Diagram](06-class-diagram.md)

## Pertemuan 6
- Review: Abstraction
- Analisa kasus: check [Class Diagram](06-class-diagram.md)
- Latihan: Kerjakan [Latihan 10](latihan/latihan-10.md)

---

## Pertemuan 9
- Pelajari tentang bagaimana [membaca input dari user lewat keyboard](https://github.com/ruang-belajar/java/blob/main/docs/04-input-output.md)
    ```java
    import java.util.Scanner;

    public class Bilangan1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n1 = 0;
            int n2 = 0;

            System.out.print("A? ");
            n1 = scan.nextInt();

            System.out.print("B? ");
            n2 = scan.nextInt();

            System.out.print("A x B = "+(n1*n2));

            scan.close();
        }
    }
    ```
- Pelajari tentang [Exception](https://github.com/ruang-belajar/java/blob/main/docs/13-exception.md)
- Latihan, contoh program:
  ```
  class OrangBaru {
    public String nama;
    public Integer usia;
    
    public OrangBaru(String nama, Integer usia) {
        this.nama = nama;
        this.usia = usia;        
    }
    public void panggilan() {
        System.out.println("Bapak/ibu" + this.nama +", usia Anda "+this.usia+" tahun" );
    }
  }
  ```

## Pertemuan 10
- [Java - Koneksi Database](https://github.com/ruang-belajar/java/blob/main/docs/22-koneksi-database.md)
- Menggunakan phpMyAdmin, setup database `test`, import [test.sql](latihan/test.sql)
- Siapkan package baru: `crud`
- Buat file `Mahasiswa.java`:
    ```java
    package crud;

    import java.sql.*;

    public class Mahasiswa {

        public String nim;
        public String nama;
        public Integer nilai;

        public boolean tambah()  {
            String DBDRIVER = "com.mysql.cj.jdbc.Driver";
            String DBCONNECTION = "jdbc:mysql://localhost:3306/test";
            String DBUSER = "root";
            String DBPASS = "";
            
            Connection conn = null;
            PreparedStatement st;

            try {
                Class.forName(DBDRIVER);
                conn = DriverManager.getConnection(DBCONNECTION, DBUSER, DBPASS);

                // prepare select statement
                String sql = "INSERT INTO mahasiswa (nim,nama,nilai) values (?,?,?)";
                st = conn.prepareStatement(sql);
                st.setString(1, this.nim);
                st.setString(2, this.nama);
                st.setInt(3, this.nilai);
                st.executeUpdate();
                conn.close();
                return true;
            } catch (Exception ex) {
                return false;
            }

        }
    }
    ```
- Buat file `DemoMahasiswa1.java`
    ```java
    package crud;

    public class DemoMahasiswa1 {
        public static void main(String[] args) {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.nim="2000001";
            mahasiswa.nama = "Budianto";
            mahasiswa.nilai = 20;                        
            mahasiswa.tambah();
            System.out.println("Data berhasil ditambahkan");
        }
    }
    ```
- Eksekusi `DemoMahasiswa1.java`, lihat hasilnya di tabel _mahasiswa_ lewat phpMyAdmin
- Latihan:
  - Tambahkan method `baca()`, `hapus()` dan `update()`.

## Pertemuan 11
- [Static Method & Property](https://github.com/ruang-belajar/java/blob/main/docs/12-static.md)
- Implementasi static method ke class Mahasiswa.\
  - Buat file `Mahasiswa2.java` seperti berikut:
    ```java
    package crud;

    import java.sql.*;

    public class Mahasiswa2 {

        public String nim;
        public String nama;
        public Integer nilai;

        //static method
        public static boolean tambah(String nim, String nama, Integer nilai)  {
            String DBDRIVER = "com.mysql.cj.jdbc.Driver";
            String DBCONNECTION = "jdbc:mysql://localhost:3306/test";
            String DBUSER = "root";
            String DBPASS = "";

            Connection conn = null;
            PreparedStatement st;

            try {
                Class.forName(DBDRIVER);
                conn = DriverManager.getConnection(DBCONNECTION, DBUSER, DBPASS);

                // prepare select statement
                String sql = "INSERT INTO mahasiswa (nim,nama,nilai) values (?,?,?)";
                st = conn.prepareStatement(sql);
                st.setString(1, nim);
                st.setString(2, nama);
                st.setInt(3, nilai);
                st.executeUpdate();
                conn.close();
                return true;
            } catch (Exception ex) {
                return false;
            }
        }
        
        // static method
        public static Mahasiswa2 baca(String nim) {
            String DBDRIVER = "com.mysql.cj.jdbc.Driver";
            String DBCONNECTION = "jdbc:mysql://localhost:3306/test";
            String DBUSER = "root";
            String DBPASS = "";

            Connection conn = null;
            PreparedStatement st;
            ResultSet rs;

            try {
                Class.forName(DBDRIVER);
                conn = DriverManager.getConnection(DBCONNECTION, DBUSER, DBPASS);

                // prepare select statement
                String sql = "SELECT * FROM mahasiswa where nim=?";
                st = conn.prepareStatement(sql);
                st.setString(1, nim);
                rs = st.executeQuery();
                
                if(rs.next()) {
                    Mahasiswa2 mahasiswa = new Mahasiswa2();
                    mahasiswa.nim = rs.getString("nim");
                    mahasiswa.nama = rs.getString("nama");
                    mahasiswa.nilai = rs.getInt("nilai");
                    conn.close();
                    return mahasiswa;
                } else {
                    System.out.println("data tidak ditemukan");
                    conn.close();
                    return null;
                }
                
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        
        public boolean update()  {
            String DBDRIVER = "com.mysql.cj.jdbc.Driver";
            String DBCONNECTION = "jdbc:mysql://localhost:3306/test";
            String DBUSER = "root";
            String DBPASS = "";

            Connection conn = null;
            PreparedStatement st;

            try {
                Class.forName(DBDRIVER);
                conn = DriverManager.getConnection(DBCONNECTION, DBUSER, DBPASS);

                // prepare select statement
                String sql = "UPDATE mahasiswa SET nama=?,nilai=? WHERE nim=?";
                st = conn.prepareStatement(sql);
                st.setString(1, this.nama);
                st.setInt(2, this.nilai);
                st.setString(3, this.nim);
                st.executeUpdate();
                conn.close();
                return true;
            } catch (Exception ex) {
                return false;
            }

        }
    }
    ```
  - File: `DemoMahasiswa2.java`
    ```java
    package crud;

    public class DemoMahasiswa2 {

        public static void main(String[] args) {
            String nim = "3000001";
            String nama = "Kris";
            Integer nilai = 65;
            Mahasiswa2.tambah(nim, nama, nilai);

            // membaca objek sekaligus membuat objek menggunakan static method
            Mahasiswa2 mahasiswa = Mahasiswa2.baca(nim);
            System.out.println(mahasiswa.nama);
            
            // merubah data
            mahasiswa.nama = "Arya";
            mahasiswa.update();
            System.out.println(mahasiswa.nama);

        }
    }
    ```

## Pertemuan 12
- [Membuat GUI dengan Java](https://github.com/ruang-belajar/java/blob/main/docs/20-gui.md)
- Latihan:
  - Buat `App1.java`
  - Buat `FormUtama.java`

## Pertemuan 13
- Buat form `MahasiswaTambah`
  - _JTextField_: `textNim`
  - _JTextField_: `textNama`
  - _JButton_: `btnTambah`
    - _ActionPerformed_: tambahkan data berdasarkan data dari `textNim` dan `textNama` menggunakan class [Mahasiswa3.java](latihan/src/Mahasiswa3.java)
- Buat _JFrame_: `FormMahassiwa`
  - Buat _JButton_: `btnMahasiswaTambah`
    - ActionPerformed: tampilkan form `MahasiswaTambah`
- Edit `FormUtama`
  - Buat _JButton_: `btnMahasiswa`
    - _ActionPerformed_: tampilkan form `Mahasiswa`
- Buat _JFrame_ : `MahasiswaList`
  - Buat JTable: `tableMahasiswa`
    - Tambahkan kolom _NIM_ dan _Nama_
  - Buat JButton: `btnReload`
    - _ActionPerformed_: hapus isi tabel dan isi ulang dengan data dari `test.mahasiswa` (database dari pertemuan sebelumnya)
      ```java
      // prep model
      DefaultTableModel model = (DefaultTableModel)(tableMahasiswa.getModel());
      // hapus semua row di table
      model.setRowCount(0);
      
      // baca data
      ArrayList<Mahasiswa3> list = Mahasiswa3.getList();
      // tambahkan data ke tabel lewat objek model
      for(Mahasiswa3 row: list) {
          model.addRow(new Object[]{row.nim,row.nama});
      }
      ```

