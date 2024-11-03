package Homework_Sem6;

import java.util.ArrayList;
import java.util.List;

public abstract class ElectronicsStore {
    protected String pcMaker;
    protected int volumeRAM;
    protected int volumeHardDisk;
    protected int monitorDiagonal;
    protected double price;
    private List<Integer> listShop;

    public ElectronicsStore(String pcMaker, int volumeRAM, int volumeHardDisk, int monitorDiagonal, double price) {
        this.pcMaker = pcMaker;
        this.volumeRAM = volumeRAM;
        this.volumeHardDisk = volumeHardDisk;
        this.monitorDiagonal = monitorDiagonal;
        this.price = price;
        this.listShop = new ArrayList<>();
    }


    public List<Integer> getListShop() {
        return new ArrayList<>(listShop);
    }

    public void addListShop(int i) {
        this.listShop.add(i);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getElectronicsStoreType() {
        return getClass().getSimpleName();
    }

    public String toString() {
        return getElectronicsStoreType() +
                " [" + " PC_Maker -> " + pcMaker +
                ", RAM -> " + volumeRAM +
                ", HardDisk -> " + volumeHardDisk +
                ", Diagonal -> " + monitorDiagonal +
                ", Price -> " + price + " ]";
    }


}
