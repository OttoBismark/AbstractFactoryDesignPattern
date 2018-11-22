public class ColorFactory extends AbstractFactory
{
   @Override
   public Shape getShape(String shapeType)
   {
	   return null;
   }
   
   @Override
   Color getColor(String color)
   {
	   if(color == null)
	   {
		   return null;
	   }
	   
	   if(color.equalsIgnoreCase("Rosso"))
	   {
		   return new Red();
	   }
	   else if(color.equalsIgnoreCase("Verde"))
	   {
		   return new Green();
	   }
	   else if(color.equalsIgnoreCase("Blu"))
	   {
		   return new Blue();
	   }
	   return null;
   }
}
