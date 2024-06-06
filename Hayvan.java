
/*

Hayvan -> SuperClass
ÖZellikleri yaz
Constructor Olustur
2 tane metod yaz ( yemekYe ve HareketeGec )
Getter-setter metodlarını cagır


 */
public class Hayvan {  //SuperClass

    private String isim;
    private int kilo;
    private int boy;
    private int bacakSayisi;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getBacakSayisi() {
        return bacakSayisi;
    }

    public void setBacakSayisi(int bacakSayisi) {
        this.bacakSayisi = bacakSayisi;
    }

    public Hayvan(String isim, int kilo, int boy, int bacakSayisi) {
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacakSayisi = bacakSayisi;
    }

    public void yemekYe() {

        System.out.println("Hayvan Şuanda Yemek Yiyor..");
    }

    public void hareketeGec (int hiz) {

        System.out.print("Hayvanın Hızı:" + hiz + "km dir..");
    }
}
