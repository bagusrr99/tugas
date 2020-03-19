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
import java.util.List;

public class Product implements Serializable{
    private String id;
private String nama;
private List<productItem> items;
public void setId(String id) {
this.id = id;
}
public void setNama(String nama) {
this.nama = nama;
}
public void setItems(List<productItem> items) {
this.items = items;
}
@Override
public String toString() {
String produk, item = "";
produk = "Produk: \r\n"
+ "Id=" + id + "\r\n"
+ "Nama=" + nama + "\r\n"
+ "=======================\r\n"
+ "Product Item:\r\n";
item = items.stream().map((obj) -> 
obj.toString()).reduce(item, String::concat);
return produk + item;
} 
}
