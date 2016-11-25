//*****************************************************************************
//            VISUALIZACION COMPUTACIONAL 1 - TP Nº2 - 2012
//                      Carolina Valdez Gándara
//*****************************************************************************

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caro
 */



//****************************************************************************
//CLASE NUMERO COMPLEJO PARA TRABAJAR CON OPERACIONES MATEMATICAS 
//solo contiene las operaciones que necesité utilizar para la generacion de los fractales
//****************************************************************************
public class NroComplejo {
    
    private double real;
    private double imaginario;
    
    
    public NroComplejo (double real, double imaginario)
    {
      this.real = real;
      this.imaginario = imaginario;
             
    }
    
    
    public double getParteReal()
    {
     return real;
    }
    
    
    public double getParteImaginaria()
    {
      return imaginario;
    }
    
    
    public double getModulo()
    {
       return (double) Math.sqrt(real*real + imaginario*imaginario);
    }
    
    
    public static final NroComplejo sumar(NroComplejo uno, NroComplejo dos)
    { 
        NroComplejo result = new NroComplejo (uno.getParteReal()+dos.getParteReal(),uno.getParteImaginaria()+dos.getParteImaginaria());
        return result;    
    }

    
    public NroComplejo sqrt()
    {
      NroComplejo result = new NroComplejo ((this.getParteReal()*this.getParteReal()) - (this.getParteImaginaria()*this.getParteImaginaria()),
              2*this.getParteReal()*this.getParteImaginaria());
      return result;
    }
    
    
    public void setReal(double sumaR) 
    {
        real = sumaR;
    }

    public void setImaginario(double sumaI) 
    {
        imaginario = sumaI;
    }

    public NroComplejo dividir(int i) 
    {
        NroComplejo result = new NroComplejo (this.getParteReal()/i, this.getParteImaginaria()/i);
        return result;
           
    }

    public NroComplejo pow(NroComplejo Zn) {
        NroComplejo result = new NroComplejo(Math.exp(this.getParteReal())*Math.cos(this.getParteImaginaria()),Math.exp(Zn.getParteReal())*Math.sin(Zn.getParteImaginaria()));
        return result;
    }

    NroComplejo potencia(double PI) {
        NroComplejo result = new NroComplejo(Math.exp(this.getParteReal())*Math.cos(PI), Math.exp(this.getParteImaginaria())*Math.sin(PI));
        return result;
    }
}//Fin clase NroComplejo
