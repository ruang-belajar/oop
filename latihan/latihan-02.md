# Soal Konversi Program

Contoh program dalam Java

**Kendaraan.java**
```java
package latihan;

abstract class Kendaraan {
    // posisi
    public int x;
    public int y;
    
    private int panjang;
    private int lebar;
    private String nama;
    
    public Kendaraan(String nama) {
        this.x = 0;
        this.y = 0;
        this.panjang = panjang;
        this.lebar = lebar;
        this.nama = nama;
        
    }
    
    public int getLebar() {
        return this.lebar;
    }
    
    public int getPanjang() {
        return this.panjang;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    abstract public void bergerak(int moveX, int moveY);
    
    abstract public void tampilkanInfo();
    
}

```

**Motor.java**
```java
package latihan;

public class Motor extends Kendaraan{
    
    private int roda;
    
    public Motor(String nama, int x, int y) {
        super(nama);
        this.x = x;
        this.y = y;
        
        this.roda = 2;
        
        System.out.println("Motor "+nama+" dibuat");
    }

    @Override
    public void bergerak(int moveX, int moveY) {
        this.x = moveX;
        this.y = moveY;
        System.out.println("Bergerak");
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.print("Motor:");
        System.out.println(this.getNama());
        System.out.print("Lebar: ");
        System.out.println(this.getLebar());
        System.out.print("Panjang: ");
        System.out.println(this.getPanjang());
        System.out.print("Roda: ");
        System.out.println(this.roda);
    }
    
}

```

**MotorTest1.java (program utama)**
```java
package latihan;

public class MotorTest1 {
    public static void main(String[] args) {
        Motor m = new Motor("Yamaha", 1, 3);
        m.bergerak(3, 10);
        m.tampilkanInfo();
    }
}

```

---

## Soal:
Berdasarkan contoh program di atas, buat program serupa menggunakan bahasa pemrograman: _Python, Go, Javascript, VBA, C#, Paskal, PHP, Typescript, Swift, C++, VB.Net_

## Pembagian Tugas
| Nama	| Tugas |
| --- | --- |
| Ansya Mutiara	| Python |
| Rowan Willy San Remo | Typescript |
| Agus | JavaScript |
| Didin Muslihudin | VBA |
| Rhisna Setiani | C# |
| Nurico Aditya Nugroho	| Paskal |
| Zenittha shifa shabilla	| PHP |
| RIFKI MAULANA	| Python |
| SITI JUBAEDAH	| Swift |
| Devi Yulianti	| C++ |
| Naja Zakiyatul Qisthi | VB.Net |
| Andri Gunawan	| Python |
| Firman Hadiana | Typescript |
| Shofia Z Rachmalina	| JavaScript |
| ERLANGGA JULIARDI	| VBA |
| Ajeng Ayu Anggraeni	| C# |
| Gustamil Arifin | Paskal |
| Cipto Nuryauman | PHP |
| INDRAWAN TAUPIKURROHMAN	| C# |
| Rinka Laura Fadila	| Swift |
| Adit Permana	| C++ |
| Rani Suryani | VB.Net |
| Robby Hidayat Tulloh	| Python |
| Fera Herawati	| Typescript |
| Wafa Nurrofiqoh	| JavaScript |
| Ade Tia Nursobah	| VBA |
| Rani Tevalina	| C# |
| Ali Fauzi Ali	| Paskal |
| kamaludin	| PHP |
| Reynaldi Setia Parhan	| VB.Net |
| Andri Al Hudani	| Swift |
| Ghefira Raudhatul Jannah	| C++ |
| Hilda setiawati | VB.Net |
| ALVINA DWI NOVALIA	| Python |
| Fina Selviyani	| Typescript |
| Celsi nur rahmawati	| JavaScript |
| MAURA IRMA NURLITA	| VBA |
