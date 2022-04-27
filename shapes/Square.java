public class Square extends Shape {
    int sideLength;
    int numSides = 4;

    public Square(int sideLength, String color) {
        super(color);
        this.sideLength = sideLength;
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    // If sideLength is not provided
    public Square() {
        this.sideLength = 1;
    }

    /*
     * TASK 1: Write a method that returns the sideLength of the Square
     * TASK 2: Write a method that sets the sideLength of the Square and returns
     * nothing
     * TASK 3: Write a method that returns an the area of the square as an integer.
     * Call this method getArea.
     */

    // CODE BELOW

}