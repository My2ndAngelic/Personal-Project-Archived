using System;

namespace CSharp_DNF
{
    public static class Program
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

            CSharp.DNF.WriteLine(stringBuilder.ToString());
            CSharp.DNF.ReadLine();*/

            var c = 3.9;
            var d = (long) (c % 1 - c);
            Console.WriteLine(d);
            Console.ReadLine();
        }
    }
}