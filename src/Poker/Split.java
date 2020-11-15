package Poker;

import java.util.ArrayList;

public class Split{

    //分割电脑玩家点数
    public String getNum(String comp2) {
        ArrayList<String> comp2num = new ArrayList<>();     //player02的点数
        String stringArray[] = comp2.split(" ");
        String outputnum = stringArray[1];
        return outputnum;
    }

    //分割电脑玩家花色
    public String getColor(String comp3) {
        ArrayList<String> comp3color = new ArrayList<>();     //player03的花色
        String stringArray[] = comp3.split(" ");
        String outputcolor = stringArray[0];
        return outputcolor;

    }
}
