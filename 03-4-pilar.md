# 4 Prinsip OOP
Ada 4 Prinsip Utama dalam Pemrograman Berorientasi Objek (OOP): _Inheritance, Polymorphism, Encapsulation,_ dan _Abstraction_ .

## Inheritance (Pewarisan)
Pewarisan merupakan salah satu cara meminimalisir penulisan kode yang berulang. Bagaimana bisa? baik contoh analoginya seperti ini. Anak umumnya mewarisi karakteristik dan perilaku yang dimiliki orang tuanya. Dalam kode kasus tersebut tidak memerlukan penulisan ulang kode pada objek `Anak` yang memiliki attribute (karakteristik) dan behaviour (perilaku) yang sama dengan orang tuanya. Kalian hanya perlu mewarisi attribute dan behaviour yang ada di objek Orang Tua ke objek Anaknya.

Kemudian seperti apa contoh implementasinya dalam kode? simak contoh kode berikut

```java
class Orang {
    public String namaDepan;
    public String namaBelakang;
    public String jenisKelamin;

    public String namaLengkap() {
        return this.namaDepan+" "+this.namaBelakang;
    }
}

class OrangJawa extends Orang {
    public String panggilan() {
        if(jenisKelamin.equals("L")) {
            return "Mas "+this.namaDepan;
        }
        if(jenisKelamin.equals("P")) {
            return "Mba "+this.namaDepan;
        }
        return "";
    }
}

public class Main {
    public static void main(String[] args) {
        OrangJawa orang1 = new OrangJawa();
        orang1.namaDepan = "Budi";
        orang1.namaBelakang = "Arman";
        orang1.jenisKelamin = "L";
        System.out.println(orang1.namaLengkap());
        System.out.println(orang1.panggilan());

        OrangJawa orang2 = new OrangJawa();
        orang2.namaDepan = "Dyah";
        orang2.namaBelakang = "Ayu";
        orang2.jenisKelamin = "P";
        System.out.println(orang2.namaLengkap());
        System.out.println(orang2.panggilan());
    }
}
```
[try @ leetcode](https://leetcode.com/playground/kex3eLdR)

Kemudian seperti apa outputnya ketika membuat instance dari class Anak?
```
Budi Arman
Mas Budi
Dyah Ayu
Mba Dyah
```

Kata kunci `extends` menandakan bahwa class turunan `OrangJawa` adalah turunan dari class `Orang`. Dengan Demikian, atribute dan method class `OrangJawa` yang diwariskan dari _parent_ classnya (class `Orang`) sehingga kita tidak perlu lagi mendeklarasikan kembali.

### Inheritance Class dengan Constructor

Jika suatu class memiliki contructor, maka class turunannya perlu tetap mendefinisikan constructor.
```java
class Orang {
    public String namaDepan;
    public String namaBelakang;
    public String jenisKelamin;

    public Orang(String namaDepan, String namaBelakang, String jenisKelamin) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.jenisKelamin = jenisKelamin;
    }
    
    public String namaLengkap() {
        return this.namaDepan+" "+this.namaBelakang;
    }

}

class OrangJawa extends Orang {
    public OrangJawa(String namaDepan, String namaBelakang, String jenisKelamin) {
        super(namaDepan, namaBelakang, jenisKelamin);
    }

    public String panggilan() {
        if(jenisKelamin.equals("L")) {
            return "Mas "+this.namaDepan;
        }
        if(jenisKelamin.equals("P")) {
            return "Mba "+this.namaDepan;
        }
        return "";
    }
}

public class Main {
    public static void main(String[] args) {
        OrangJawa orang1 = new OrangJawa("Budi", "Rahman", "L");
        System.out.println(orang1.namaLengkap());
        System.out.println(orang1.panggilan());

        OrangJawa orang2 = new OrangJawa("Dyah", "Ayu", "P");
        System.out.println(orang2.namaLengkap());
        System.out.println(orang2.panggilan());

  }
}
```
[source code @ leetcode](https://leetcode.com/playground/DF63wuGb) untuk melihat bagaimana mengimplementasikan _inheritace_ pada class yang memiliki _constructor_

## Encapsulation
Encapsulation didasari oleh kata _capsul_ atau pembungkus. Encapsulation merupakan proses pembungkusan suatu data pada kelas dengan cara mengisolasinya agar tidak dapat diakses diluar kelasnya. Dengan begini kita cukup menggunakan datanya saja tanpa perlu mengetahui proses detail terciptanya data tersebut. Berikut contohnya.

```java
class Orang {
    public String namaDepan;
    public String namaBelakang;
    private String jenisKelamin; 
    private String titel; 

    public Orang(String namaDepan, String namaBelakang, String jenisKelamin) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.setJenisKelamin(jenisKelamin);
    }
    
    public String namaLengkap() {
        return this.namaDepan+" "+this.namaBelakang;
    }
    
    // perubahan jenis kelamin tidak bisa langsung, harus lewat fungsi ini
    // karena perubahan jenis kelamin harus merubah juga titel
    public void setJenisKelamin(String jenisKelamin) {
        if(jenisKelamin.equals("L")) {
            this.titel = "Bapak";
        } 
        if(jenisKelamin.equals("P")) {
            this.titel = "Ibu";
        }
    }
    
    // fungsi untuk membaca jenis kelamin
    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    
    // fungsi untuk membaca titel
    public String getTitel() {
        return this.titel;
    }

}

public class Main {
    public static void main(String[] args) {
        Orang orang1 = new Orang("Budi", "Rahman", "L");
        System.out.println(orang1.getTitel()+" "+orang1.namaLengkap());

        Orang orang2 = new Orang("Dyah", "Ayu", "P");
        System.out.println(orang2.getTitel()+" "+orang2.namaLengkap());
        orang2.namaDepan = "Nurani"; // contoh merubah nama secara langsung
        System.out.println(orang2.getTitel()+" "+orang2.namaLengkap());
        
        // contoh salah:
        // baris program dibawah ini akan error jika dieksekusi
        //orang2.jenisKelamin = "P";
        //System.out.println(orang2.jenisKelamin);
        
  }
}
```
[source code @ leetcode](https://leetcode.com/playground/o4fyisto) 

Perhatikan kelas di atas, telah mengisolasi data yang ada di property `jenisKelamin` dan `titel` dengan memberikannya modifier `private`. Dengan demikian, mengubah properti ini di luar class akan menyebabkan error. Sebagai contoh, Anda bisa _uncomment_ perintah `orang2.jenisKelamin = "P"` atau perintah `System.out.println(orang2.jenisKelamin)`, kemudian eksekusi programnya. Java akan mengeluarkan _runtime error_.

Untuk mengubah atau membaca properti dengan modifier `private` maka kita menggunakan fungsi _getter_ (`getJenisKelamin()`) dan _setter_ (`setJenisKelamin()`).

## Polymorphism
Polymorphism merupakan kemampuan sebuah objek untuk memiliki banyak bentuk. Contohnya ketika seorang ayah memiliki kemampuan menghafal 5 bahasa, belum tentu anaknya mewarisi hal tersebut. Bisa saja sang anak memiliki kemampuan melebihi atau bahkan kurang dari ayahnya.

Contoh penerapan kode

```java
public class OrangTua {
  protected String warnaMata = "coklat";
  protected String warnaRambut = "hitam";
  protected void mainSepakbola(){
    System.out.println("Jago bermain sepak bola");
  }
}

public class Anak extends OrangTua {
  @override
  public void mainSepakbola() {
    System.out.println("Tidak bisa main sepak bola");
  }

  public Anak() {
    System.out.println("Anak memiliki warna mata " + warnaMata);
    System.out.println("Anak memiliki warna rambut " + warnaRambut);
    mainSepakbola();
  }  
}

```


## Abstraction
Abstrak bisa diartikan sebagai gambaran umum dari suatu yang mendetail. Abstraksi pada OOP dapat diartikan penyembunyian suatu proses yang dilakukan sebuah objek. Wah hampir sama dong dengan encapsulation? ya benar! namun abstraksi memiliki level yang lebih tinggi dari encapsulation. Apabila pada encapsulation dijelaskan bahwa data harus diisolasi maka pada abstraksi aksi dari objek tersebut yang harus disembunyikan. Jadi kita perlu tau objek mana yang beraksi, yang perlu diketahui hanyalah aksi apa yang akan dilakukan objek tersebut.

Abstraksi dalam pemrograman sendiri bisa memanfaatkan abstract class, interface class, dan sebagainya.

Berikut contoh kodenya

```java
public abstract class Databases {
  abstract public void connect();
}
public class Sql extends Databases {
  @override
  public void connect() {
   // Implementasi kode 
 }
}
public class Postgre extends Databases {
  @override
  public void connect() {
   // Implementasi kode 
 }
}
```

Pada kasus ini kita ingin mengkoneksikan projek kita ke database. Awalnya kita menggunakan database Sql namun karena suatu kendala kita harus mengubahnya menjadi database postgre. Jika kalian tidak menerapkan abstraksi atau langsung mengimplementasikan kelas Sqlnya. Maka ketika hendak melakukan migrasi database, akan ada banyak kode yang perlu diubah. Berbeda dengan kasus ini. Simak penjelasan berikut.

```java
// Tanpa abstraksi
Sql db = new Sql();
db.connect();
// ketika hendak migrasi database ke postgre maka kode berikut harus diubah
Postgre db = new Postgre();
db.connect();
```

Bisa dilihat kode berikut mungkin masih terlihat hanya memerlukan sedikit perubahan, namun beda lagi ceritanya ketika implementasi dari variabel db semakin kompleks seperti adanya fitur disconnect, dll.

```java
// Menggunakan Abstraksi
Databases db = new Sql();
db.connect();
// ketika hendak migrasi database ke postgre maka kode berikut harus berubah
Databases db = new Postgre();
db.connect();
```

Sudah terlihat bukan perbedaannya? dengan menggunakan abstraksi kita tak perlu khawatir objek mana yang mengerjakan tugas tersebut, yang perlu kita ketahui adalah tugas tersebut dijalankan dengan baik dan tanpa ada masalah.

NB : Berbeda dengan abstraksi yang menggunakan keyword extends, kelas interface menggunakan keyword implements dalam penggunaannya.

