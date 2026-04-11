
Buat file **GameTebakAngka.java**.
```java
import java.util.Random;
import java.util.Scanner;

public class GameTebakAngka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean sudahTerjawab = false;
        Integer tryCount = 0;

        Random random = new Random();
        int jawaban = random.nextInt(1,100);

        while(!sudahTerjawab) {

            System.out.print("Masukkan tebakan Anda: ");
            int tebakanUser = scanner.nextInt();

            if(jawaban>tebakanUser) {
                System.out.println("terlalu kecil");
            }
            if(jawaban<tebakanUser) {
                System.out.println("terlalu besar");
            }

            if(jawaban==tebakanUser) {
                System.out.println("TEBAKAN ANDA BENAR");
                sudahTerjawab = true;
            }

            System.out.println();
        }
        System.out.println("Anda berhasil menjawab: ");
        System.out.println(tryCount.toString()+"x tebakan");

        scanner.close();
    }
}

```


File: **AdminTebakAngka1.java**

```java
import java.util.Random;

public class AdminTebakAngka1 {
    public int jawaban;
    public Integer tryCount;
    public boolean sudahTerjawab;

    public AdminTebakAngka1() {
        Random random = new Random();
        this.jawaban = random.nextInt(1, 100);
        this.tryCount = 0;
        this.sudahTerjawab = false;
    }

    public void tebak(int angka) {
        if(this.sudahTerjawab) {
            return;
        }

        if(this.jawaban>angka) {
            System.out.println("terlalu kecil");
        }
        if(this.jawaban<angka) {
            System.out.println("terlalu besar");
        }

        if(this.jawaban==angka) {
            System.out.println("TEBAKAN ANDA BENAR");
            this.sudahTerjawab = true;
        }

        this.tryCount++;
    }

}

```


File: **GameTebakAngka1.java**

```java
import java.util.Scanner;

public class GameTebakAngka1 {
    public static void main(String[] args) {
        AdminTebakAngka1 game = new AdminTebakAngka1();

        Scanner scanner = new Scanner(System.in);

        while(!game.sudahTerjawab) {
            System.out.print("Masukkan tebakan Anda: ");
            int tebakanUser = scanner.nextInt();

            game.tebak(tebakanUser);
            System.out.println();
        }
        System.out.println("Anda berhasil menjawab: ");
        System.out.println(game.tryCount.toString()+"x tebakan");

        scanner.close();
    }
}

```