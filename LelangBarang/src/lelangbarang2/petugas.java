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
public class petugas implements user{
    private ArrayList<String> namapetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public void Petugas (){
        this.namapetugas.add("rudal");
        this.alamat.add("pacitan");
        this.telepon.add("0811222222222");
        
        this.namapetugas.add("udil");
        this.alamat.add("ngunut");
        this.telepon.add("2221200000222");
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
        return this.namapetugas.get(id);
    }
    
    @Override
    public String getAlamat (int id){
        return this.alamat.get(id);
    }
    
    @Override
    public String getTelepon (int id){
        return this.telepon.get(id);
    }
    
    public void tampilkanpetugas(){
        System.out.println(" Nama : " + this.namapetugas);
        System.out.println(" alamat : " + this.alamat);
        System.out.println(" telepon : " + this.telepon);
    }
}
