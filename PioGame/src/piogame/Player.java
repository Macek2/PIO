package piogame;

import java.util.Random;

public class Player{
    private Random answer = new Random();
    public int guess(){
        return answer.nextInt(6) + 1;
    }
    
    private String name;    
    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.err.println("Nieprawidłowe imię!");
        } 
    }
    
}
