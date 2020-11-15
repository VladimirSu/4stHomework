package Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main{

    public static ArrayList<String> playerComp;
    private static Ask ask;
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();     //定义一副扑克牌

        String[] colors = {"♠","❤","♣","♦"};
        String[] numbers = {" 2"," A"," J"," Q"," K"," 3"," 4"," 5"," 6"," 7"," 8"," 9"," 10"};

        //梭哈扑克牌中不需要大王小王


        //遍历将花色与数组组成扑克牌
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color+number);
            }
        }


        //洗牌
        Collections.shuffle(poker);

        //将牌分配给三个玩家以及底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> playerComp = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();


        for (int i = 0; i < poker.size(); i++) {
            String temp = poker.get(i);
            if(i>=10){
                dipai.add(temp);
            }
            else if(i%2==0){
                player01.add(temp);
            }
            else if(i%2==1){
                playerComp.add(temp);
            }
        }

        Scanner sc = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            System.out.println("请输入第"+i+"个玩家的名称");
            String temp = sc.next();
            name.add(temp);
        }

        //加载进度条
        ProgressBar bar = new ProgressBar();
        bar.bar();

        //调用迭代器遍历数组展示玩家的手牌与底牌
        IteratorImpl outputIt = new IteratorImpl();
        System.out.print(name.get(0)+" 的手牌为 ");
            outputIt.output(player01);
        System.out.print(name.get(1)+" 的手牌为 ");
            outputIt.output(playerComp);

        Ask ask = new Ask();                        //接口回调，若回合结束，则调用Ask类
        Round round = new Round();
        round.setAsk(ask);
        round.round(playerComp);


    }

}
