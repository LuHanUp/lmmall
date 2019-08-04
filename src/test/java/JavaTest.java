import org.joda.time.DateTime;

/**
 * 代码块 静态代码块 构造方法 执行顺序以及执行次数
 *  结论:静态代码块只会执行一次并且是最先执行
 *      代码块优于构造方法执行,但是会执行多次
 *      构造方法最后执行,也会执行多次
 * @author luHan
 * @date 2019-07-26 23:22
 */
public class JavaTest {
    static{
        System.out.println("静态代码块");
    }

    {
        System.out.println("代码块");
    }

    public JavaTest(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        new JavaTest();
        new JavaTest();

    }
}
