package listenersdemo1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import Utils.Commonutils;
import tests.Basetest;




	public class ListenersSSF  implements ITestListener {


		@Override
		public void onTestStart(ITestResult result) {

			System.out.println(result.getName()+" Started");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			//System.out.println(result.getName()+"Test Failed"); 
		
				
				Basetest.test.get().addScreenCaptureFromPath(Commonutils.captureScreenshot(Basetest.getBrowser()));
			Basetest.test.get().log(Status.FAIL, result.getName()+" FAILED");
		
		}


	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+" Finished");
		}
	
		@Override
		public void onTestSuccess(ITestResult result) {
			//System.out.println(result.getName()+"Passesd");
		Basetest.test.get().log(Status.PASS, result.getName()+" PASSED");

		}
}



