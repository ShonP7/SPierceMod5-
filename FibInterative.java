
public class FibInterative {
	
	public int maxNum = 7;
	public int firstNum = 0;
	public int secondNum  = 1;
	public int Sum;
	
	{
	for (int i = 0; i < maxNum; i++) 
	{
		System.out.print(firstNum + " ");
		Sum = firstNum+secondNum;
		firstNum=secondNum;
		secondNum=Sum; 
		
	}
}
	

}
