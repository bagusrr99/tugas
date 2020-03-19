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
public class productItem implements Serializable{
    String nama;
double harga;

public productItem(String name, double price) {
this.nama = name;
this.harga = price;
}
@Override
public String toString() {
return "\r\nNama=" + nama + "\r\nHarga=" + harga + "\r\n";
} 

}
