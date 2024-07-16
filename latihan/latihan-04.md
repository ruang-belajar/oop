# Soal 4

Perhatikan program berikut:
```java
public class Burung {
    private int ketinggian;
    private Double berat;
    
    public Burung() {
        this.ketinggian = 4;
        this.berat = 2.0;
    }
    
    public void terbang() {
        this.ketinggian += 1;
        this.berat -= 0.1;
    }
    
    public void menukik() {
        this.ketinggian -= 1;
        this.berat -= 0.1;
    }

    public void makan(Double banyak) {
        this.berat += banyak;
    }
    
    public void tampilkanData() {
        System.out.println("Posisi: "+this.ketinggian);
    }

    public void tampilkanBerat() {
        System.out.println("Berat: "+this.berat);
    }
}
```

## Pertanyaan A
Apa output dari program berikut:
```java
Burung b = new Burung();
b.terbang();
b.terbang();
b.tampilkanData();
```

## Pertanyaan B
Apa output dari program berikut:
```java
Burung b = new Burung();
b.terbang();
b.menukik();
b.menukik();
b.tampilkanData();
```

## Pertanyaan C
Apa output dari program berikut:
```java
Burung b = new Burung();
b.makan(2);
b.terbang();
b.tampilkanBerat();
```