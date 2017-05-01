/* x,y,name are instance variables and have not been initialized so default output will be printed */

package Assignment3;

class Example {
	 int x; 
	 int y;
	 String name;
	 public static void main(String args[]) {
	 Example pnt = new Example();
	 System.out.println ("pnt is " + pnt.name + " " + pnt.x + " " + pnt.y);
	} 
}


//Answer d. The program prints pnt is null 0 0.