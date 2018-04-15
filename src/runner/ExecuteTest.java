package runner;

import org.testng.annotations.Test;

import script.Search;

public class ExecuteTest {
	@Test
	public void execute() {
		Search s = new Search();
		s.search();
	}

}
