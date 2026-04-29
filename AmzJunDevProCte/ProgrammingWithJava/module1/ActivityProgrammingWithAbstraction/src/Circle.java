class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }   

    @Override
    public float calculateArea() {
        float area = (float)Math.PI *this.radius*this.radius;
        return area;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius=" + this.radius );
    }

    @Override
    public float calculatePerimeter(){
        return 2 * (float)Math.PI * radius;
    }
}