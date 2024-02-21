
package controlador;

/**
 *
 * @author ABRAHAM
 */
public class operaciondivision implements operacionescontrolador{

    @Override
    public double calcular(double a1, double a2) {
   double resultado = 0;
   
   resultado = a1 / a2;
   
   return resultado;
    }
    
    
    
    
}
