package miniTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SingleLetterMapping implements LetterMapping{

//	1.Write a program to convert the digits from 0 to 9 into letters
	
	@Override
	public List letterMapping(Integer[] numbers) {
		// TODO Auto-generated method stub
		List arrayList = new ArrayList<>();
		Map<Integer,String[]>  numberMap = ExchangeUtil.getNumberMap();
		for(Integer n:numbers) {
			String[] ll = numberMap.get(n);
			if(ll !=null) {
				arrayList.add(ll);
			}
		}
		
		if(arrayList.size()==1) {
			return Arrays.asList((String[]) arrayList.get(0));
		}else if(arrayList.size()>1) {
			return ExchangeUtil.combination(arrayList);
		}
		
		return arrayList;
	}
	
	
}
