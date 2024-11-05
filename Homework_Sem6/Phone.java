package Homework_Sem6;

public class Phone extends ElectronicsStore {
    public String PhoneOS;
    public int BatteryCapacity;

    public Phone(String creator, String PhoneOS, int volumeRAM, double monitorDiagonal,
                 int BatteryCapacity, double price) {
        super(creator, volumeRAM, monitorDiagonal, price);
        this.PhoneOS = PhoneOS;
        this.BatteryCapacity = BatteryCapacity;
    }

    String printCreator(){
        return creator;
    }

    public String toStringPhone() {
        return " [" + " The Creator -> " + creator +
                ", Phone_OS -> " + PhoneOS +
                ", RAM -> " + volumeRAM +
                ", Diagonal -> " + monitorDiagonal +
                ", Battery -> " + BatteryCapacity +
                ", Price -> " + price + " ]";
    }
}
