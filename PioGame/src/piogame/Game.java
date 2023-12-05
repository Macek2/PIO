import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {

    private List<Player> players = new ArrayList<>();
    private Random rand = new Random();
    private int cnt = -1;

    public void addPlayer(Player player) {
        players.forEach( p ->{
            if (player.getName().equals(p.getName())){
                player.setName(player.getName() + cnt);
                cnt-=1;
            }
        });
    }

    private boolean nameExists(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void play(){
        int number;                     //wylosowana liczba
        int guess;                      //propozycja (strzał) gracza

        boolean repeat;

        do {
            System.out.println("---------------------");

            repeat = true;

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            for (Player player : players) {
                guess = player.guess(); // odgadywanie zlecamy obiektowi klasy Player
                System.out.println("Gracz " + player.getName() + ": " + guess);

                if (number != guess) {
                    System.out.println("PUDŁO!");
                } else {
                    System.out.println("BRAWO!");
                    repeat = false;
                }
            }
        } while (repeat);
    }

    public void printPlayers(){
        System.out.println("###Gracze:###");
        for (Player player : players) {
            System.out.println(player.getName());
        }

       // players.forEach(player -> {
       //     System.out.println(player.getName());
       // });

       // players.forEach(System.out::println);
    }

    public void removePlayer(String name){
//        for (Iterator<Player> it = players.iterator(); it.hasNext();) {
//            if (it.next().getName().equals(name)) {
//                it.remove();
//            }
//            }

        //for(int i=0; i<players.size(); i++){
        //     if(players.get(i).getName().equals(name)){
        //        players.remove(i);
        //    }
        //}

        // nie stosujemy pętli foreach do usuwania danych z listy

        players.removeIf((Player player) -> player.getName().equals(name));
    }

}

//do {
//    System.out.println("---------------------");

//        number = rand.nextInt(6) + 1;
//        System.out.println("Kostka: " + number);

//        guess = player.guess();
//        System.out.println("Gracz " + player.getName() + ": " + guess);

//        if (number != guess) {
//        System.out.println("PUDŁO!");
//        }
//        else {
//        System.out.println("BRAWO!");
//        }

//        } while (number != guess);