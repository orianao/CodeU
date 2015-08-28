import java.util.List;

public class QueryStream {
	List<Query> stream;

	public class iterator {
		Query currentQuery;
		int index;
		int streamIndex;

		iterator() {
			currentQuery = stream.get(0);
			index = 0;
			streamIndex = 0;
		}

		boolean hasNext() {
			if (currentQuery.getNamesLength() > index) {
				return true;
			} 
			else if (currentQuery.getNamesLength() == index) {
				streamIndex++;
				currentQuery = stream.get(streamIndex);
				return true;
			}
			return false;
		}

		String next() {
			String result = currentQuery.getNextWord(index);
			if (index != 0) {
				index = result.length() + 1;
				return result;
			} 
			else {
				index = result.length() + 1;
				return "<NEWQUERY>" + result;// it will return <NEWQUERY> for the first Query too
			}
		}
	}
	
	public static void main (String args[]){
		
	}

}
