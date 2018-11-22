public class ShapeFactory extends AbstractFactory
{
   @Override
   public Shape getShape(String shapeType)
   {   
      if(shapeType == null)
      {
	     return null;
	  }
	  if(shapeType.equalsIgnoreCase("Cerchio"))
	  {
		  return new Cerchio();
	         
	  }
	  else if(shapeType.equalsIgnoreCase("Rettangolo"))
	  {
	      return new Rettangolo();
      }
      return null;
   }

   @Override
   public Color getColor(String colorType)
   {
	   return null;
   }
}