/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelangbarang2;

import java.util.ArrayList;

/**
 *
 * @author rafig
 */
public interface user {
    public void setNama (ArrayList <String> nama);
    public void setAlamat (ArrayList <String> alamat);
    public void setTelepon (ArrayList <String> telepon);
    
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);


}
