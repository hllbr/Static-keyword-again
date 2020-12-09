
public class StaticClass {
 public static int obje_sayısı = 0 ;
 private static String isim ;
 
 public StaticClass(String isim){
     this.isim =isim ;
     
     obje_sayısı++; 
 }
 public static String getIsım(){
     return isim ;
 }
}
