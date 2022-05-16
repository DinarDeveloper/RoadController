package core;

public class Camera {
    public static Car getNextCar() {
        String randomNumber = Double.toString(Math.random()).substring(2, 5);
        int randomHeight = (int) (1000 + 3500. * Math.random());
        double randomWeight = 600 + 10000 * Math.random();
        boolean randomHasVehicle = Math.random() > 0.5;
        boolean randomIsSpecial = Math.random() < 0.15;

        return new Car(randomNumber,randomHeight,randomWeight,randomHasVehicle,randomIsSpecial);
    }
}