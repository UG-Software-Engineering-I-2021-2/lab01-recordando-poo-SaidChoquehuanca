package cs.ing.software.lab1;

public class Automovil extends Vehicle {
    public Automovil(double quantityOfFuel, double capacityOfFuel) {
        super(quantityOfFuel, capacityOfFuel);
        this.useByKm = 0.9;
    }

    public void supplying(double fuel) {
        if(this.quantityOfFuel +  fuel > this.capacityOfFuel) {
            System.out.println("Automovil  no  se  puede  reabastecer  el  tanque,  sobrepasa la capacidad");
            return;
        }
        this.quantityOfFuel = this.quantityOfFuel + fuel;
        System.out.println("La cantidad de combustible del Automovil es: " + this.quantityOfFuel);

    }

    public String Trip(float kilometers) {
        if(this.useByKm * kilometers > this.quantityOfFuel){
            return "Automovil necesita reabastecimiento de combustible";
        }

        this.quantityOfFuel = this.quantityOfFuel - this.useByKm * kilometers;
        return ("Automovil viajó " + kilometers + " km y aún tiene" + this.quantityOfFuel + " de combustible");
    }

}
