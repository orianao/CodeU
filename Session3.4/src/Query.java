
public class Query {
	String timestamp;
	String names;

	public String getNextWord(int index){
		int nextSpacePos = names.indexOf(' ', index);
		if(nextSpacePos == -1){
			return names.substring(index);
		}
		else{
			return names.substring(index, nextSpacePos);
		}
	}

	public int getNamesLength() {
		return names.length();
	}
	
}
