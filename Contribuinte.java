/* 
  Desenvolvedor: Joel Gonçalves;
  class: Contribuinte;
*/
import java.io.*;
import java.util.Scanner;

public class Contribuinte{

  protected String Nome;
  protected double RendaBrutaAnual;
  protected double RendaLiquidaAnual;
  protected double Abatimento1;
  protected double Abatimento2;
  
  Scanner scanf = new Scanner(System.in);

  //Construtor da class;
  public Contribuinte(String Nome, double RendaBrutaAnual, double Abatimento1, double Abatimento2){
    this.Nome = Nome;
    this.RendaBrutaAnual = RendaBrutaAnual;
    this.Abatimento1 = Abatimento1;
    this.Abatimento2 = Abatimento2;

  }
                
  //metodos de acesso;
              
  public void setNome (String Nome){
    this.Nome = Nome;
  }
                
  public void setRendaBrutaAnual(double RendaBrutaAnual){
    this.RendaBrutaAnual = RendaBrutaAnual;
  }
                
  public void setRendaLiquidaAnual(double RendaLiquidaAnual){
    this.RendaLiquidaAnual = RendaLiquidaAnual;
  }
   
  public void setAbatimento1 (double Abatimento1){
    this.Abatimento1 = Abatimento1;
  }

  public void setAbatimento2 (double Abatimento2){
   this.Abatimento2 = Abatimento2;
  }

  public String getNome(){
    return Nome;
  }
                
  public double getRendaBrutaAnula(){
    return RendaBrutaAnual;
  }
   
  public double getAbatimento1(){
    return Abatimento1;
  }

  public double getAbatimento2(){
    return Abatimento2;
  }

    public double CalcularRendaLiquida(){
      RendaLiquidaAnual = (RendaBrutaAnual - (Abatimento1 + Abatimento2));
      return RendaLiquidaAnual;
    }
                
}
