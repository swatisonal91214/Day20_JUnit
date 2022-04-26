package com.bl.paramjunittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationParamterizedTest {
	
	private String actualResult;
	private String expectedResult;
	private UserRegImplemtation userinput;
	
	public UserRegistrationParamterizedTest(String actualResult, String expectedResult) {
		this.actualResult = actualResult;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void init() {
		userinput = new UserRegImplemtation();
	}
	
	@Parameterized.Parameters
	public static Collection emailParamImput() {
		return Arrays.asList(new Object[][] { {"swati@gmail.com", "Valid"}, {"abc.co.in.gh", "Invalid"} });
	}
	
	@Test
	public void testEmail() {
		assertEquals(expectedResult, userinput.valdateEmail(actualResult));
	}
	
	

}
