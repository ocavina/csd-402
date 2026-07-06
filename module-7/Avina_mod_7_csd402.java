// Oscar Avina
// 07/5/2026
// Module 7.2 Assignment
// This program demonstrates a Fan class with a collection of Fan instances and methods to display their properties

class Fan {
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
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // this constructor allows the user to set the fan's speed, on/off state, radius, and color
    public Fan(int newSpeed, boolean fanOn, double fanRadius, String fanColor) {
        this.speed = newSpeed;
        this.on = fanOn;
        this.radius = fanRadius;
        this.color = fanColor;
    }
    // the following are getter and setter methods for each of the fan's fields
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean fanOn) {
        this.on = fanOn;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double fanRadius) {
        this.radius = fanRadius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String fanColor) {
        this.color = fanColor;
    }

    // this method returns a string representation of the fan's current state
    public String toString() {
        return "Speed: " + this.speed + "\n" +
               "On: " + this.on + "\n" +
               "Radius: " + this.radius + "\n" +
               "Color: " + this.color;
    }
}

public class Avina_mod_7_csd402 {
    // main method to test the Fan class and display methods
    public static void main(String[] args) {
        // creates a collection of Fan instances
        Fan[] fans = new Fan[3];

        fans[0] = new Fan();
        fans[1] = new Fan(Fan.FAST, true, 15, "pink");
        fans[2] = new Fan();

        // using the setter methods to change the third fan's properties
        fans[2].setSpeed(Fan.SLOW);
        fans[2].setOn(true);
        fans[2].setRadius(7);
        fans[2].setColor("green");

        displayFans(fans);
    }

    // this method displays all Fan instances in the collection
    public static void displayFans(Fan[] fans) {
        for (int i = 0; i < fans.length; i++) {
            System.out.println("Fan " + (i + 1));
            displayFan(fans[i]);
            System.out.println();
        }
    }

    // this method displays one Fan instance
    public static void displayFan(Fan fan) {
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }
}