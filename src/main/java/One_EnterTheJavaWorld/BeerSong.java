package One_EnterTheJavaWorld;

/**
 * Created by Administrator on 2017/5/11.
 * 设计真正的应用程序：数啤酒瓶童谣
 */
public class BeerSong {
    /*
    beer 啤酒
    bottle 瓶子
    wall 墙壁
    Take 拿；取；执行；需要；接受；理解；修(课程)；花费；吃（喝）；认为；搭乘
    pass 通过
    around  到处；在周围；现有；闲散地；转弯；掉头
    more 更多的
     */
    public static void main(String[] args) {
        int beernum = 99;
        String world = "bottles";
        while (beernum > 0) {
            if (beernum == 1) {
                world = "bottle";
            }
            System.out.println(beernum+" "+world+"of beer on the wall");//99 瓶啤酒在墙上
            System.out.println(beernum+" "+world+"of beer.");//99 瓶啤酒。
            System.out.println("Take one down.");//喝掉一个。
            System.out.println("Pass it around");//通过它周围
            beernum=beernum-1;

            if (beernum > 0) {
                System.out.println(beernum + " " + world + "of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");//没有更多瓶啤酒在墙上
            } //else结束
        }//while 结束
    }//main方法结束
}//class结束
