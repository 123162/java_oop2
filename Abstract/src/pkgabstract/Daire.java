
package pkgabstract;

public class Daire extends Sekil{
    private int yaricap;
    
    public Daire(String isim,int yaricap){
        super(isim);
        this.yaricap=yaricap;
    }
    void alanHesapla(){
        System.out.println(getIsim()+"alani:"+(Math.PI*yaricap*yaricap));
       
    }
            
    
}
