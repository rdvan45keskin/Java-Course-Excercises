public class App {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        float result = calculator.Topla(60,2);
        float result2 = calculator.Cikar(60,2);
        float result3 = calculator.Carp(60,2);
        float result4 = calculator.Bol(60,2);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
