//*****************************************************************************
//            VISUALIZACION COMPUTACIONAL 1 - TP Nº2 - 2012
//                      Carolina Valdez Gándara
//*****************************************************************************



import java.awt.Color;
import java.util.Vector;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caro
 */
public class Paleta {
    
    private static int max_elementos; 
    private static int max_colores;
    private Vector <Color> colores;
    private Vector <Integer> escala;
    private int longitud_rango;
    
//*****************************************************************************
//La siguientes funcion inicializa la paleta de colores. A traves del parámetro recibido
//se carga una cierta paleta.     
//*****************************************************************************     
    public Paleta(int id)
    {
      
      max_elementos = 7;
      max_colores = 255;
      colores = new Vector<Color>();
      escala = new Vector <Integer>();
      longitud_rango = max_colores/max_elementos;
      
      this.cargarEscalas();
            
      if (id ==1)
          setPaletaDefault();
      else
          if (id ==2)
              setPaletaNoSignal();
          else
             if (id==3)
               setPaletaFire();
             else
                  setPaletaBlueSteel();
         
    }
    
//*****************************************************************************
//  La siguiente funcion define los rangos para cada color de la paleta
//***************************************************************************** 
    public void cargarEscalas()
    {
      escala.add(0);
     for (int i=1;i<max_elementos-1;i++)
            escala.add(escala.elementAt(i-1)+longitud_rango);  
     escala.add(max_colores); 
    }
    
//*****************************************************************************
//  La siguientes funciones definen las paletas a utilizar
//*****************************************************************************    
    public void setPaletaDefault ()
    {
       colores.add(new Color(255,255,255));
       colores.add(new Color(255,0,0));
       colores.add(new Color(255,200,255));
       colores.add(new Color(255,0,255));
       colores.add(new Color(0,0,255));
       colores.add( new Color(100,255,0));
       colores.add(new Color(220,220,220));   
    }
    
    public void setPaletaNoSignal()
    {
       colores.add(new Color(192,102,192));
       colores.add(new Color(255,255,0));
       colores.add(new Color(0,255,255));
       colores.add(new Color(0,255,0));
       colores.add(new Color(255,0,255));
       colores.add(new Color(255,0,0));
       colores.add(new Color(0,0,255));
    }
    
    public void setPaletaFire()
    {
       colores.add(new Color(255,255,0));
       colores.add(new Color(255,140,0));
       colores.add(new Color(255,69,0));
       colores.add(new Color(255,0,0));
       colores.add(new Color(178,24,34));
       colores.add(new Color(128,0,0));
       colores.add(new Color(0,0,0));
    
    }
    
    
    public void setPaletaBlueSteel()
    {
       colores.add(new Color (25,25,112));
       colores.add(new Color(70,130,180));
       colores.add(new Color(175,238,238));
       colores.add(new Color(169,169,169));
       colores.add(new Color(211,211,211));
       colores.add(new Color(105,105,105));
       colores.add(new Color(0,0,0));
    }
    
 //*****************************************************************************
//  La siguientes funciones devuelven los vectores que componen la paleta de colores
//***************************************************************************** 
    public Vector<Color> getListaDeColores() 
    {
        return colores;
    }
    
    
    public Vector<Integer> getListaDeValores() 
    {
        return escala;    
    }
    
}//Fin clase Paleta
