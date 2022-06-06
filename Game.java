/*
public game - starts each round and with asking your name and give intrsuctions to quit of start over at the end of a round

public void leaderboard - connects the players name with the number of incorrect guesses

Authors - Ellie Soderquist and Ainsley Chisman and Dylan Huynh
*/

import java.util.HashMap;


public class Game {
  
  private HashMap<String, Integer> players = new HashMap<String, Integer>();
  

  public Game () {
    int round = 1;
    while(round == 1){
      Round g = new Round();
      String name = Utils.inputStr ("What's your name? ");
      players.put(name, g.run());
      
      round = Utils.inputNum("Type \"1\" to play again \nType anything else to quit: ");
      
    }

  
  }

  public void leaderBoard(){ 
  System.out.println("*LEADERBOARD*");
    for(String n: players.keySet()) {
      String key = n.toString();
      String value = players.get(n).toString();
      System.out.println(key + " " + value);
    }
  }
}








        