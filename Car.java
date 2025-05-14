public class Car {
    private int currentSpeed = 0;
    private String colourCar;
    private double priceCar;

    public Car(String colourCar, double priceCar) {
        this.colourCar = colourCar;
        this.priceCar = priceCar;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getColourCar() {
        return colourCar;
    }

    public double getPriceCar() {
        return priceCar;
    }

    public void speedUp(int speed) {
        this.currentSpeed += speed;
    }

    public void breakSpeed() {
        if (this.currentSpeed > 10) this.currentSpeed -= 10;
        else this.currentSpeed = 0;
    }

}
