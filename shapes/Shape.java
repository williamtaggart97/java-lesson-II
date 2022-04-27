abstract class Shape {
    String color;
  
    public Shape(String color) {
      this.color = color;
    }
    public Shape() {}
    
    public abstract float getArea();
    
    public String getColor() {
      return this.color;
    }
  
    /*
  TASK: Implement updateColor that will allow any class that extends the Shape class to update it's color;
    */
  }