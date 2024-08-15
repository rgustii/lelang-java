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
public class masyarakat implements user{
    private ArrayList<String> namamasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public masyarakat(){
        this.namamasyarakat.add(" udin ");
        this.alamat.add(" malang ");
        this.telepon.add(" 0009990099900 ");
        
        this.namamasyarakat.add(" eko ");
        this.alamat.add(" pare ");
        this.telepon.add(" 1111000011110 ");
        
        this.namamasyarakat.add(" suep ");
        this.alamat.add(" malang ");
        this.telepon.add(" 1119999000999 ");
        
        this.namamasyarakat.add(" gatot ");
        this.alamat.add(" batu ");
        this.telepon.add(" 0101010101010 ");
    }
    
    @Override
    public void setNama(ArrayList<String> nama){
        
    }    
    
    @Override
    public void setAlamat(ArrayList<String> alamat){
        
    }
    
    @Override
    public void setTelepon(ArrayList<String> telepon){
        
    }
    
    @Override
    public String getNama (int id){
        return this.namamasyarakat.get(id);
    }
    
    @Override
    public String getAlamat (int id){
        return this.alamat.get(id);
    }
    
    @Override
    public String getTelepon (int id){
        return this.telepon.get(id);
    }
    
    public int getNamasize() {
        return this.namamasyarakat.size();
    }
}
