import java.util.Scanner;
public class Tcliente{
	public static void main(String[] args){
	Scanner sc = new Scanner (System.in);
	int cobro=0;
	double descuento=0;
	double subtotal=0;
	System.out.println("zona");
	char zona=sc.next().charAt(0);
	System.out.println("tipo de cliente");
	String tc=sc.next();
	System.out.println("Kilovatios Consumidos");
	double kiva=sc.nextDouble();

	if (kiva <=100) {
		
	if(zona == 'A'){
			cobro = 50;
		}
		else if(zona == 'B'){
			cobro = 30;
		}
		else if(zona == 'C'){
			cobro = 20;	
		}
		else{
			System.out.println("Error de Zona");
			comis = 0;	
		}
	}
	if (kiva>100 && kiva<=1000) {
			if(zona == 'A'){
			cobro = 100;
		}
		else if(zona == 'B'){
			cobro = 60;
		}
		else if(zona == 'C'){
			cobro = 40;	
		}
		else{
			System.out.println("Error de Zona");
			comis = 0;	
		}
	}
	if (kiva>1000 && kiva<=1000) {
			if(zona == 'A'){
			cobro = 200;
		}
		else if(zona == 'B'){
			cobro = 120;
		}
		else if(zona == 'C'){
			cobro = 80;	
		}
		else{
			System.out.println("Error de Zona");
			comis = 0;	
		}
	}

		
	


	subtotal= cobro;
	System.out.println("subtotal:" + subtotal);
	
	
	double descuento=0;
	if(tc.equals("Diplomatico"))
	{
		descuento=subtotal/2;
	System.out.println("Total: "+descuento + "-30%" + descuento -(0.03));
	}
	
	else{
	System.out.println("no hay descuento");
	}}}