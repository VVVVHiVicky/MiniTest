package miniTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;


public class ExchangeUtil {
	
	private static final Map<Integer,String[]>  numberMap = new HashMap<>();
	
	private List arrayLists;
	
	static {
		numberMap.put(0, null);
		numberMap.put(1, null);
		numberMap.put(2, new String[]{"a","b","c"});
		numberMap.put(3, new String[]{"d","e","f"});
		numberMap.put(4, new String[]{"g","h","i"});
		numberMap.put(5, new String[]{"j","k","l"});
		numberMap.put(6, new String[]{"m","n","o"});
		numberMap.put(7, new String[]{"p","q","r","s"});
		numberMap.put(8, new String[]{"t","u","v"});
		numberMap.put(9, new String[]{"w","x","y","z"});
	}
	
	public static Map<Integer,String[]> getNumberMap(){
		return Collections.unmodifiableMap(numberMap);
	}
	
	
	public static List combination(List arrayLists){
		
		int len=arrayLists.size();
        //判断数组size是否小于2
        if (len<2){
            arrayLists=arrayLists;
            return arrayLists;
        }
        //第一个数组
        int len0;
        if (arrayLists.get(0) instanceof String[]){
            String[] arr0= (String[]) arrayLists.get(0);
            len0=arr0.length;
        }else {
            len0=((ArrayList<String>)arrayLists.get(0)).size();
        }

        //第二个数组
        String[] arr1= (String[]) arrayLists.get(1);
        int len1=arr1.length;

        //计算当前两个数组一共能够组成多少个组合
        int lenBoth=len0*len1;

        ArrayList<String> tempArrayLists=new ArrayList<>(lenBoth);

        //第一层for就是循环arrayLists第一个元素的
        for (int i=0;i<len0;i++){
            //第二层for就是循环arrayLists第二个元素的
            for (int j=0;j<len1;j++){ 
                //判断第一个元素如果是数组说明，循环才刚开始
                if (arrayLists.get(0) instanceof String[]){
                    String[] arr0= (String[]) arrayLists.get(0);
                    String str=new String();
                    str = arr0[i]+arr1[j];
                    //加到临时的集合中
                    tempArrayLists.add(str);
                }else {
                	ArrayList<String> arrtemp= (ArrayList<String>) arrayLists.get(0);
                    String str = null;
                    for (int k=0;k<arrtemp.size();k++){
                        str = arrtemp.get(k) + arr1[j];
                    }
                    tempArrayLists.add(str);
                }
            }
        }

        List newArrayLists=new ArrayList<>();
        for (int i=2;i<arrayLists.size();i++){
            newArrayLists.add(arrayLists.get(i));
        }
        newArrayLists.add(0,tempArrayLists);

        return combination(newArrayLists);
    }
	
	
	public static Integer[] StringToInt(String[] ch){

		Integer[] ints = new Integer[ch.length];

	    for(int i=0;i<ch.length;i++){

	        ints[i] = Integer.parseInt(ch[i]);

	    }

	    return ints;

	}
	
	

}
