package web.Models;


import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;
    private int age;
    private int speed;

    public Car() {}

    public Car(String model, int age, int speed) {
        this.model = model;
        this.age = age;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", speed=" + speed +
                '}';
    }
}
