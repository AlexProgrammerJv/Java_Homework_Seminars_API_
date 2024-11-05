package Homework_Sem6;

import java.util.ArrayList;
import java.util.List;

public abstract class ElectronicsStore {

    protected String creator;
    protected int volumeRAM;
    protected double monitorDiagonal;
    protected double price;

    //  Конструктор родительского класса класса
    public ElectronicsStore(String creator, int volumeRAM, double monitorDiagonal, double price) {
        this.creator = creator;
        this.volumeRAM = volumeRAM;
        this.monitorDiagonal = monitorDiagonal;
        this.price = price;
    }

    //  Изменение цены на товар
    public void setPrice(double price) {
        this.price = price;
    }

    //  Возвращает тип объекта
    public String getElectronicsStoreType() {
        return getClass().getSimpleName();
    }

    //  Получение строки из объектов и параметров
    public String toStringStore() {
        return getElectronicsStoreType() +
                " [" + " Creator  -> " + creator +
                ", RAM -> " + volumeRAM +
                ", Diagonal -> " + monitorDiagonal +
                ", Price -> " + price + " ]";
    }
}
