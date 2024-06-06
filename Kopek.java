/*

Kopek -> SubClass
Hayvan SuperClass ından Inheritance al
ek özellik tanımla disSayisi
Constructor olustur ( cagır)
disSayisi icin getter-setter metodu yok ( cünkü yeni eklendi) olustur.
kos metodu olustur.
 */

public class Kopek extends Hayvan {

    private int disSayisi;

    public int getDisSayisi() {
        return disSayisi;
    }

    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }

    public Kopek(String isim, int kilo, int boy, int bacakSayisi, int disSayisi) {
        super(isim, kilo, boy, bacakSayisi);
        this.disSayisi = disSayisi; // Ek özellik oldugu icin ayrı yazıyoruz this ile.
    }

    public void hareketeGec(int hiz) {  //Override edildi

        System.out.print("Hayvanın Hızı:" + hiz + "km dir..");
    }

    public void kos ( int hiz ) {

        System.out.println("Köpek Koşuyor..");
        hareketeGec(hiz);         // super.hareketeGec(hiz) deseydik override edilse bile SuperClass taki metodu kullanacaktı.
    }
}
