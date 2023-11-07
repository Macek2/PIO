import java.util.Scanner;

public class PlayerHuman extends Player{
    private Scanner sc = new Scanner(System.in);

    public PlayerHuman(){}

    public PlayerHuman(String name){
        //setName(name);
        super(name);
    }

    @Override
    public int guess(){
        System.out.println("Wpisz liczbę od 1-6");
        return sc.nextInt();
    }

}
// super - wywołuje konstruktor klasy nadrzędnej
// this - wywołuje konstruktor klasy aktualnej

