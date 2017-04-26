/* 
  Desenvolvedor: Joel Gonçalves;
  class: Contribuinte;
*/
import java.io.*;
import java.util.Scanner;

public class Fisica extends Contribuinte{
  public double GastosdeSaude;
  public String Cpf;
  public double GastosdeEducacao;
                
  Scanner scanf = new Scanner(System.in);
                
  public Fisica(String Nome, double RendaBrutaAnual, double GastosdeSaude, double GastosdeEducacao, String Cpf){
    super(Nome, RendaBrutaAnual, GastosdeSaude, GastosdeEducacao);
    this.Cpf = Cpf;
  }
                
  //Metodos de acesso;
                
  public void setCpf(String Cpf){
    this.Cpf = Cpf;
  }
                            
  public String getCpf(){
    return Cpf;
  }

  public double CalcularImpostodeRenda(){
    if(CalcularRendaLiquida() <= 10000.00){
      return 0;
    }
    else{
      if(CalcularRendaLiquida() > 10000.00 && CalcularRendaLiquida() < 20000.00){
        return (CalcularRendaLiquida() * 0.1 - 1000.00);
      }
      else{
        return (CalcularRendaLiquida() *0.25 - 4000.00);
      }
    }
  }                
}
