import java.util.Scanner;

class Fatorial{


public static int fatorial( int numero){
	int f=1,r;
	int i=0;
	for(i=2;i<=numero;i++){
		f=f*i;
	}
	
	return f;
}
 



	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int num,fat,i;
		i=0;
        System.out.println("digite o numero para tirar o fatorial:");
        num = sc.nextInt();
        System.out.println("fatorial de "+ num + ": " + fatorial(num));
       
        
       



	}
}
