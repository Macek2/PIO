package piogame;

import java.util.Random;

public class Player{
    private Random answer = new Random();
        public int guess(){
            return answer.nextInt(6) + 1;
        }
    private String name;    
}
