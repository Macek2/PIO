import java.util.*;
public class WinStatistics implements Statistics{
    private Map<Player, Integer> score = new HashMap();

    public void addPlayer(Player player){
        score.put(player, 0);
    }

    public void updatePlayer(Player player) {
        int pts = score.getOrDefault(player, 0);
        score.put(player, pts+1);
    }

    public void print() {
        System.out.println("#########################");
        score.forEach((player, score) -> {
            System.out.println(player.getName() + ": " + score);
        });
    }

    public void clear() {
        score.clear();
    }
}
