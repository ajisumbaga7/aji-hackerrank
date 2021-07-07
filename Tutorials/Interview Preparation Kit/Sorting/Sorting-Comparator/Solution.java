import java.io.*;
import java.util.*;

class Player {
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2){
        if(p1.score == p2.score){
            return p1.name.compareTo(p2.name);
        }else{
            return p2.score - p1.score;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i=0;i<n;i++){
            player[i] = new Player(input.next(), input.nextInt());
        }
        input.close();
        
        Arrays.sort(player, checker);
        for(int i=0;i<n;i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
