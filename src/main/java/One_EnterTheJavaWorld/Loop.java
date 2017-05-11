package One_EnterTheJavaWorld;

/**
 * Created by Administrator on 2017/5/11.
 * 重复再重复，循环再循环
 */
public class Loop {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("before the loop...");//输出：在循环之前
        while (x < 4) {
            System.out.println("In the loop...");//输出：在循环中
            x=x+1;
        }
        System.out.println("this is after the loop...");//输出：在循环后
    }
}
