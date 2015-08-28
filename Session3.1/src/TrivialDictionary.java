
public class TrivialDictionary {

	// we can store an array with all the words, and while we
	// use the isInDictionary() function we can create a 
	// hash table in which we will store the hashCode and a 
	// reference to the value in the array.
	// The wordAt() function will return the value from the 
	// array.
	
	public bool isInDictionary(String word){
		int hashValue;
		hashValue=hashFunction(word);
		if(hashTable.containsValue(hashValue)){
			return true;
		}
		else{
			if(dictionaryArray){
				hashTable.put(hashValue, word);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
	}

}
