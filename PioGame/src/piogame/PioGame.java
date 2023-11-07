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

        //Player player = new Player("Piotr");
        //player.setName("Piotr");
        //PlayerHuman player = new PlayerHuman("Piotr");
        Player player = new PlayerComp();

        try{
            player.setName("");
        }
        catch(IllegalArgumentException ex){
            System.err.println("Błąd");
        }

        Random rand = new Random();     //obiekt losujący
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