package PracticeForJenkins;

import org.testng.annotations.Test;

public class BuildCreationTest {
	
	@Test(groups = "smoke")
	public void create()
	{
		System.out.println("build creation");
	}
	
	@Test
	public void update()
	{
		System.out.println("Build updated");
	}

}
