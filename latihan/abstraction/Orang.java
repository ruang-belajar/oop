package latihan2;

// contoh class abstrak
// lihat class OrangSunda dan OrangJawa untuk contoh implementasi
abstract class Orang {
    public String nama;
    
    // contoh method abstrak
    // method ini harus di-override pada class yang meng-extend class ini
    // override = mendefinisikan ulang
    // jika class turunan tidak meng-override method ini, 
    // maka akan terjadi error
    public abstract String panggilan();
}
