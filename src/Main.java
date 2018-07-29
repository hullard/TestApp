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
	abstract void draw();
	
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
	
	void draw()
	{
		System.out.println("Draw Dog.");
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
	
	void draw()
	{
		System.out.println("Draw Snail.");
	}
}

class Student
{
	int rollNumber;
	String name;
	int age;
	
	Student(int rollNumber, String name, int age)
	{
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString()
	{	
		return "[roll_number=" + this.rollNumber + ", name=" + this.name + ", age=" + this.age + "]"; 
	}
}

public class Main
{
	public static void drawAnimals(java.util.ArrayList<? extends Animal> list)
	{
		for (Animal animal : list)
			animal.draw();
	}
	
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
		} catch (CloneNotSupportedException e)
			animal.move();
			
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
		/*
		ArrayList<String> list = new ArrayList<String>();
		list.add("Javi");
		list.add("John");
		list.add("Peter");
		/*
		Iterator<String> itr = list.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/*
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Peter");
		list2.add("Jahnny");
		
		list.removeAll(list2);
		
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, "John", 18));
		list.add(new Student(2, "Javy", 16));
		list.add(new Student(3, "Jahnny", 17));
		
		ArrayList<Student> list2 = new ArrayList<Student>();
		list2.add(new Student(4, "Peter", 22));
		
		list.addAll(list2);
		list.removeAll(list2);
		
		for (Student student : list)
		{
			System.out.println("Roll number: " + student.rollNumber + " Name: " + student.name + " Age: " + student.age);
		}
		*/
		
		/*
		Integer[] intArray = { 10, 20, 30, 40, 50 };  
		Array.print(intArray);
		
		Character[] charArray = {'A', 'N', 'T'};
		Array.print(charArray);
		*/
		
		/*
		
		NodeStack<Student> mystack = new NodeStack<Student>();
		mystack.push(new Student(1, "John", 18));
		mystack.push(new Student(2, "Javy", 22));
		
		System.out.println(mystack.pop().name);
		System.out.println(mystack.pop().name);
		*/
		
		/*
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(new Snail("snail my name"));
		list.add(new Dog("dog my name"));
		
		drawAnimals(list);
		*/
		
		/*
		NodeStack<Student> stack = new NodeStack<Student>();
		stack.push(new Student(1, "John", 11));
		
		NodeStack<Student> stackCloned = stack;
		stackCloned.pop();
		*/
		
		/*
		mymath.LinkedList<Student> list = new mymath.LinkedList<Student>();
		list.append(new Student(1, "John", 11));
		System.out.println(list.getItem(0).name);
		*/
		
		mymath.ArrayList<Student> list = new mymath.ArrayList<Student>();
		list.append(new Student(1, "John", 11));
		System.out.println(list.getItem(0).toString());
	}
}	