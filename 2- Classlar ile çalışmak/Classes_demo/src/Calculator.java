public class Calculator {
    public float Topla(float... sayilar){
        float toplam = 0;
        for (float sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public float Cikar(float... sayilar){
        if (sayilar.length == 0){
            return 0;
        }
        float result = sayilar[0];
        for (int sayi = 1; sayi < sayilar.length; sayi++){
            result-=sayilar[sayi];
        }
        return result;
    }
    public float Carp(float... sayilar){
        if (sayilar.length == 0){
            return 0;
        }
        float result = sayilar[0];
        for (int sayi = 1; sayi < sayilar.length; sayi++){
            result*=sayilar[sayi];
        }
        return result;
    }
    public float Bol(float... sayilar){
        try {
            // Eğer hiç sayı verilmezse veya sadece 0 ile bölmeye çalışılırsa
            if (sayilar.length == 0 || sayilar[0] == 0){
                return Float.NaN; // Geçersiz sonuç döndürüyoruz.
            }
            float result = sayilar[0];

            // İlk elemanı atlamak için i = 1'den başlatıyoruz
            for (int i = 1; i < sayilar.length; i++) {
                // Sıfıra bölmeyi kontrol ediyoruz
                if (sayilar[i] == 0) {
                    return Float.NaN; // Bölme hatası için geçersiz sonuç döndür.
                }
                result /= sayilar[i];
            }
            return result;
        } catch (Exception e) {
            // Hata durumunda belirli bir float değeri döndürüyoruz
            return Float.NaN;
        }
    }


}
