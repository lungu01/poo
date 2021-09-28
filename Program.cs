using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab 3
{
    class Program
    {
        public static void Push(int x, Queue obj1)
        {
            obj1.Enqueue(x);
        }

        public static void Pop(Queue obj1)
        {
            obj1.Dequeue();
        }

        static void Main(string[] args)
        {
            Queue<int> obj1 = new Queue<int>();
            Push(10, obj1);
            Push(20 );
            Push(30);
            Push(40);
            Push(50);

            foreach (Object obj in obj1)
            {
                Console.WriteLine(obj);
            }
            Console.WriteLine();

            Pop(obj1);


            foreach (Object obj in obj1)
            {
                Console.WriteLine(obj);
            }
            Console.WriteLine();
            Console.WriteLine("The number of elements in the Queue " + obj1.Count);
            Console.WriteLine("Does the Queue contain? = " + obj1.Contains(3));
            Console.ReadKey();
        }

    }
}
