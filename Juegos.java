import java.util.Scanner;
class Juegos{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("ingrese un numero: ");
int numero=sc.nextInt(); 
int ps3=0;
int xbox=0;
int wii=0;
String x=sc.next();

for (int i=0;i<=numero ;i++ ) {
	

		switch(x){
			case "PS3":
			{

				ps3++;
				System.out.println(ps3 );
				break;
			}
			case "XBOX":
			{
				xbox++;
				System.out.println(xbox);
				break;
			}
			case "WII":
			{
				wii++;
				System.out.println(wii);
				break;
			}
			default:
				System.out.println("error");

			}
		}
	}
}



