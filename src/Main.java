import mypack.*;
import mymath.*;

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

abstract class Animal
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
}

class Dog extends Animal
{
	Dog(String name) {super(name); }
	
	void sound()
	{
		System.out.println("...is barkling.");
	}
	
	void move()
	{
		System.out.println("...is running.");
	}
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
		Animal animal = new Dog("Jerry");
		System.out.println(animal.name);
		System.out.println(animal.id);
		animal.sound();
		animal.move();
		
		Printable pa = new A();
		pa.print();
		
		Printable pb = new B();
		pb.print();
		
		mypack.B obj = new mypack.B();
		obj.print();
		*/
		
		double[] numbers = {4.0, 1.2, 5.6, 3.3, 7.1};
		Array.print(numbers);
		
		Sort.bubble(numbers);
		Array.print(numbers);
	}
}