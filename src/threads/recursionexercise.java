package threads;

public class recursionexercise {
	static int max = 50;
	static int count = 0;
	
	public static void main(String[] args) {
			countBackwards();
	}
	
			
	static int countBackwards() {
		int x;
		if(count < max) {
			count++;
			x = countBackwards();
		}else {
			x = max;
		}
			System.out.println(x);
			return x-2;
	}
}
