import java.util.Scanner;
public class ComparingLoops {
	public static void main(String Args[]) {
	
		Scanner scan = new Scanner(System.in);
		
		double grade = 0;
		for(int mp=1;mp<=4;mp+=1) {
			System.out.println("Enter your grade for MP"+mp);
			grade+=scan.nextDouble();
			
			}
		System.out.println("Your average is "+(grade*100.0/100.0)/4);
	}	
}

