import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {

    private Player player;
    private Random rand = new Random();

    public void addPlayer(Player player){
        this.player=player;
    }

    public void play(){
        int number;                     //wylosowana liczba
        int guess;                      //propozycja (strzał) gracza

        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = player.guess();
            System.out.println("Gracz " + player.getName() + ": " + guess);

            if (number != guess) {
                System.out.println("PUDŁO!");
            }
            else {
                System.out.println("BRAWO!");
            }

        } while (number != guess);

    }

}
