package junitframework;


import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class SuiteEecutionWay2TestRunner {

	@Test
	public void tc() {
		Result r = JUnitCore.runClasses(TestSample.class,SampleOne.class,Junit.class);
		
		System.out.println("Total run time"+r.getRunTime());
		System.out.println("Test case run count"+r.getRunCount());
		System.out.println("Test case failed count"+r.getFailureCount());
		System.out.println("Test case ignored count"+r.getIgnoreCount());
		
		List<Failure>fail = r.getFailures();
		for (Failure f:fail) {
	System.out.println(f);		
			
	}
	}
	
	
	
}
