

import java.util.Scanner;

public class AreaOfWallTeam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 8;
		int length = -999;
		int area = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How long is the wall?");
		length = input.nextInt();
		area = height * length;
		System.out.println("The area of the wall is " + area);

	}

}