abstract class EnergySource {
    int sourceId;
    String sourceName;
    double energyGenerated;

    EnergySource(int id, String name, double energy) {
        sourceId = id;
        sourceName = name;
        energyGenerated = energy;
    }

    abstract double calculateEfficiency();

    void display() {
        System.out.println("Source ID: " + sourceId);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
        System.out.println();
    }
}

class SolarEnergy extends EnergySource {

    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}

class WindEnergy extends EnergySource {

    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

public class Main {
    public static void main(String[] args) {

        EnergySource e1;

        e1 = new SolarEnergy(101, "Solar Energy", 4000);
        e1.display();
        
        EnergySource e2;

        e2 = new WindEnergy(102, "Wind Energy", 6000);
        e2.display();
    }
}
