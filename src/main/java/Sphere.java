/**
 * The {@code Sphere} class represents a sphere shape with a specified radius.
 * It extends the {@code Shape} class and provides methods to calculate the surface area
 * and volume of the sphere.
 */
public class Sphere extends Shape {
    private double radius;

    /**
     * Constructs a {@code Sphere} object with the specified radius.
     *
     * @param radius the radius of the sphere
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the surface area of the sphere.
     * The surface area of a sphere is calculated using the formula:
     * {@code 4 * π * radius^2}, which is four times the area of a circle with the given radius.
     *
     * @return the surface area of the sphere
     */
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    /**
     * Calculates the volume of the sphere.
     * The volume of a sphere is calculated using the formula:
     * {@code (4/3) * π * radius^3}, which represents the amount of space enclosed by the sphere.
     *
     * @return the volume of the sphere
     */
    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Returns a string representation of the sphere object, including its radius,
     * surface area, and volume.
     * The format of the string is:
     *
     * {@code "Sphere Shape\nRadius: <radius>, Surface Area: <surfaceArea>, Volume: <volume>"}
     *
     * @return a string representation of the sphere
     */
    @Override
    public String toString() {
        return "Sphere Shape\nRadius: " + radius +
                ",\nSurface Area: " + surfaceArea() +
                ",\nVolume: " + volume() + ",";
    }
}
