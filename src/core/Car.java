package core;

public class Car {
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;


    public Car(String number,int height,double weight,boolean hasVehicle,boolean isSpecial){
        this.number = number;
        this.height = height;
        this.weight = weight;
        this.hasVehicle = hasVehicle;
        this.isSpecial = isSpecial;
    }

    public String toString() {
        String weightFormat = String.format("%.2f",weight);
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
                special + "Автомобиль с номером " + number +
                ":\n\tВысота: " + height + " мм\n\tМасса: " + weightFormat + " кг";
    }
}