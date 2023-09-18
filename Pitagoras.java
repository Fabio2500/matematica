import java.util.Scanner;

class Pitagoras{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); 
		float hipotenusa,cateto_A,cateto_B;
		double teorema_pitagoras;

		System.out.println("digite o valor da HIPOTENUSA:");
		hipotenusa = sc.nextFloat();
		System.out.println("digite o valor do CATETO");
		cateto_A = sc.nextFloat();
		System.out.println("digite o valor do SEGUNDO CATETO");
		cateto_B = sc.nextFloat();

		teorema_pitagoras = Math.pow(cateto_A,2) + Math.pow(cateto_B,2);

		if(Math.pow(hipotenusa,2) == teorema_pitagoras){
			System.out.println("a hipotenusa está corrretamente escrita");
		}else{
			System.out.println(" a hipotenusa está errada refaça a questao");
		}
		System.out.println("valor do quadrado do primeiro cateto:" + Math.pow(cateto_A,2) + " somado ao quadrado do segundo:" + Math.pow(cateto_B,2) + " resulta ao quadrado da hipotenusa:"+ Math.pow(hipotenusa,2));



	}
}