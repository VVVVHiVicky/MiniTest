package miniTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Test;

public class MappingTest {
	
	private static MappingDemo mappingDemo = new MappingDemo();
	
	
	
	@Test
    public void singleMapping() {
		
		mappingDemo.mapping(new Integer[]{5,6}, "single");
		System.out.println(mappingDemo.getResult());
		assertNotNull(mappingDemo.getResult());
		
		mappingDemo.mapping(new Integer[]{3,1,5}, "single");
		System.out.println(mappingDemo.getResult());
		assertNotNull(mappingDemo.getResult());
		
    }
	
	@Test
    public void DoubleMapping() {
		
		mappingDemo.mapping(new Integer[]{52,6,30}, "double");
		System.out.println(mappingDemo.getResult());
		assertNotNull(mappingDemo.getResult());
		
		mappingDemo.mapping(new Integer[]{24,17,35}, "double");
		System.out.println(mappingDemo.getResult());
		assertNotNull(mappingDemo.getResult());
		
    }

}
