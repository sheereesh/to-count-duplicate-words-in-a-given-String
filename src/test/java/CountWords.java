
public class CountWords {

	public static void main(String[] args) {
		 String str="krishna 214 mohan 214 krishna mohan sheereesh bobby sheereesh";
	String[]	words= str.split(" ");
 
	System.out.println(words.length);
	for(int i=0;i<words.length;i++) {
		for(int j=i+1;j<words.length;j++) {
			
		
		 if(words[i].equals(words[j])) {
			System.out.println(words[i]); 
		 }
		}
	}

	}
 
 
	
}