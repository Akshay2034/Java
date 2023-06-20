// Java program to find the area of
// the square using Method Overloading
// of parameters with different datatype
// of sides



class overloading {

	// Overloaded Area() function to
	// calculate the area of the square
	// It takes one double parameter
	void Area(double side)
	{
		System.out.println("Area of the Square: "
						+ side * side);
	}

	// Overloaded Area() function to
	// calculate the area of the square
	// It takes one float parameter
	void Area(float side)
	{
		System.out.println("Area of the Square: "
						+ side * side);
	}
}

class GFG {

	// Driver code
	public static void main(String[] args)
	{

		// Creating object of square class
		overloading obj = new overloading ();

		// Calling function
		obj.Area(10);
		obj.Area(3.2);
	}
}
