import java.util.Random;
import java.util.Scanner;

public abstract class Player { //cała klasa musi byc abstrakcyjna jeśli jeden składnik jest abstrakcyjny
    private Random answer = new Random();
    private String name = "noname";

    public Player(){}

    public Player(String name){
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nieprawidłowe imię!");
        }
    }

    public abstract int guess();
     //Abstrakcyjna metoda implementowana w klasach potomnych.

    //REGRESJA - cofanie się w kodzie
    //DRY - Don't repeat yourself - zasada: nie powtarzaj kodu
}