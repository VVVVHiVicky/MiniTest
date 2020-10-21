package miniTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DoubleLetterMapping implements LetterMapping{
	
//	2.The program need to support converting the digits from 0 to 99 (or more then 99) into letters
	
	@Override
	public List letterMapping(Integer[] numbers) {
		// TODO Auto-generated method stub
		List arrayList = new ArrayList<>();
		Map<Integer,String[]>  numberMap = ExchangeUtil.getNumberMap();
		for(Integer n:numbers) {
			if(n.SIZE>1) {
				String[] ch = n.toString().split("");
				List l = this.firsMapping(ExchangeUtil.StringToInt(ch));
				if(l.size()>0) {
					arrayList.add(l.get(0));
				}
			}else {
				String[] ll = numberMap.get(n);
				if(ll !=null) {
					arrayList.add(ll);
				}
			}
		}
		if(arrayList.size()==1) {
			return Arrays.asList((String[]) arrayList.get(0));
		}else if(arrayList.size()>1) {
			return ExchangeUtil.combination(arrayList);
		}
		return arrayList;
	}
	
	private List firsMapping(Integer[] numbers) {
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
			return arrayList;
		}else if(arrayList.size()>1) {
			List l = (List) ExchangeUtil.combination(arrayList).get(0);
			arrayList = new ArrayList<>();
			String[] arr0 =  (String[]) l.toArray(new String[l.size()]);
			arrayList.add(arr0);
			return arrayList;
		}
		
		return arrayList;
	}

}
