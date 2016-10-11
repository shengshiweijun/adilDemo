package com.example.aidl_serer;

import java.io.FileDescriptor;
import java.io.PrintWriter;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.os.RemoteException;

public class AIDL_Service extends Service {

	AIDLTest.Stub stub = new AIDLTest.Stub() {
		@Override
		public String hi(String name) throws RemoteException {
			// TODO Auto-generated method stub
			return "response:你给服务器的消息为:" + name;
		}
	};

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		System.out.println("AIDL_Service.onBind()");
		return stub;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		System.out.println("AIDL_Service.onCreate()");
	}

	@Override
	@Deprecated
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		super.onStart(intent, startId);
		System.out.println("AIDL_Service.onStart()");
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		System.out.println("AIDL_Service.onStartCommand()");
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
		System.out.println("AIDL_Service.onConfigurationChanged()");
	}

	@Override
	public void onLowMemory() {
		// TODO Auto-generated method stub
		super.onLowMemory();
		System.out.println("AIDL_Service.onLowMemory()");
	}

	@Override
	public void onRebind(Intent intent) {
		System.out.println("AIDL_Service.onRebind()");
		super.onRebind(intent);

	}

	@Override
	protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AIDL_Service.dump()");
		super.dump(fd, writer, args);
	}

	@Override
	public boolean onUnbind(Intent intent) {
		// TODO Auto-generated method stub
		System.out.println("AIDL_Service.onUnbind()");
		return super.onUnbind(intent);
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		System.out.println("AIDL_Service.onDestroy()");
	}
}
