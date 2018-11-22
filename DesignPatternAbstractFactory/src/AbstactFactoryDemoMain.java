public class AbstactFactoryDemoMain
{
	   public static void main(String[] args)
	   {
		      //get shape factory
		      AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

		      //get an object of Shape Circle
		      Shape shape1 = shapeFactory.getShape("Cerchio");

		      //call draw method of Shape Circle
		      shape1.draw();

		      //get an object of Shape Rectangle
		      Shape shape2 = shapeFactory.getShape("Rettangolo");

		      //call draw method of Shape Rectangle
		      shape2.draw();
		      
		      //get color factory
		      AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

		      //get an object of Color Red
		      Color color1 = colorFactory.getColor("Rosso");

		      //call fill method of Red
		      color1.fill();

		      //get an object of Color Green
		      Color color2 = colorFactory.getColor("Verde");

		      //call fill method of Green
		      color2.fill();

		      //get an object of Color Blue
		      Color color3 = colorFactory.getColor("Blu");

		      //call fill method of Color Blue
		      color3.fill();
		   }
}