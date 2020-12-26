using System;

namespace CSharp
{
    public class Basic
    {
        public static int GCD(int a, int b)
        {
            if (a < 0 || b < 0)
            {
                throw new Exception("We don't do that here");
            }

            while (a != b)
                if (a > b)
                    a -= b;
                else
                    b -= a;
            return a;
        }

        public static bool Palindrome(string str)
        {
            var tmp = str.ToLower();
            var c = tmp.ToCharArray();
            tmp = "";
            // String cleaner
            for (var i = 0; i < c.Length; i++)
                if (char.IsLetterOrDigit(c[i]))
                    tmp += c[i];
            var tmp2 = "";
            for (var i = 0; i < tmp.Length; i++) tmp2 += tmp.Substring(tmp.Length - i - 1, 1);
            return string.Equals(tmp, tmp2);
        }

        public static class SF1947
        {
            public static int LeMain(int input)
            {
                input = Div8(input);
                input = Div9(input);
                return input;
            }

            private static int Div8(int a)
            {
                a *= 10;
                for (var i = 0; i < 10; i++)
                {
                    a++;
                    if (a % 8 == 0) break;
                }

                return a;
            }

            private static int Div9(int a)
            {
                var tmp = DigitCount(a);
                for (var i = 0; i < 10; i++)
                {
                    a += (int) Math.Pow(10, tmp) * i;
                    if (a % 9 == 0) break;
                }

                return a;
            }

            private static int DigitCount(int a)
            {
                var dc = 0;
                while (a != 0)
                {
                    a /= 10;
                    dc++;
                }

                return dc;
            }
        }
    }
}