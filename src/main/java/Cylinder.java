/**
 * The {@code Cylinder} class represents a cylinder shape with a specified radius and height.
 * It extends the {@code Shape} class and provides methods to calculate the surface area
 * and volume of the cylinder.
 */
public class Cylinder extends Shape {
    private double radius;
    private double height;

    /**
     * Constructs a {@code Cylinder} object with the specified radius and height.
     *
     * @param radius the radius of the cylinder's base
     * @param height the height of the cylinder
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Calculates the surface area of the cylinder.
     * The surface area of a cylinder is given by the formula:
     * {@code 2 * π * radius * (radius + height)}, which includes the areas of both the
     * circular bases and the lateral surface.
     *
     * @return the surface area of the cylinder
     */
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    /**
     * Calculates the volume of the cylinder.
     * The volume of a cylinder is given by the formula:
     * {@code π * radius^2 * height}.
     *
     * @return the volume of the cylinder
     */
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    /**
     * Returns a string representation of the cylinder object, including its radius, height,
     * surface area, and volume.
     *
     * @return a string representation of the cylinder
     */
    @Override
    public String toString() {
        return "Cylinder Shape\nRadius: " + radius + " and Height: " + height +
                ",\nSurface Area: " + surfaceArea() +
                ",\nVolume: " + volume() + ",";
    }
}
