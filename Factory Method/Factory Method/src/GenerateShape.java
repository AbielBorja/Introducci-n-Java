import java.io.*;
public class GenerateShape {
    public static void main(String args[])throws IOException{
        ShapesFactory shapeFactory = new ShapesFactory();

        System.out.print("Enter the name of Shape: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String shapeName=br.readLine();
        System.out.print("Enter the number of units for base in your shape: ");
        double base=Double.parseDouble(br.readLine());

        System.out.print("Enter the number of units for height in your shape: ");
        double height=Double.parseDouble(br.readLine());

        System.out.print("Enter the color of your shape: ");
        String color=br.readLine();

        shapes s = shapeFactory.getShape(shapeName);

        System.out.print("Bill amount for "+shapeName+" with base of " + base + " With height "+ height + " and color: " + color);
        s.setBase(base);
        s.setHeight(height);
        s.setColor(color);
        if (shapeName == "Square" || shapeName == "Rectangle"){
            s.printAreaRectangular();
        }
        else if (shapeName == "Triangle") {
            s.printAreaTriangular();
        }
        else {
            System.out.print("NO AGARRE NADA Xd");
        }
    }
}//end of GenerateBill class.

