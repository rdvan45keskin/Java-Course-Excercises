public class App {
    public static void main(String[] args) throws Exception {
        BaseGameCalculator gameCalculators = new OlderGameCalculator();
        gameCalculators.hesapla();
        gameCalculators.gameOver();
    }   
}
