
public class Testing {
	public static void main(String[] args) {
		//this is under git control, fascinating
		
		double cumulator = 0.0;
		int num = 1000000000;
		
		for (int i=1; i <= 1000000000; i++) {
			cumulator += 1.0 / i;
		}
		
		double eularConstant = cumulator - Math.log(num);
		
		System.out.println(eularConstant);
		System.out.println("another change");
	}
}
