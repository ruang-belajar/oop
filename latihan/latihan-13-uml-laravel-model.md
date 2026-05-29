# Latihan UML Model Laravel

Berikut adalah contoh model Laravel:

```php
<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Mahasiswa extends Model
{
    use HasFactory;

    protected $table = 'mahasiswa';
    protected $primaryKey = 'nim';
    protected $keyType = 'string';
    
    public static function insertBaru(array $data)
    {
        return self::create($data);
    }

    public function updateData(array $data)
    {
        // $this merujuk pada instance mahasiswa yang sedang dipilih
        return $this->update($data);
    }

    public function hapusData()
    {
        // Menghapus data dari database
        return $this->delete();
    }
    
    public function cuti()
    {
        // Proses mahasiswa cuti
        // DUMMY CODE
        return true;
    }
}
```

**🙋‍♂️ Soal:**

Berdasarkan model di atas, buat Class Diagram-nya