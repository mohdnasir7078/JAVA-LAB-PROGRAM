/*Define a class WordExample having the following description:
Data members/instance variables: private String strdata to store 
a sentence. Parameterized Constructor WordExample(String): Accept 
a sentence which may be terminated by either.', ? 'or '"' only. The 
words may be separated by more than one blank space and are in UPPER CASE.
Member Methods:
void countWord(): Find the number of words beginning and ending with a vowel.
void placeWord(): Place the words which begin and end with a vowel at the 
beginning,followed by the remaining words as they occur in the sentence*/
import java.util.*;
public class WordExample11{
	private String strdata;
	
	WordExample11(String x){
		x=x.trim().toUpperCase();
		int len=x.length();
		char last=x.charAt(len-1);
		if(last!='!'&&last!='.'&&last!='?'){
			System.out.print("Invalid Input.");
			return;
		}
			strdata=x;
	}
	
	public static boolean isVowel(char ch){
		 ch = Character.toUpperCase(ch);
        boolean ret = false;
        if (ch == 'A'
            || ch == 'E'
            || ch == 'I'
            || ch == 'O'
            || ch == 'U')
            ret = true;
            
        return ret;
	}
		
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String x = sc.nextLine();
		WordExample11 o1=new WordExample11(x);
		StringTokenizer st= new StringTokenizer(x);
		StringBuffer vowel= new StringBuffer();
		StringBuffer cons= new StringBuffer();
		int c=0;
		while(st.hasMoreTokens()){
			String word=st.nextToken();
			int len=word.length();
			if(isVowel(word.charAt(0))&&isVowel(word.charAt(len-1))){
				vowel.append(word);
				vowel.append(" ");
				c++;
			}
			else{
				cons.append(word);
				cons.append(" ");
			}
		}
		String newStr =vowel.toString()+cons.toString();
		System.out.println("Number of words beginning and ending with vowels are:"+c);
		System.out.println	("New string is:"+newStr);
	}
}