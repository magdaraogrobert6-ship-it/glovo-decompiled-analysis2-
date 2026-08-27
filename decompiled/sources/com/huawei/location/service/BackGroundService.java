package com.huawei.location.service;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.secure.android.common.intent.SafeIntent;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes5.dex */
public class BackGroundService extends Service {
    private static final String TAG = "BackGroundService";

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "BackGroundService onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "BackGroundService onStartCommand");
        if (intent != null) {
            SafeIntent safeIntent = new SafeIntent(intent, 0);
            int intExtra = safeIntent.getIntExtra("notificationId", 0);
            Notification notification = (Notification) safeIntent.getParcelableExtra(RemoteMessageConst.NOTIFICATION);
            if (intExtra != 0 && notification != null) {
                startForeground(intExtra, notification);
            } else {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "notificationId or notification is empty");
            }
        }
        return 0;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
