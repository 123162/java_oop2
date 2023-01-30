
package pkgabstract;


abstract public  class Sekil {
    private String isim;
    public Sekil(String isim){
        this.isim=isim;
    }
    public void isminiSoyle(){
        System.out.println("bu obje "+isim+" objesidir.");
    }
    abstract void alanHesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
            
    
}
