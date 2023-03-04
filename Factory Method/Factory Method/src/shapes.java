abstract class shapes {
    protected double base;
    protected double height;
    protected String color;
    abstract double setBase(double base);
    abstract double setHeight(double height);
    abstract String setColor(String color);

    public void printAreaRectangular(){
        System.out.println(base*height);
    }
    public void printAreaTriangular(){
        System.out.println((base*height)/2);
    }


}
