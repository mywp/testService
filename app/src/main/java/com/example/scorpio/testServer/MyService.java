package com.example.scorpio.testServer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Scorpio on 16/3/6.
 */
public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    
    //oncreate ondestory onstart onstop onresume onpause
    //服务没有界面

    @Override
    public void onCreate() {
        System.out.println("服务创建了");
        super.onCreate();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        System.out.println("服务接收到了开启指令");
        super.onStart(intent, startId);
    }

    @Override
    public void onDestroy() {
        System.out.println("服务销毁了");
        super.onDestroy();
    }
}
