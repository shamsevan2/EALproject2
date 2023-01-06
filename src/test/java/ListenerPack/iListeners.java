package ListenerPack;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import UtilitiesPack.Utilites2;

public class iListeners extends Utilites2 implements ITestListener  {

	@Override
	public void onTestSuccess(ITestResult result) {
		
	this.driver= ((Utilites2)result.getInstance()).driver;	
		
		try {
			Screenshot("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		this.driver= ((Utilites2)result.getInstance()).driver;		
		
		try {
			Screenshot("failedss");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		this.driver= ((Utilites2)result.getInstance()).driver;		
		
	   try {
		Screenshot("skippedss");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	
	
	
	
}
