using System;

namespace CSharp
{
    public static class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Hello World Main");
			Console.WriteLine(Basic.GCD(56, 7));
			Console.WriteLine(Basic.SF1947.LeMain(679));
            Console.WriteLine(Basic.Palindrome("dogma i am god"));
            School a = new Student("John",15,"SF","High");
            Console.WriteLine(a.ToString());
            Test();
        }

        public static void Test()
		{
            Console.WriteLine("Hello");
		}
    }
}