
package controlador;

/**
 *
 * @author ABRAHAM
 */
public class operacionesfactory implements Abstractfactoryoperacion{

    @Override
    public operacionescontrolador efectuarsuma() {
     return new operacionsuma();
    }

    @Override
    public operacionescontrolador efectuarresta() {
        return new operacionrestar();
          }

    @Override
    public operacionescontrolador efectuarmultiplicacion() {
        return new operacionesmultiplicacion();
        }

    @Override
    public operacionescontrolador efectuardivision() {
        return new operaciondivision();
        }
    
}
