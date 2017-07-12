package SampleMaven.SampleMaven;

import java.lang.annotation.Annotation;

import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

@Test(groups={"Login"})
public class Sample1 extends Extra {
	
	@Test(groups={"Login"})
	public void first()
	{
		System.out.println("First");
	}
	
	@Test(groups={"Login"})
	public void get()
	{
		System.out.println();
	}

}
