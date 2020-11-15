package Poker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Round extends Main{

    private Backinterface ask;
    public void setAsk (Backinterface backinterface){
        this.ask = backinterface;
    }
    //进行回合
    public void round(ArrayList<String> playerComp) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        //随机抽取电脑玩家的牌
            //获取Computer的点数与花色
            int temp1 = ran.nextInt(5) + 1;         //随机抽取一个数代表Arraylist位置
            String comp = playerComp.get(temp1);
            Split split = new Split();                  //调用Split类
            String num2 = split.getNum(comp);          //用空格分割花色
            String color2 = split.getColor(comp);

            //玩家输入想要出的牌
            ArrayList<String> playerInput = new ArrayList<>();
            playerInput = setInput();
            String color = playerInput.get(0);          //获取玩家输入的花色
            String num = playerInput.get(1);            //获取玩家输入的点数

            try {Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }//延迟显示电脑玩家的手牌

            System.out.println("电脑玩家出的牌为："+ comp);  //展示电脑玩家出的牌

            PokerPropertyImpl judge = new PokerPropertyImpl();

            //获取各玩家花色点数的等级
            int playerColor = judge.color(color);
            int compColor = judge.color(color2);
            int playerNum = judge.num(num);
            int compNum = judge.num(num2);

            int judgeColorlevel = judgeMethod(playerColor,compColor);    //判断谁的花色较大
            int judgeNumlevel = judgeMethod(playerNum,compNum);          //判断谁的点数较大

            //判断谁获胜
            if(judgeColorlevel == 1){
                System.out.println("玩家获胜");
            }else if (judgeColorlevel == 2){
                System.out.println("电脑获胜");
            }else{
                if(judgeNumlevel == 1){
                    System.out.println("玩家获胜");
                }else if(judgeNumlevel == 2){
                    System.out.println("电脑获胜");
                }else{
                    System.out.println("平局");
                }

            }

            System.out.println();
            ask.backmethod();


    }

    public static ArrayList setInput() {
        int temp;
        EqualsignLine line = new EqualsignLine();
        ArrayList<String> input = new ArrayList<>();
        line.line();                                            //调用等号分割线
        System.out.println("请输入想要出的牌（空格键分割花色与数字）");
        line.line();
        System.out.println("请输入符号花色（例如：♠ A）");
        line.line();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String stringArray[] = inputString.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            input.add(stringArray[i]);
        }
        return (input);
    }

    public static int judgeMethod(int player,int computer){
        if(player == computer){
            return 3;           //3为玩家与电脑花色相等判断数
        }else if(player > computer){
            return 1;           //1为玩家花色大于电脑
        }else{
            return 2;           //2为玩家花色小于电脑
        }
    }



}
