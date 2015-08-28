import java.util.ArrayList;


public class Majority {
	
	// We sort the array using QuickSort O(n log n) or 
	// RadixSort if k(number of digits) is small enough O(k n)
	// After this we should use BinarySearch O(log  n) to see 
	// if there is a majority. If there is one than that 
	// element will appear on the n/2 position in the sorted 
	// array and we do the same check for the sides.
	// Test: the array has only one element that appears 100% 
	// of the time
	// Test: the array has different values
	
	// 1 [1] {2} (2) 2 [2] 3
	//
	// ()- first check
	// []- second check
	// {}- third check
	
	sort(list);
	
	void hasMajority(ArrayList<Integer> list){
		if (list[list.size()/2]==list[list.size()/4]){
			hasMajority(list.subList(0, list.size()/4));
			count++;
		}
		else{
			hasMajority(list.subList(list.size()/4,list.size()/2));
		}
		if (list[list.size()/2]==list[list.size()/2+list.size()/4]){
			hasMajority(list.subList(list.size()/2+list.size()/4, list.size()));
			count++;
		}
		else{
			hasMajority(list.subList(list.size()/2,list.size()/2+list.size()/4));
		}
		
	}
	public static void main(String[] args) {

	}
}
