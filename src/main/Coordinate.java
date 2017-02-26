package main;

/*
    Custom Coordinate class which stores a corresponding X and Y Value.
 */

import java.io.Serializable;

public class Coordinate implements Serializable {
    private static final long serialVersionUID = -5933363260711222652L;
    private double XValue;
    private double YValue;

    // Class Constructor
    public Coordinate(double x_Value, double y_Value) {
        XValue = x_Value;
        YValue = y_Value;
    }

    // Returns a String to describe this Coordinate Object
    @Override
    public String toString() {
        return "Coordinate " + hashCode() + "-> X: " + getXValue() + " Y: " + getYValue();
    }

    // Accessor method for X Value
    public double getXValue() {
        return XValue;
    }

    // Mutator method for X Value
    public void setXValue(double XValue) {
        this.XValue = XValue;
    }

    // Accessor method for Y value
    public double getYValue() {
        return YValue;
    }

    // Mutator method for Y Value
    public void setYValue(double YValue) {
        this.YValue = YValue;
    }

    /*
        Overridden method from Object class which allows one Coordinate to be checked for equality of X and Y values with another.
     */
    @Override
    public boolean equals(Object obj) {
        Coordinate comparison = (Coordinate) obj;
        return (comparison.getXValue() == getXValue()) && (comparison.getYValue() == getYValue());
    }
}
