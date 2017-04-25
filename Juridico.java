/* 
  Desenvolvedor: Joel Gonçalves;
  class: Juridico;
*/
import java.io.*;
import java.util.Scanner;

public class Juridico extends Contribuinte{
	private String Cnpj;
	private double Gastospessoais;
	private double Gastosequipamentos;

	public Juridico (String Nome, double RendaBrutaAnual, double Gastospessoais, double Gastosequipamentos, String Cnpj){
		super(Nome, RendaBrutaAnual, Gastospessoais, Gastosequipamentos);
		this.Cnpj = Cnpj;
	}

	//metodos de acesso;
	public void setCnpj(String Cnpj){
		this.Cnpj = Cnpj;
	}

	public String getCnpj(){
		return Cnpj;
	}

	public double CalcularImpostodeRenda(){
		if (CalcularRendaLiquida() <= 100000.00){
			return (CalcularRendaLiquida() * 0.5);
		}
		else{
			if(CalcularRendaLiquida() > 100000.00 && CalcularRendaLiquida() < 200000.00){
				return ((CalcularRendaLiquida() * 0.1) - 5000.00);
			}
			else{
				return((CalcularRendaLiquida() * 0.3) - 45000.00);
			}
		}
	}
}