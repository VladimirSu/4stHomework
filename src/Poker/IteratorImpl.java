package Poker;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorImpl extends Main implements Iterator<String> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }

    //展示牌的方法
    public void output(ArrayList<String> player){
        Iterator<String> playerIt = player.iterator();

        while (playerIt.hasNext()){
            System.out.print("{ "+playerIt.next()+" } ");
        }
        System.out.println("");
    }
}
