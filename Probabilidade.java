import java.util.Scanner;

class Probabilidade{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		float casos_favoraveis,total_possiveis;
		double probabilidade,porcentagem;

		System.out.println("digite o os casos favoraveis:");
		casos_favoraveis = sc.nextFloat();
		System.out.println("digite os casos possiveis");
		total_possiveis = sc.nextFloat();
        
        probabilidade = casos_favoraveis / total_possiveis;
        porcentagem = probabilidade * 100;

        System.out.println("probabilidade:" + (int)porcentagem + "%" );

 




	}
}