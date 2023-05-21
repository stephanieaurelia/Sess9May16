package sess9may16_gslc;

// Interface: Library Item
// The LibraryItem interface defines the behavior that all library items should have, specifically the checkOut() method.
// It serves as a contract that classes implementing the interface must fulfill.

public interface LibraryItem {
	   void checkOut(String borrower); 
}

// Abstract classes are used when you want to provide a common structure and behavior for related classes, 
// while interfaces are used to define contracts that classes must adhere to. 

// Abstract classes can have both implemented and unimplemented methods,
// while interfaces only have method signatures.