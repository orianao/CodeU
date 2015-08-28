
public class nthLarge {

	// I think we can insert each unique O(log n)*O(n) value 
	// in a TreeSet, and than search there the nth child in 
	// logarithmic time.
	
	// This is like the k median problem. We should use 
	// partitions like in quicksort. Starting with a pivot
	// we will determine it's place in the array and then 
	// check where should we go next.
	
	// If we have this array: x,x,x,x,x,x,a,y,y,y
	// we found that a is in this position and if we are 
	// looking for a number with a smaller index than a, 
	// then we will search in the left part, else in the 
	// right part.
	
	
	public static void main(String[] args) {
		
	}

}
