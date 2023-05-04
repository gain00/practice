package abs;

public class LgCalculator extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		
		return a-b;
	}

	@Override
	public double average(int[] nums) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int num: nums) {
			sum +=num;
		}
		
		return sum/nums.length;
	}

}
