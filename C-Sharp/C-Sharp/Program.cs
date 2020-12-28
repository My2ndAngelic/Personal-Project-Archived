using System;
using System.Text;

namespace CSharp
{
    public static class MainClass
    {
        public static void Main(string[] args)
        {
            /*double[,] c = { { 1, 2 }, { 3, 4 } };
            var stringBuilder = new StringBuilder();
            for (int i = 0; i < c.GetLength(0); i++)
            {
	            stringBuilder.Append("[[");
				for (int j = 0; j < c.GetLength(1); j++)
	            {
		            stringBuilder.Append(c[i, j]);
		            if (j < c.GetLength(1) - 1)
		            {
			            stringBuilder.Append(", ");
		            }
	            }
	            stringBuilder.Append("]");
	            if (i < c.GetLength(0) - 1)
	            {
		            stringBuilder.Append(", ");
	            }
            }
            stringBuilder.Append("]");

            Console.WriteLine(stringBuilder.ToString());
            Console.ReadLine();*/

            double c = 3.9;
            long d = (long) ((c % 1) - c);
            Console.WriteLine(d);
            Console.ReadLine();
        }
    }
}