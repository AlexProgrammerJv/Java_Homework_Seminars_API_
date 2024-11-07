package Homework_Sem6;
import java.util.Set;

public abstract class ElectronicsStore {
    protected String OS;
    protected String Creator;
    protected int RAM;
    protected double Diagonal;
    protected int BatteryCapacity;
    protected double Price;


    public ElectronicsStore(String Creator, String OS, int RAM, double Diagonal,
                            int BatteryCapacity, double Price) {
        this.Creator = Creator;
        this.OS = OS;
        this.RAM = RAM;
        this.Diagonal = Diagonal;
        this.BatteryCapacity = BatteryCapacity;
        this.Price = Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }


    public String getElectronicsStoreType() {
        return getClass().getSimpleName();
    }

    public String toString() {
        return getClass().getSimpleName() +
                " [" + " The Creator -> " + Creator +
                ", OS -> " + OS +
                ", RAM -> " + RAM +
                ", Diagonal -> " + Diagonal +
                ", Battery -> " + BatteryCapacity +
                ", Price -> " + Price + " ]";
    }

    public boolean ofParam(Set<Object> param) {
        if (param.contains(this.Diagonal)
                || param.contains(this.Creator)
                || param.contains(this.Price)
                || param.contains(this.OS)) return true;
        else return false;
    }
}
