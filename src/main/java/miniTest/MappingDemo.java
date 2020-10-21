package miniTest;


import java.util.List;

public class MappingDemo {
	
	private static List result; 
	
	public List mapping(Integer[] args,String type) {
		
		Context context = null;
		if("single".equals(type)) {
			// a method to convert the digits from 0 to 9 into letters
			context = new Context(new SingleLetterMapping());
		}else {
			//a method need to support converting the digits from 0 to 99(or more then 99) into letters
			context = new Context(new DoubleLetterMapping());
			
		}
		result = context.letterMapping(args);
		return result;
	}
	
	public List getResult(){
        return result;
    }
	
	
}
