package aa;
import java.io.IOException;

import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class CheckSize extends UiAutomatorTestCase{
	String size;
	long starttime;
	long endtime;
	
	public void testDemo() throws UiObjectNotFoundException, IOException{
		
			//����ȫʱ APPi
//			sleep(2000);
//			getUiDevice().swipe(100, 1178, 700, 1178, 50);
//			sleep(5000);
//			Runtime.getRuntime().exec("am start -S -n com.gnet.onemeeting/.LaunchActivity");
			Runtime.getRuntime().exec("am start -S com.gnet.onemeeting/com.gnet.onemeeting.LaunchActivity");
			//com.gnet.onemeeting/.login.LoginActivity
//			sleep(5000);
//			//���ò��Ի���
//			UiObject logoObject= new UiObject(new UiSelector().resourceId("com.gnet.onemeeting:id/iv_default_logo"));
//			logoObject.click();
//			UiObject selectEnvObject= new UiObject(new UiSelector().className("android.widget.RadioButton").index(0));
//			selectEnvObject.click();
//			UiObject saveBtnObject=new UiObject(new UiSelector().className("android.widget.Button").text("ȷ��"));
//			saveBtnObject.click();
//			getUiDevice().sleep();
//			//�����û�������
//			UiObject unameObject=new UiObject(new UiSelector().resourceId("com.gnet.onemeeting:id/et_useraccount"));
//			unameObject.clearTextField();
//			unameObject.click();
//			unameObject.setText("zhenzhen.zong@quanshi.cn");
//			
//			
//			UiObject pwdObject=new UiObject(new UiSelector().resourceId("com.gnet.onemeeting:id/et_password"));
//			pwdObject.click();
//			pwdObject.clearTextField();
//			pwdObject.setText("q111111");
//			UiObject loginObject=new UiObject(new UiSelector().text("��¼"));
//			loginObject.click();
//			
//			
//			
//			
//			getUiDevice().pressHome();
			
			//System.out.println();
		
	
	}
	public void sleep(int times){
		try {
			Thread.sleep(times);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
