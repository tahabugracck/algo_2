public class Main {
    public static void main(String[] args) {
        //bir fabrikada 20 işçi haftanın 5 günü çalışmaktadır
        //saat ücreti 20 tl olup işçiler her gün farklı saat miktarlarında çalışmaktadır
        //buna göre kendisine parametre olarak 20 işçinin haftalık çalışma saatini alıp hee bir işçinin ücretini hesaplayınız

        int[] haftalikCalismaSaatleri = {40, 35, 42, 38, 37,
                                         41, 36, 39, 40, 37,
                                         38, 40, 35, 42, 36,
                                         38, 41, 37, 39, 40};
        for (int i = 0; i < haftalikCalismaSaatleri.length; i++) {
            int haftalikUcret = haftalikUcretHesapla(haftalikCalismaSaatleri[i], saatUcreti);
            System.out.println("İşçi " + (i + 1) + " için haftalık ücret: " + haftalikUcret + " TL");
        }
    }

    public static int haftalikUcretHesapla(int haftalikCalismaSaati, int saatUcreti) {
        return haftalikCalismaSaati * saatUcreti;


    }
}