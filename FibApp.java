
public class FibApp {

	public static void main(String[] args) {
		fibonacciArray[0]= 1;
		fibonacciArray[1]= 1;
		long startTime = System.nanoTime();
		System.out.println(fibonacci(6));
		long endTime = System.nanoTime();
		System.out.println("Recursion compute time is:  " + (endTime-startTime) + "\n");
		
		FibInterative fibLoop = new FibInterative();
		long startTime2 = System.nanoTime();
		System.out.print(" " + fibLoop);
		long endTime2 = System.nanoTime();
		System.out.println("\nInterative compute time is:   " + (endTime2-startTime2));

	}
	
public static long fibonacciArray[] = new long[100];
	
	public static long fibonacci(long num) {
		long fibValue = 0;
		if (num == 0) {
			return 0;
			
		}else if (num == 1) {
			return 1;
			
		}else if (fibonacciArray[(int)num] != 0){
			return fibonacciArray[(int)num];
			
		}else{
			fibValue = fibonacci(num-1) + fibonacci(num-2);
			fibonacciArray[(int) num]=fibValue;
			return fibValue;
		}
		
	}

}
