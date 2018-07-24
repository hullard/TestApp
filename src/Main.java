//import mypack.*;
import mymath.*;
import java.util.*;

interface Printable
{
	void print();
}

class A implements Printable
{
	public void print()
	{
		System.out.println("It is A class.");
	}
}

class B implements Printable
{
	public void print()
	{
		System.out.println("It is B class.");
	}
}

abstract class Animal implements Cloneable
{
	private static int idGenerator = 0;
	
	public int id;
	public String name;
	
	Animal(String name) 
	{
		this.name = name;
		this.id = idGenerator++;
	}
	
	abstract void sound();
	abstract void move();
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class Dog extends Animal
{
	Dog(String name) {super(name); }
	
	void sound()
	{
		System.out.println("...is barking.");
	}
	
	void move()
	{
		System.out.println("...is running.");
	}
	
	class Behaviour
	{
		int timing;
		private Behaviour(int timing)
		{
			this.timing = timing;
		}
	}
	
	Behaviour beh = new Behaviour(10);
}

class Snail extends Animal
{
	Snail(String name) {super(name); }
	
	void sound()
	{
		System.out.println("...is silent.");
	}

	void move()
	{
		System.out.println("...is sliding.");
	}
}

public class Main
{
	public static void main(String[] args)
	{	
		/*
		Animal animalOrig = new Dog("Jerry");
		try
		{
			Animal animal = (Animal)animalOrig.clone();
			System.out.println(animal.name);
			System.out.println(animal.id);
			animal.sound();
			animal.move();
			
		} catch (CloneNotSupportedException e)
		{
			System.out.println(e);
		}
		
		Printable pa = new A();
		pa.print();
		
		Printable pb = new B();
		pb.print();
		
		mypack.B obj = new mypack.B();
		obj.print();
		
		
		double[] numbers = {4.0, 1.2, 5.6, 3.3, 7.1};
		Array.print(numbers);
		Sort.bubble(numbers);
		Array.print(numbers);
		
		double[] numbers2 = {1.0, 0.2, 2.6, 6.3, 1.1};
		Array.print(numbers2);
		Sort.selection(numbers2);
		Array.print(numbers2);
		*/
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Javi");
		list.add("John");
		list.add("Peter");
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}	