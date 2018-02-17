//packages do two things (1) organize code (2)
//prevent conflicts between class names
//create or ID the package when you create a new class
//you did it here, creating package Ocean and class Fish

//in order to use the package, you need to import it.
//this next line IDs the package and the class:
import Ocean.Fish;
import Ocean.Plants.Seaweed;

//another option: import Ocean.* imports all of Ocean's classes
//another shortcut: rightclick whitespace and
//source -- organize imports


public class Application {

	public static void main(String[] args) {
		
		Fish fish1 = new Fish();
		Seaweed weed1 = new Seaweed();
		//trick: after typing that last line,
		//you hovered on Seaweed, and the popup box
		//let you add the import statement.
	}
}

//you can have packages within packages.
//to make a subpackage: (1) create new class
//(2) type package as (eg) Ocean.Plants, and name the class too.
//check out the Algae class for the example
//also check the Windows folders. Plants is inside Ocean.

//you can also drag and drop a class into a package
//eclipse is smart enough to update the statements for you

//shoot NOW he tells us that packages should be named lower case.
