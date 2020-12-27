using System;

namespace CSharp.MathUtils
{
    public class LinearAlgebraUtils
    {
        public static double[] RowExtractor(double[,] a, int rowNo)
        {
            var c = new double[a.GetLength(0)];
            for (var i = 0; i < c.Length; i++)
            {
                c[i] = a[i, rowNo];
            }
            return c;
        }
    }
}