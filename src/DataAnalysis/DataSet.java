package DataAnalysis;

/**
   Computes information about a set of data values.
*/
public class DataSet
{
   private double sum, maximum, minimum;
   private int count;

   /**
      Constructs an empty data set.
   */
   public DataSet()
   {
      sum = 0;
      count = 0;
      maximum = 0;
      minimum = 99999999999999999999.0;
   }

   /**
      Adds a data value to the data set
      @param x a data value
   */
   public void add(double x)
   {
      sum = sum + x;
      if (count == 0 || maximum < x) 
      {maximum = x;}
      if(count == 0 || minimum > x)
      {minimum = x;}
      count++;
   }

   /**
      Gets the average of the added data.
      @return the average or 0 if no data has been added
   */
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum / count;
   }

   /**
      Gets the largest of the added data.
      @return the maximum or 0 if no data has been added
   */
   public double getMaximum()
   {
      return maximum;
   }

   /**
      Gets the smallest of the added data.
      @return the minimun or 99999999999999999999.0 if no data has been added
    */
   public double getMin()
   {
       return minimum;
   }
}
