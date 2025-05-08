
package latihan2;

public class DataKeluarga {

    public static void main(String[] args) {
        OrangSunda pria = new OrangSunda();
        pria.nama = "Budi";
        
        OrangJawa wanita = new OrangJawa();
        wanita.nama = "Dyah";
        
        Keluarga keluarga = new Keluarga(pria,wanita);
        keluarga.salam();
        
        
    }
    
}
