// sesuaikan package dengan project Anda
package latihan2;

public class DataKeluarga {

    public static void main(String[] args) {
        OrangSunda pria = new OrangSunda();
        pria.nama = "Budi";
        
        OrangJawa wanita = new OrangJawa();
        wanita.nama = "Dyah";
        
        Keluarga keluarga = new Keluarga(pria,wanita);
        keluarga.salam();

        // Beberapa contoh berikut ini akan menghasilkan error
        
        // Orang orang = new Orang(); // error karena class Orang adalah class abstrak
        
    }
    
}
