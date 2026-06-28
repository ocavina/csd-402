// Oscar Avina
// 06/28/2026
// Module 6.2 Assignment
// This program demonstrates a Fan class with two instances of the class, one with default values and one with argument values

public class Avina_mod_6_csd402 {
    // constants for the fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // fan fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // sets the fan to default values
    public Avina_mod_6_csd402() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // this constructor allows the user to set the fan's speed, on/off state, radius, and color
    public Avina_mod_6_csd402(int newSpeed, boolean fanOn, double fanRadius, String fanColor) {
        speed = newSpeed;
        on = fanOn;
        radius = fanRadius;
        color = fanColor;
    }
    // the following are getter and setter methods for each of the fan's fields
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean fanOn) {
        on = fanOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double fanRadius) {
        radius = fanRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String fanColor) {
        color = fanColor;
    }

    // this method returns a string representation of the fan's current state
    public String toString() {
        return "Speed: " + speed + "\n" +
               "On: " + on + "\n" +
               "Radius: " + radius + "\n" +
               "Color: " + color;
    }

    // main method to test the Fan class
    public static void main(String[] args) {
        // creates one fan with default values and one fan with argument values
        Avina_mod_6_csd402 defaultFan = new Avina_mod_6_csd402();
        Avina_mod_6_csd402 customFan = new Avina_mod_6_csd402(FAST, true, 15, "pink");

        System.out.println("Default fan");
        System.out.println(defaultFan.toString());
        System.out.println();

        System.out.println("Custom fan");
        System.out.println(customFan.toString());
        System.out.println();

        // using the setter methods to change the default fan's properties
        defaultFan.setSpeed(SLOW);
        defaultFan.setOn(true);
        defaultFan.setRadius(7);
        defaultFan.setColor("green");

        // using the getter methods to display the updated values
        System.out.println("Default fan after updated values");
        System.out.println("Speed: " + defaultFan.getSpeed());
        System.out.println("On: " + defaultFan.isOn());
        System.out.println("Radius: " + defaultFan.getRadius());
        System.out.println("Color: " + defaultFan.getColor());
    }
}