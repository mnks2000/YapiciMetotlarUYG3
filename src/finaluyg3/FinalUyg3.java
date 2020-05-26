/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaluyg3;

/**
 *
 * @author nurik
 */
public class FinalUyg3 {

    String sehirAdi; int KurulusTarihi; String nufusu; //sehirAdi,KurulusTarihi,nufusu adında değişken tanımladım.
    FinalUyg3(){
        System.out.println("Şehir Oluşturuldu."); }
   FinalUyg3(String adi, int tarihi, String nufus){//parametrelerimi oluşturdum.
        sehirAdi=adi;//”sehirAdi” değişekenini “adi” parametresine atadım.
        KurulusTarihi=tarihi; //”KurulusTarihi” değişekenini “tarihi” parametresine atadım.
        nufusu=nufus; //”nufusu” değişekenini “nufus” parametresine atadım.
        System.out.println(sehirAdi+" Şehri Oluşturuldu");//”şehiradını” çıktı olarak yazdırdım.
        System.out.println("Kuruluş Tarihi:"+KurulusTarihi);//”Kuruluş Tarihini” çıktı oalrak yazdırdım.
        System.out.println("Nüfusu:"+nufusu);//”Nüfusu”çıktı olarak yazdırdım.
        System.out.println("");}

    public static void main(String[] args) {
        FinalUyg3 sehir1= new FinalUyg3("Konya",1074,"2,206 milyon");//FinalUyg3 adında sehir1 nesnesi oluşturdum.ve değerler atadım.
        FinalUyg3 sehir2= new FinalUyg3("Burdur",1923,"270 bin"); }}//FinalUyg3 adında sehir2 nesnesi oluşturdum.ve değerler atadım.

    
    

