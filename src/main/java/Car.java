/*
A class named Car that implements Tradable and Drivable interfaces.
 */

public class Car implements Tradable, Drivable {
    private int maxSpeed;

    public Car(){
        this.maxSpeed = 100;
    }

    @Override
    public int getPrice() {
        return 3000;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 20;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed = this.maxSpeed - 20;

    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}
