package scoremanagement;
import java.util.Scanner;

public class Main {
	public final static Scanner scanner= new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("\t\t\tSCORECARD MANAGER");
		Play start = new Play();
		start.toss();
	}

}
