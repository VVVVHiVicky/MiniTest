package miniTest;

import java.util.List;

public class Context {
	
	private LetterMapping letterMapping;
	
	public Context(LetterMapping letterMapping){
	      this.letterMapping = letterMapping;
	   }
	 
	   public List letterMapping(Integer[] numbers){
	      return letterMapping.letterMapping(numbers);
	   }

}
