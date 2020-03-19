/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author User
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializationTest {
    public static void main(String[] args) {
        System.out.println("MULAI SERIALISASI...");
Karyawan k = new Karyawan(123456, "M. Nishom, M.Kom", "Rembang, "
+ "Jawa Tengah 59274", "m.nishom.dosen@gmail.com", "Rembang");
System.out.println("PROSES SERIALISASI...");
String path = System.getProperty("user.dir")+ 
File.separator+"kar.ser";
FileOutputStream fos;
ObjectOutputStream oos;
try { 
fos = new FileOutputStream(new File(path)); 
oos = new ObjectOutputStream(fos);
oos.writeObject(k); 
oos.close();
fos.close();
} catch (FileNotFoundException e) {
} catch (IOException ex) {
System.out.println(ex.getMessage());
}
System.out.println("SERIALISASI SELESAI");
System.out.println("Hasil serialisasi tersimpan di: "+path);
} 

    }

