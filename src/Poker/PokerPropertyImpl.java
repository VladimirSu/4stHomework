package Poker;

public class PokerPropertyImpl implements PokerProperty {

    //判断数字大小
    @Override
    public int num(String num) {
        switch (num) {
            case "2":
                return 13;
            case "A ":
                return 12;
            case "K":
                return 11;
            case "Q":
                return 10;
            case "J":
                return 9;
            case "10":
                return 8;
            case "9":
                return 7;
            case "8":
                return 6;
            case "7":
                return 5;
            case "6":
                return 4;
            case "5":
                return 3;
            case "4":
                return 2;
            case "3":
                return 1;
        }
        return -1;
    }

    //判断花色大小
    @Override
    public int color(String color) {
        switch (color) {
            case "♠":
                return 4;
            case "❤":
                return 3;
            case "♣":
                return 2;
            case "♦":
                return 1;
        }
        return -1;
    }
}
