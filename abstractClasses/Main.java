package abstractClasses;

public class Main {
    public static void main(String[] args){
        
        GameCalculator[] gameC = new GameCalculator[]{
            new KidsCalc(),
            new ManCalc(),
            new WomanCalc()
        };
        for(GameCalculator game:gameC){
            game.calculate();
            game.gameOver();
        }
    }
}
