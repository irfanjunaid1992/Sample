package SampleMaven.SampleMaven;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class Extra {
	
	
	
	
	@AfterGroups(alwaysRun=true)
	public void beforeMethod(Method m){
		
		System.out.println(this.getClass().getSimpleName());
		
		
		
//		Test testClass = (Test) c.getAnnotation(Test.class);
//        Test testClass = method.getAnnotation(Test.class);
//        System.out.println(testClass.groups()[0]);
        
        
	}
}
