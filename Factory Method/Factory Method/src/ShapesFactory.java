public class ShapesFactory {
    public shapes getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("Square")){
            return new square();
        }
        else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new rectangle();
        }
        else if (shapeType.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }
        return null;
    }
}
