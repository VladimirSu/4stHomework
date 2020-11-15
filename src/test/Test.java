package test;

public class Test {

        public void main(String[] args) {
            String asd= "♠1";
            String[] color = getColor(asd);
            int[] num = getNum(asd);
            System.out.println(num);
            System.out.println(color);
        }
        //获取花色的方法
        public String[] getColor(String s){
            String[] color = s.split("\\d");
            return color;
        }

        //获取数字的方法
        public int[] getNum(String s){
            String[] num_string = s.split("\\D");
            String a = "";

            for(String m : num_string){
                a += m;
            }

            String[] num = a.split("");  //将分离出的重新保存在新数组num中
            int[] inte = new int[num.length];

            for(int i =0; i < num.length; i++){
                inte[i] = Integer.parseInt(num[i]); //将该数组中的数字存入int数组
            }

            return inte;
        }

}
