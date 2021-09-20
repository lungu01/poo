/*
 * _Advanced Level_ (mark 7 || 8):
    - Implement a program where you should create and and modify the following objects: `university` and `student`. You should be able to create students that have name, age and mark (from their courses) and also to create universities which have name, foundationYear and a list of students created earlier.
    
  - _Advanced Level_ (mark 9 || 10):
    - In main program you should be able to create 3 universities with some students in it and calculate the average media between them and print the result in console.
*/
using System;
using System.Collections.Generic;

namespace Lab 2
{
    class Program
    {
        public static void Media(Universitate uni)
        {
            float sum = 0;
            int count = 0;
            float media;

            count = uni.Students.Count;
            foreach (var st in uni.Students)
            {
                sum += st.Mark;
            }
            media = sum / count;

            Console.WriteLine($"Media pentru persoana  {univ.Name} este {media}");
        }
        static void Main(string[] args)
        {
            Universitate USM = new Universitate()
            {
                Name = "USM",
                FoundationYear = 1946,
                Students = new List<Student> 
                {
                    new Student()
                    {
                        Name="Vlada",
                        Age = 20,
                        Mark = 9,
                    },

                    new Student()
                    {
                        Name = "Ionela",
                        Age  = 20,
                        Mark = 10
                    },
                },
            };

            Universitate UAIC = new Universitate()
            {
                Name = "UAIC",
                FoundationYear = 1978,
                Students = new List<Student>
                {
                    new Student()
                    {
                        Name="Vadim",
                        Age = 22,
                        Mark = 9,
                    },

                    new Student()
                    {
                        Name = "Igor",
                        Age  = 21,
                        Mark = 7
                    },
                },
            };

            Universitate UTM = new Universitate()
            {
                Name = "UTM",
                FoundationYear = 1970,
                Students = new List<Student>
                {
                    new Student()
                    {
                        Name="Olga",
                        Age = 20,
                        Mark = 9,
                    },

                    new Student()
                    {
                        Name = "Mihai",
                        Age  = 21,
                        Mark = 5
                    },
                },
            };
            Media(USM);
            Media(UAIC);
            Media(UTM);
        }

    } 
}
