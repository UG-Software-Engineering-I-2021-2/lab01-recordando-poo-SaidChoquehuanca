
package cs.ing.software.lab1;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;
import java.io.IOException;

import cs.ing.software.lab1.*;

public class EjemploVehiculo {
    @Test()
    public void test01() {
        Vehicle Truck;
        Truck toyota = new Truck(10,20);
        Assert.assertEquals("Camión necesita reabastecimiento de combustible", toyota.Trip(12));
    }
    /*
    @Test
    public void test02(){
        Automovil toyota = new Automovil(10,20);
        Assert.assertEquals("Vehiculo viajó 4.0 km y aún tiene 6.40 de combustible", toyota.Drive(4));
    }*/

}
