package Latihan55.handphone;
public class Nokia extends Handphone{
    
    private String wpKeyStore;

    public Nokia(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
    
    
    
    
}
