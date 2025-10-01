public class App {
    public static void main(String[] args) throws Exception {
        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("belirtilen değer listeden büyük --> "+ex);
        }
        catch (Exception e) {
            System.out.println("Hata"+e);
        }
        finally{
            //try ya da catch çalışsın fark etmez her türlü çalışır
            System.out.println("Cumanız mübarek olsun");
        }
    }
}
