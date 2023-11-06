package model;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void startOffTest(){
        // #1 Should start turned off
        Car car1 = new Car();
        Assert.assertFalse(car1.getOn());
    }

    @Test
    public void startWithZeroVelocity(){
        // #2 - Start with zero velocity
        Car car = new Car();
        Assert.assertEquals((Integer) 0, car.getVelocity());
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
        Assert.assertFalse(car.getOn());
    }

    @Test
    public void accelerateCorrectlyWhenTurnedOn(){
        // #5 - Accelerate correctly a car that is on
        Car car = new Car();
        car.turnOn();
        car.accelerate(60);
        Assert.assertEquals((Integer) 60, car.getVelocity());
    }

    @Test
    public void noNegativeVelocity(){
        // #6 - No negative acceleration
        Car car = new Car();
        car.turnOn();
        car.accelerate(-60);
        Assert.assertEquals((Integer) 0, car.getVelocity());
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
