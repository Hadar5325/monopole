import java.util.Random;

public class player {
    private int moneyInPocket;
    private int dice1;
    private int dice2;
    private int sumDices;
    private int proceedInGame;
    FlowOfGame flowOfGame;

    public player()
    {
        this.moneyInPocket = 100; // in dollars
        this.proceedInGame = 0;
    }

    public void movingforwordPlayer(){
        Random random = new Random();
        dice1 = random.nextInt(5);
        dice1 += 1;
        dice2 = random.nextInt(5);
        dice2 += 1;
        int sumDices = dice1+ dice2;
        this.sumDices = sumDices;
        this.proceedInGame = sumDices;
    }


    // getters
    public int getMoneyInPocket(){
        return this.moneyInPocket;
    }
    public int getProceedInGame(){
        return this.proceedInGame;
    }

    // setters
    public void setMoneyInPocket(int moneyInPocket){
        this.moneyInPocket = moneyInPocket;
    }
    public void setProceedInGame(int proceedInGame){
        this.proceedInGame = proceedInGame;
    }
    public int getDice1(){
        return this.dice1;
    }
    public int getDice2(){
        return this.dice2;
    }

    public int getTotalDices(){
        return this.sumDices;
    }
}

