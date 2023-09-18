import java.util.Scanner;

class Areas_figurasPlanas{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		float a,b,h,l,b_maior,d,d_maior, r;
	    double formula;
	    int escolha,escolha2;
	 
	 escolha2 = 1;

	 while(escolha2!=0){

	 System.out.println("digite qual o numero respectivo a qual figura ira calcular a area:\n");
	 System.out.println("1-quadrado\n2-triangulo\n3-trapezio\n4-retangulo\n5-losango\n6-circulo\n");
	 System.out.println("escolhe qual tipo?:\n");
	 escolha = sc.nextInt();
     switch(escolha){
     case 1:
     	System.out.println("forma escolhida:quadrado\n");
     	System.out.println("digite o valor dos lados:");
     	l = sc.nextFloat();
     	formula = Math.pow(l,2);
     	System.out.println("valor da area:"+ formula);
     	break;
     case 2:
     	System.out.println("forma escolhida:triangulo\n");
     	System.out.println("digite o valor da base:");
     	b = sc.nextFloat();
     	System.out.println("agora digite o valor da altura:");
     	h = sc.nextFloat();
     	formula = b*h/2;
     	System.out.println("valor da area:"+ formula);
     	break;
     case 3:
     	System.out.println("area escolhida:trapezio\n");
     	System.out.println("digite o valor da base:");
     	b = sc.nextFloat();
     	System.out.println("agora digite o valor da base maior:");
     	b_maior = sc.nextFloat();
     	System.out.println("agora digite o valor da altura:");
     	h = sc.nextFloat();
     	formula = (b+b_maior)*h/2;
     	System.out.println("valor da area:"+ formula);
     	break;
     case 4:
     	System.out.println("forma escolhida:retangulo\n");
     	System.out.println("digite o valor da base:");
     	b = sc.nextFloat();
     	System.out.println("agora digite a altura:");
     	h = sc.nextFloat();
     	formula = b*h;
     	System.out.println("o valor da area:"+ formula);
     	break;
     case 5:
     	System.out.println("forma escolhida:losango\n");
     	System.out.println("digite o valor da diagonal maior:");
     	d_maior = sc.nextFloat();
     	System.out.println("digite o valor da diagonal menor:");
     	d = sc.nextFloat();
     	formula = d_maior*d/2;
     	System.out.println("valor da area:" + formula);
     	break;
     case 6:
     	System.out.println("forma escolhida:circulo\n");
     	System.out.println("digite o valor do raio:");
     	r = sc.nextFloat();
     	formula = Math.PI * Math.pow(r,2);
     	System.out.println("valor de pi:" + Math.PI);
     	System.out.println("valor da area: " + formula);

     }
     System.out.println("deseja calcular mais uma area? digite 0 para não e 1 para sim");
     escolha2 = sc.nextInt();
 }
     System.out.println("fim da aplicação");
	}

}