package Poker;

public class ProgressBar {
    public void bar(){
        System.out.println("开始发牌");
        System.out.println("========================");
        for (int i = 0; i < 20; i++) {
            System.out.print("■");
            try {Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println("");
        System.out.println("========================");
        System.out.println("发牌完成");
    }
}
