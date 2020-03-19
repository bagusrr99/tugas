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
import java.io.Serializable;
public class Karyawan implements Serializable{
    public int nip;
public String nama, alamat, email, kota;
public Karyawan(int nip,String nama,String alamat, String email,String 
kota){
this.nip = nip;
this.nama = nama;
this.alamat = alamat;
this.email = email;
this.kota = kota;
}
@Override
public String toString() {
return "NIP=" + nip + "\r\nNAMA=" + nama + "\r\nALAMAT="
+ alamat + "\r\nEMAIL=" + email + "\r\nKOTA=" + kota;
} 
}
    

