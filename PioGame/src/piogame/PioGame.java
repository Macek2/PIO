import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Gra w odgadywanie wylosowanej liczby.
 *
 * Zasady:
 * - mistrz gry (komputer) rzuca kostką (losuje liczby z zakresu 1..6)
 * - gracz (też komputer) stara się odgadnąć liczbę (też losuje)
 * - jeżeli odgadnie, gra się kończy
 * - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje kolejną liczbę i gracz stara się ją odgadnąć)
 */
public class PioGame {
    public static void main(String[] args) {

        //JAK UZYWAC LISTY:
        //ArrayList <String> list = new ArrayList();
        //list.add(1); zamiana na list.add(new Integer(1))
        //list.add("jeden");
        //list.add("dwa");
        //list.add("trzy");
        //System.out.println(list);

        //for (int i =0; i < list.size(); i++){
           // System.out.println(list.get(i));
        //}

        //INNE METODY WYWOŁANIA GRACZA:
        //Player player = new Player("Piotr");
        // player.setName("Piotr");
        //PlayerHuman player = new PlayerHuman("Piotr");
        //Player player = new PlayerComp("Bot_Varus");

        Game game = new Game();
        game.addPlayer(new PlayerComp("Bot_Varus"));
        game.addPlayer(new PlayerComp("Bot_Blitzcrank"));
        game.addPlayer(new PlayerComp("Bot_Varus"));
        game.addPlayer(new PlayerComp("Bot_Blitzcrank"));

        game.printPlayers();
        game.removePlayer("Bot_Blitzcrank");

        game.play();
    }
}



