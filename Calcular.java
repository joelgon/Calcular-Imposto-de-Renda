import java.io.*;
import java.util.Scanner;
public class Calcular{

	public static void main(String[] args){
		Fisica fisi;
		Juridico juri;
		Scanner scanner = new Scanner(System.in);
		int op;


		do{

			System.out.println("Digite 1 para pessoa Fisica\n Digite 2 para pessoa Juridica\n Digite 0 para sair");
			op = scanner.nextInt();

			//Validar Opção
			while(op <0 && op > 2){
				System.out.println("Digite 1 para pessoa Fisica\n Digite 2 para pessoa Juridica\n Digite 0 para sair");
				op = scanner.nextInt();
			}

			switch(op){

				case 1:
					fisi = new Fisica("Pedro", 50000.00, 1000.00, 1000.00, "403.417.728-44");
					fisi.CalcularImpostodeRenda();
					System.out.println(fisi.CalcularImpostodeRenda());
				break;

				case 2: 
					juri = new Juridico("PedroME", 500000.00, 1000.00, 1000.00, "403.417.728-44");
					juri.CalcularImpostodeRenda();
					System.out.println(juri.CalcularImpostodeRenda());
				break;
			}	
		}
		while(op != 0);	
	}
}