package MavenEx;

import org.junit.jupiter.engine.execution.InvocationInterceptorChain.VoidInterceptorCall;

public class ApplicationTest {
	
	{
		@InjectMocks
		MainClass mainClass;

		@InjectMocks
		DatabaseDAO dependentClassOne;

		@InjectMocks
		NetworkDAO dependentClassTwo;

		@Before
		public Object init() {
			MockitoAnnotations.openMocks(this);
		}
	
		@Test
		public void validateTest()
		{
	                //record expectations with mock methods
	                when(dependentClassOne.save()).thenReturn(true);
	                when(dependentClassTwo.save()).thenReturn(true);
		
			boolean saved = mainClass.save("E://temp.txt");
			assertEquals(true, saved);
		}
	                //verify recorded expectations
		
	}

}
