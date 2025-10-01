public class methods {
    public static void main(String[] args) throws Exception {
        sayiBulmaca();
    }
    //fonksiyon bu
    //methodlar camel casing ile yazılır
    //classlar pascal casing ile yazılır
    public static void sayiBulmaca(){
        int [] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 1;
        boolean varMi = false;

        for (int sayi : sayilar){
            if(sayi==aranacak){
                varMi = true;
                break;
            }
        }
        String mesaj = "";
        if(varMi){
            mesaj = "Sayi mevcuttur: "+aranacak;
            mesajVer(mesaj);
        }else{
            mesaj = "Sayi mevcut değil: "+aranacak;
            mesajVer(mesaj);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
