using System;
using System.IO;
using System.Linq;
using System.Management.Instrumentation;
using System.Reflection;

namespace AoC2020
{
	public static class MainClass
	{
		public static void Main(string[] args)
		{
			// D1();
			// D2();
			D3();
		}

		static void D1()
		{
			Console.WriteLine("Hello World!");
			Console.WriteLine();
			var a = FileReader(1);
			var data = new int[a.Length];
			for (var i = 0; i < a.Length; i++)
			{
				data[i] = int.Parse(a[i]);
			}

			for (var i = 0; i < data.Length - 1; i++)
			{
				for (var j = i + 1; j < a.Length; j++)
				{
					if (data[i] + data[j] == 2020)
					{
						Console.WriteLine(data[i] + " " + data[j]);
						Console.WriteLine(data[i] * data[j]);
						Console.WriteLine();

					}

					for (var k = j + 1; k < a.Length; k++)
					{
						if (data[i] + data[j] + data[k] != 2020) continue;
						Console.WriteLine(data[i] + " " + data[j] + " " + data[k]);
						Console.WriteLine(data[i] * data[j] * data[k]);
						Console.WriteLine();
					}
				}
			}

			Console.ReadLine();
		}

		static void D2()
		{
			var a = FileReader(2);

			// Password rule
			var b1 = new int[a.Length];
			var b2 = new int[a.Length];
			var b3 = new char[a.Length];
			var b4 = new string[a.Length];
			for (var i = 0; i < a.Length; i++)
			{
				var s = a[i].Split(' ');
				b1[i] = int.Parse(s[0].Split('-')[0]);
				b2[i] = int.Parse(s[0].Split('-')[1]);
				b3[i] = char.Parse(s[1].Split(':')[0]);
				b4[i] = s[2];
			}

			// Part 1
			var validPass1 = 0;
			for (var i = 0; i < a.Length; i++)
			{
				var bb4 = b4[i].Count(x => x == b3[i]);
				if (b1[i] <= bb4 && bb4 <= b2[i])
				{
					validPass1++;
				}
			}

			Console.WriteLine(validPass1);
			// Part 2
			var validPass2 = 0;

			for (var i = 0; i < a.Length; i++)
			{
				try
				{
					var bb1 = b4[i][b1[i]-1];
					var bb2 = b4[i][b2[i]-1];
					if (bb1 == b3[i] ^ bb2 == b3[i])
					{
						validPass2++;
					}
				}
				catch (IndexOutOfRangeException)
				{
					// ignored
				}
			}

			// Console.WriteLine(b1.Length + " " + b2.Length + " " + b3.Length + " " + b4.Length);
			Console.WriteLine(validPass2);
			Console.ReadLine();
		}

		static void D3()
		{
			var a = FileReader(3);
			
			int TreeCounter(string[] array, int right, int down)
			{
				var tree = 0;
				for (var i = 0; i < a.Length; i+=down)
				{
					if (a[i][right*i%a[i].Length].Equals('#'))
					{
						tree++;
					}
				}
				return tree;
			}
			
			Console.WriteLine(TreeCounter(a,3,1));


			var tempout2 = new[] {TreeCounter(a, 1, 1),
				TreeCounter(a, 3, 1),
				TreeCounter(a, 5, 1),
				TreeCounter(a, 7, 1),
				TreeCounter(a, 1, 2)
			};
			
			Console.WriteLine("[" + string.Join(", ", tempout2) + "]");

			var b = tempout2.Aggregate<int, long>(1, (current, i) => current * i);
			Console.WriteLine(b);
		}

		private static string[] FileReader(int dayNo)
		{
			try
			{
				return File.ReadAllLines(Path.GetFullPath(Path.Combine(Directory.GetCurrentDirectory(), "..", "..",
					"input", "input" + dayNo + "." + "txt")));
			}
			catch (FileNotFoundException)
			{
				throw new FileNotFoundException("Fix "+MethodBase.GetCurrentMethod().Name + " method please.");
			}
		}
	}
}
