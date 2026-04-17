package org.derryfield.math;
public class Algebra {
    public static double harmonicMean(double x, double y) {
        if (x <= 0 || y <= 0 || x + y == 0) {
            throw new IllegalArgumentException("Error: Both x and y values must be positive");
        }
        return (2 * x * y) / (x + y);
    }
}