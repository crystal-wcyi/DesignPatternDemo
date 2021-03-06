
import java.util.Random;
import com.demo.context.Context;
import com.demo.strategy.PromotionalStrategy;
import com.demo.strategy.RebateStrategy;
import com.demo.strategy.ReduceStrategy;

public class Client {

	public static void main(String[] args) {
		System.out.println("控制台");
		Context context = new Context();
		Random random = new Random();
		for (int i = 0; i < 10; i ++) {
			System.out.println("i = " + i);
			int x = random.nextInt(3);
			double consumePrice = 0;
			//消费价格也是由随机数产生的(不能为0)，当为0时重新获取(随机产生)
			while((consumePrice = random.nextInt(2000)) == 0) {}
				switch(x) {
				case 0:
					context.setStrategy(new RebateStrategy());
					break;
					
				case 1:
					context.setStrategy(new PromotionalStrategy());
					break;
				
				case 2:
					context.setStrategy(new ReduceStrategy());
					break;
				}
				
				System.out.print("【" + (x == 0 ? "打八折" : (x == 1 ? "高于200部分打八折" : (x == 2 ? "满1000减200" : ""))) + "】商品" );
				System.out.println("原价：" + consumePrice + "- 优惠后价格：" + context.cul(consumePrice));

		}
		System.out.println("循环结束！");
	}
}
