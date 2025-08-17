//------------------------------------------------------------------------------
//CharAt(sayıCharAt(sayı) o metindeki o diziyi buluyor örnek yaşaşın kelimesinde 
//charAt(3) yazarsak a harfini ekrana getirir.
//örnek.concat(" metin") komutu örnek adı altında yazılmış metine 
//"metin" kelimesini ekler.mesajı bir bütün olarak yazdırmak için yeni bir
//değişkene tanımlanması gerekir. 
//String yenimesaj =(mesaj.concat(" Seni seviyorum")); gibi
//startsWith komutu o cümlenin girilen değerle başlayıp başlamadığına bakar
//endsWith komutu o cümlenin girilen değerle bitip bitmediğine bakar
//getChars komuutu ise begin soldan kaçıncı boşlukla başlayacağı end soldan
//kaçıncı boşlukla biteceği demektir
//char[] karakterler = new char[8];
//mesaj.getChars(6,9,karakterler,0);
//indexOf(' ') komutu içine girilen değerin atanan değerde yazan şeyin içinde 
//hangi boşlukta olduğunu söyler. saymaya 0 dan başlar

public class StringsDemo {

    public static void main(String[] args) {

        String mesaj = "Bugün çok güzelsin";
        System.out.println(mesaj);

        String yenimesaj = (mesaj.concat(" Seni seviyorum."));
        System.out.println(yenimesaj);
        System.out.println("-------------------------------------------------------------");

        System.out.println("Elemean sayısı : " + mesaj.length());
        System.out.println("5.eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        System.out.println(yenimesaj);
        char[] karakterler = new char[8];
        mesaj.getChars(6, 9, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("ü"));
        System.out.println(mesaj.lastIndexOf("ü"));

        String newMessage = mesaj.replace("güzelsin", "tatlısın");
        System.out.println(newMessage);
        System.out.println(mesaj.substring(10, 18));
        //10.yerden başla den başla 18.yere kadar. 18'i dahil etme !!!

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);

        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

    }
}
