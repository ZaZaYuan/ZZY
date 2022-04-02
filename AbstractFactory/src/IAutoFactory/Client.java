package IAutoFactory;


public class Client {
	public static void main(String[] args) {
		IAutoFactory factory;
		ISport it;
		ISUV iv;
		factory=(IAutoFactory)XMLUtil.getBean();
		it=factory.creatSport();
		iv=factory.creatSUV();
		it.ignition();
		it.startup();
		iv.ignition();
		iv.startup();
   }
}
