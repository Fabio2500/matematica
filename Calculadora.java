import java.util.Scanner;

class Calculadora{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
    int soma,subt,mult,div;
    int num1,num2;
    int escolha;
     
 
 System.out.println("o que deseja fazer?:\n");
 System.out.println("1-somar\n2-subtrair\n3-dividir\n4-multiplicar\n");
 escolha = sc.nextInt();

 if(escolha == 1){
 System.out.println("digite o primeiro numero:");
 num1 = sc.nextInt();   
 System.out.println("digite o segundo numero:");
 num2 = sc.nextInt();
 soma = num1+num2;
 System.out.println("resultado:"+ soma);

   }
   if(escolha==2){
   	System.out.println("digite o primeiro numero:");
   	num1 = sc.nextInt();
   	System.out.println("digtie o segundo numero:");
   	num2 = sc.nextInt();
   	subt = num1 - num2;
   	System.out.println("resultado:"+subt);

   }
   if(escolha == 3){
   	System.out.println("digite o numerador:");
   	num1 = sc.nextInt();
   	System.out.println("digite o denominador:");
   	num2 = sc.nextInt();
   	System.out.println("resultado:"+ num1/num2);
   }
   if(escolha == 4){
   	System.out.println("digite o primeiro numero:");
   	num1 = sc.nextInt();
   	System.out.println("digite o segundo numero");
   	num2 = sc.nextInt();
   	mult = num1*num2;
   	System.out.println("resultado:"+ mult);

   }
}


}