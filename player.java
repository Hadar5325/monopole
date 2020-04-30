import java.util.Random;

public class player {
    private int moneyInPocket;
    private int stateInGame;
    public player()
    {
        this.moneyInPocket = 100;
        this.stateInGame = 0;
    }

    public void movingforwordPlayer(){
        Random random = new Random();
        int dice1 = random.nextInt(5);
        dice1 += 1;
        int dice2 = random.nextInt(5);
        dice2 += 1;
        int sumDices = dice1+ dice2;
        this.stateInGame = sumDices;
    }




    // getters
    public int getMoneyInPocket(){
        return this.moneyInPocket;
    }
    public int getStateInGame(){
        return this.stateInGame;
    }

    // setters
    public void setMoneyInPocket(int moneyInPocket){
        this.moneyInPocket = moneyInPocket;
    }
    public void setStateInGame(int stateInGame){
        this.stateInGame= stateInGame;
    }

}

