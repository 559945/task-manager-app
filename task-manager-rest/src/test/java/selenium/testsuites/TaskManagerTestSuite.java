package selenium.testsuites;

import selenium.StepDefinitions;

public class TaskManagerTestSuite {
	
	public static void main(String[] args) {
		
		TaskManagerTestSuite ts =new TaskManagerTestSuite();
		ts.loadApplication();
		
	}
	
	public void loadApplication() {
		StepDefinitions sd = new StepDefinitions();
		sd.before();
	}

}
