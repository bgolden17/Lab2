import java.util.Scanner;

public class RoomCalculator
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Length:\n");
		double length = in.nextDouble();
		System.out.println("Enter Width:\n");
		double width = in.nextDouble();
		double area = length * width;
		double perimeter = length * 2 + width +2;
		System.out.println("Area: " + area + "\n");
		System.out.println("Perimeter: " + perimeter + "\n");
	}
}