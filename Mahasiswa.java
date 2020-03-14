package tugas;

public class Mahasiswa {
    
     String nim, nama, kelas;
    public static void main(String[] args) {
        
       
        
        Mahasiswa x = new Mahasiswa();
        
        x.nim = "18090078";
        x.nama = "Bagus Rifqi Ridho";
        x.kelas = "3 D";
        
        System.out.println("NIM : " + x.nim);
        System.out.println("Nama : " + x.nama);
        System.out.println("Kelas : " + x.kelas);
    }
    
}
