package model;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void startOffTest(){
        // #1 Should start turned off
        Car car1 = new Car();
        Assert.assertTrue((car1.getOn() == Boolean.FALSE));
    }

    @Test
    public void startWithZeroVelocity(){
        // #2 - Start with zero velocity
        Car car = new Car();
        Assert.assertTrue(car.getVelocity() == 0);
    }

    @Test
    public void startCorrectly(){
        // # 3 Start correctly
        Car car = new Car();
        car.turnOn();
        Assert.assertTrue(car.getOn() == Boolean.TRUE & car.getVelocity() == 0);
    }

    @Test
    public void turnOffCorrectly(){
        // #4 - Turn off correctly when turned on
        Car car = new Car();
        car.turnOn();
        car.turnOff();
        Assert.assertTrue(car.getOn() == Boolean.FALSE);
    }

    @Test
    public void accelerateCorrectlyWhenTurnedOn(){
        // #5 - Accelerate correctly a car that is on
        Car car = new Car();
        car.turnOn();
        car.accelerate(60);
        Assert.assertTrue(car.getVelocity() == 60);
    }

    @Test
    public void noNegativeVelocity(){
        // #6 - No negative acceleration
        Car car = new Car();
        car.turnOn();
        car.accelerate(-60);
        Assert.assertTrue(car.getVelocity() == 0);
    }

    @Test
    public void noMoreThanMaxVelocity(){
        // #7 - No more than max velocity
        Car car = new Car();
        car.turnOn();
        car.accelerate(151);
        Assert.assertTrue(car.getVelocity() <= car.getMaxVelocity());
    }
}
