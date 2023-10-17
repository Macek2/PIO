package piogame;

import java.util.Random;

public class Player {
    private Random answer = new Random();
    private String name = "noname";
        
    public Player(){}
  
    public Player(String name){
        setName(name);
    }
    
    public int guess(){
        return answer.nextInt(6) + 1;
    }
       
    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            System.err.println("Nieprawidłowe imię!");
        } 
    }
    
    //REGRESJA - cofanie się w kodzie
    //DRY - Don't repeat yourself - zasada: nie powtarzaj kodu
}