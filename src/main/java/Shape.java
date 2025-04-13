/**
 * The {@code Shape} class is an abstract class that represents a geometric shape.
 * It provides the foundational methods for calculating the surface area and volume of any shape.
 * Concrete subclasses must implement these methods to provide specific calculations for different shapes.
 */
public abstract class Shape {

    /**
     * Calculates the surface area of the shape.
     * This method must be implemented by concrete subclasses to provide the appropriate formula
     * for calculating the surface area of the specific shape.
     *
     * @return the surface area of the shape
     */
    public abstract double surfaceArea();

    /**
     * Calculates the volume of the shape.
     * This method must be implemented by concrete subclasses to provide the appropriate formula
     * for calculating the volume of the specific shape.
     *
     * @return the volume of the shape
     */
    public abstract double volume();
}
