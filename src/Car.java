/**
 * Created by YB on 26.10.2015.
 */
public class Car {

    private String carName;
    private Color color;
    private int doorsCount;
    private int maxSpeed;
    private double engineCC;
    private boolean isCabrio;

    public void move (Car car) {
        System.out.println("Car " + car.carName + " is moving");
    }

    public void stop (Car car) {
        System.out.println("Car " + car.carName + " has stoped");
    }

    public void turn (Car car) {
        System.out.println("Car " + car.carName + " is turning");
    }

    public void printInfo (Car car) {
        System.out.println("Color: " + car.color + ", Max speed: " + car.maxSpeed + ", Cabrio: " + car.isCabrio);
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Color getColor() {
        return color;

    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(double engineCC) {
        this.engineCC = engineCC;
    }

    public boolean isCabrio() {
        return isCabrio;
    }

    public void setCabrio(boolean isCabrio) {
        this.isCabrio = isCabrio;
    }
}
