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
Berdasarkan contoh program di atas, buat program serupa menggunakan bahasa pemrograman: _Python, Javascript, VBA, C#, Paskal, PHP, Typescript, C++, VB.Net_
