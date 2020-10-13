import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: HelloWorld
 * @description: GitTest
 * @author: 张小锋
 * @create: 2020-10-13 12:14
 **/
public class HelloWorld {
    public static void main(String [] args){
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(2);
        queue.add(4);
        queue.add(3);
        while(!queue.isEmpty())
        {
            System.out.print(queue.poll()+" ");
        }
    }

}
