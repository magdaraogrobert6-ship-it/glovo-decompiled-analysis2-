package com.google.firebase.messaging;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.LazyKt__LazyJVMKt;
import o.ParentDataModifierDefaultImpls;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.accessaddExtraDataToAccessibilityNodeInfoHelper;
import o.accessfindNextNonChildView;
import o.accessgetPreviousMotionEventp;
import o.accessgetTvInputHdmi1cp;
import o.setSupportButtonTintList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class EnhancedIntentService extends Service {
    private Binder IconCompatParcelizer;
    final ExecutorService ResultReceiver;
    private final Object read;
    private int serializer;
    private int write;

    public abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }

    public final void finishTask(Intent intent) {
        if (intent != null) {
            accessfindNextNonChildView.RemoteActionCompatParcelizer(intent);
        }
        synchronized (this.read) {
            int i = this.write - 1;
            this.write = i;
            if (i == 0) {
                stopSelfResultHook(this.serializer);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.ResultReceiver.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        zzw zzwVarRemoteActionCompatParcelizer;
        synchronized (this.read) {
            this.serializer = i2;
            i3 = 1;
            this.write++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        if (handleIntentOnMainThread(startCommandIntent)) {
            zzwVarRemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        } else {
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
            this.ResultReceiver.execute(new WorkerKt$$ExternalSyntheticLambda2(this, startCommandIntent, parentDataModifierDefaultImpls, 26));
            zzwVarRemoteActionCompatParcelizer = parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
        }
        if (zzwVarRemoteActionCompatParcelizer.isComplete()) {
            finishTask(intent);
            return 2;
        }
        zzwVarRemoteActionCompatParcelizer.addOnCompleteListener(new setSupportButtonTintList(1), new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, i3, intent));
        return 3;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Binder binder;
        synchronized (this) {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = new accessaddExtraDataToAccessibilityNodeInfoHelper(new PinnableContainerKtLocalPinnableContainer1(27, this));
            }
            binder = this.IconCompatParcelizer;
        }
        return binder;
    }

    public EnhancedIntentService() {
        accessgetTvInputHdmi1cp accessgettvinputhdmi1cp = new accessgetTvInputHdmi1cp("Firebase-Messaging-Intent-Handle");
        accessgetPreviousMotionEventp accessgetpreviousmotioneventp = accessgetPreviousMotionEventp.LOW_POWER;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), accessgettvinputhdmi1cp);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.ResultReceiver = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.read = new Object();
        this.write = 0;
    }

    public static Task access$000(EnhancedIntentService enhancedIntentService, Intent intent) {
        if (enhancedIntentService.handleIntentOnMainThread(intent)) {
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        }
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        enhancedIntentService.ResultReceiver.execute(new WorkerKt$$ExternalSyntheticLambda2(enhancedIntentService, intent, parentDataModifierDefaultImpls, 26));
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
