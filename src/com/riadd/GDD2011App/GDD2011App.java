package com.riadd.GDD2011App;

import com.google.android.apps.gddquiz.IQuizService;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public class GDD2011App extends Activity {

	private static final String TAG = "Android";

    private IQuizService quizService;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
        Intent intent = new Intent("com.google.android.apps.gddquiz.IQuizService");
        bindService(
                intent,
                serviceConnection,
                BIND_AUTO_CREATE
        );
	}

	@Override
	public void onResume(){
		super.onResume();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		unbindService(serviceConnection);
	}
	
	private ServiceConnection serviceConnection = new ServiceConnection(){
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            //サービス取得
        	quizService = IQuizService.Stub.asInterface(service);
        	
        	String code = "";
            try{
            	code = quizService.getCode();
            }catch(Exception e){
            	Log.e(TAG, "e:"+e.toString());
            }
    		Log.i(TAG, "code:"+code);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
        	quizService = null;
        }
    };
}
