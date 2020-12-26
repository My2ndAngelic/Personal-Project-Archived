using System.Management.Instrumentation;
using System.Runtime.CompilerServices;
using System.Runtime.InteropServices.WindowsRuntime;
using System.Security.Permissions;

namespace CSharp
{
    public class School
    {
        private string Name;
        private int Age;

        public School(string name, int age)
        {
            this.Age = age;
            this.Name = name;
        }

        public string GetName()
        {
            return this.Name;
        }

        public int GetAge()
        {
            return this.Age;
        }
    }

    class Teacher : School
    {
        private string Subject;
        private int Time;

        public Teacher(string name, int age, int time, string subject) : base(name, age)
        {
            Time = time;
            Subject = subject;
        }

        public override string ToString()
        {
            return "Teacher " + base.ToString();
        }
    }

    class Student : School
    {
        private string Level;

        public string GetLevel()
        {
            return this.Level;
        }
        
        private string Rank;
        
        public string GetRank()
        {
            return this.Rank;
        }

        public Student(string name, int age, string level, string rank) : base(name, age)
        {
            this.Level = level;
            this.Rank = rank;
        }
        
        public override string ToString()
        {
            return "Student: " + GetName() + " " + GetAge() + " " + GetLevel() + " " + GetRank();
        }
    }
}