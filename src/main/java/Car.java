public class Car {

    private String color;
    private String brand;
    private String model;
    private Boolean isOn; // Wrapper x Primitivo
    private Integer velocity;
    private Integer maxVelocity;


    public Car(){
        this.isOn = Boolean.FALSE;
        this.velocity = 0;
        this.maxVelocity = 150;
    }

    public void turnOn(){
        this.isOn = Boolean.TRUE;
    }

    public void turnOff(){
        this.isOn = Boolean.FALSE;
    }

    public void accelerate(Integer velocity){
        if(velocity > 0 & this.isOn){
            if(this.velocity + velocity > this.maxVelocity){
                this.velocity = this.maxVelocity;
            }
            else {
                this.velocity += velocity;
            }
        }
    }

    public void deAccelerate(Integer velocity){
        this.velocity -= velocity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    public Integer getVelocity() {
        return velocity;
    }

    public void setVelocity(Integer velocity) {
        this.velocity = velocity;
    }

    public Integer getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(Integer maxVelocity) {
        this.maxVelocity = maxVelocity;
    }
}
