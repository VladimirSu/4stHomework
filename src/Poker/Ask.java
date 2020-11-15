package Poker;

import java.util.ArrayList;
import java.util.Scanner;

public class Ask extends Main implements Backinterface{

    @Override
    public void backmethod() {
            Main main = new Main();
            Scanner sc = new Scanner(System.in);
            System.out.println("------是否继续游戏------");
            System.out.println("=======1.继续======2.结束游戏========");
            int num = sc.nextInt();
            switch(num){
                case 1:

                    Round round = new Round();

                    round.round(playerComp);
                case 2:
                    System.out.println("游戏结束。");
            }
    }


}
