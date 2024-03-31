/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

/**
 *
 * @author User
 */
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author nishom
 */
public class Product implements Serializable {
    private transient String id;
    private static String nama;
    private List<ProductItem> items;
    
    public void setId(String id) {
        this.id = id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setItems(List<ProductItem> items) {
        this.items = items;
    }
    @Override
    public String toString() {
    String produk = "Produk: \r\n"
                  + "Id=" + id + "\r\n"
                  + "Nama=" + nama + "\r\n"
                  + "=======================\r\n"
                  + "Product Item:\r\n";
    if (items != null) {
        String item = items.stream()
                          .map(Object::toString)
                          .reduce("", (acc, obj) -> acc + obj);
        return produk + item;
    } else {
        return produk + "[No items]";
    }
    }


}
