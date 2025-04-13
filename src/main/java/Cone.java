/**
 * The {@code Cone} class represents a cone shape with a specified radius and height.
 * It extends the {@code Shape} class and provides methods to calculate the surface area
 * and volume of the cone.
 */
public class Cone extends Shape {
    private double radius;
    private double height;

    /**
     * Constructs a {@code Cone} object with the specified radius and height.
     *
     * @param radius the radius of the cone's base
     * @param height the height of the cone
     */
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Calculates the surface area of the cone.
     * The surface area of a cone is given by the formula:
     * {@code π * radius * (radius + slantHeight)}, where slantHeight is the distance
     * from the base to the apex of the cone.
     *
     * @return the surface area of the cone
     */
    @Override
    public double surfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    /**
     * Calculates the volume of the cone.
     * The volume of a cone is given by the formula:
     * {@code (1/3) * π * radius^2 * height}.
     *
     * @return the volume of the cone
     */
    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }

    /**
     * Returns a string representation of the cone object, including its radius, height,
     * surface area, and volume.
     *
     * @return a string representation of the cone
     */
    @Override
    public String toString() {
        return "Cone Shape\nRadius: " + radius + " and Height: " + height +
                ",\nSurface Area: " + surfaceArea() +
                ",\nVolume: " + volume() + ",";
    }
}
