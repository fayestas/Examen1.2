import java.util.Scanner;

public class Meses{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);
		System.out.print("Ingrese mes");
		int mes	= lea.nextInt();
	
		switch(mes){
			case 1:
				System.out.println("31");
				break;
			case 2:
				System.out.println("28");
				break;
		    case 3:
				System.out.println("30");
				break;
			case 4:
				System.out.println("31");
				break;
			case 5:
				System.out.println("30");
				break;
			case 6:
				System.out.println("31");
				break;
			case 7:
				System.out.println("30");
				break;
			case 8:
				System.out.println("331");
				break;
			case 9:
				System.out.println("30");
				break;
			case 10:
				System.out.println("31");
				break;
			case 11:
				System.out.println("30");
				break;
			case 12:
				System.out.println("31");
			default:
				System.out.println("error");
		}
	}
}