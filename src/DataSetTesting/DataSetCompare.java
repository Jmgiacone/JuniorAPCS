package DataSetTesting;

/**
   Computes the average of a set of data values.
*/
public class DataSetCompare 
{
   private Comparable max, min;
   private int count;

   /**
      Constructs an empty data set.
   */
   public DataSetCompare()
   {
      max = null;
      min = null;
      count = 0;
   }

   /**
      Adds a data value to the data set.
      @param x a data value
   */
//   public void add(Comparable c)
//   {
//       c = (String) c;
//       int j = c.length();
//       if (count == 0)
//       {
//         max = c;
//         min = c;
//         count++;
//       }
//       if(c.compareTo(max) > 0)
//       {
//           max = c;
//       }
//       else if(c.compareTo(min) < 0)
//       {
//           min = c;
//       }
//   }

   /**
      Gets the largest of the added data.
      @return the maximum or 0 if no data has been added
   */
//   public int getMax()
//   {
//      max = (String) max;
//      return max.length();
//   }
}
