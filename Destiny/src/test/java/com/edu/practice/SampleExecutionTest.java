package com.edu.practice;

import org.testng.annotations.Test;

public class SampleExecutionTest {
	@Test(groups ="RegressionTest" )
	public void createSample()
	{
		System.out.println("Sample is created successfully");
	}

	@Test(groups = "SmokeTest")
	public void modifySample()
	{
		System.out.println("Sample is modified successfully");
	}

}
