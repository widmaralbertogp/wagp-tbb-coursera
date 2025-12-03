class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        float area = this.width * this.height;
        return area;
    }
    
    @Override
    public void draw() {  
        System.out.println("Drawing Rectangle with width=" + this.width + " height=" + this.height);
    }
    
    @Override
    public float calculatePerimeter() {
        return width + width + height + height;
    }
}