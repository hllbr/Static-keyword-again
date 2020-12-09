
public class Main {
    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass("hllbr");
        StaticClass staticClass1 = new StaticClass("@prince");
        StaticClass staticClass2 = new StaticClass("h2lbr");
        System.out.println("Obje sayısı :" +StaticClass.obje_sayısı);
        //obje_sayısı'na oluşturduğumuz onjeler üzerindende erişebiliriz.
        toplama(4, 5, 6);
        
    }
    public static void toplama(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
