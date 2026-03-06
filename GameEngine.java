import java.util.*;
public class GameEngine {
    Scanner sc=new Scanner(System.in);
    Player player=new Player(2500);

    void startBattle(){
        Enemy enemy =new Enemy();
        System.out.println("Enemy health :"+enemy.health);

    
    }

    int BattleMenu(){
        System.out.println("What do you want to do ? ");
        System.out.println("1.Run away ");
        System.out.println("2.Fight");
        int choice=sc.nextInt();
        return choice;

    }

    void battle(){
        System.out.println("An iron Knight appeared ");
       

    }
    

    void startgame(){
        System.out.println("HP : "+ Player.hp);
        int c=BattleMenu();
        if(c == 1){
            startBattle();
        }



    }

    public void main(String args[]){

        System.out.println("------Welcome to the Tower of Iron Shadows ------ ");
        startgame();

    }
    
}
