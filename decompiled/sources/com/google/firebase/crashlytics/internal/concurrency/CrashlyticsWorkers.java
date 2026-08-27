package com.google.firebase.crashlytics.internal.concurrency;

import android.util.Log;
import androidx.room.RoomDatabase$closeBarrier$1;
import com.mapbox.navigation.core.MapboxNavigation;
import java.util.concurrent.ExecutorService;
import kotlin.LazyKt__LazyJVMKt;
import o.getLayingOutChildren;
import o.trackLookaheadMeasurementByParent;

/* JADX INFO: loaded from: classes2.dex */
public final class CrashlyticsWorkers {
    public static final getLayingOutChildren RemoteActionCompatParcelizer = new getLayingOutChildren();
    public final trackLookaheadMeasurementByParent IconCompatParcelizer;
    public final trackLookaheadMeasurementByParent read;
    public final trackLookaheadMeasurementByParent write;

    public static final void read() {
        if (((Boolean) new MapboxNavigation.AnonymousClass15().invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public CrashlyticsWorkers(ExecutorService executorService, ExecutorService executorService2) {
        executorService.getClass();
        executorService2.getClass();
        this.read = new trackLookaheadMeasurementByParent(executorService);
        this.write = new trackLookaheadMeasurementByParent(executorService);
        LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        this.IconCompatParcelizer = new trackLookaheadMeasurementByParent(executorService2);
    }

    public static final void checkBackgroundThread() {
        if (((Boolean) new RoomDatabase$closeBarrier$1(0, RemoteActionCompatParcelizer, getLayingOutChildren.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 2).invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
        Log.isLoggable("FirebaseCrashlytics", 3);
    }
}
