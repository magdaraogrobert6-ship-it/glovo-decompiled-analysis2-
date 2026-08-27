package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.FirebaseApp;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.getWindowInfoannotations;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceCacheManager {
    public static DeviceCacheManager IconCompatParcelizer;
    public static final getWindowInfoannotations write = getWindowInfoannotations.write();
    public volatile SharedPreferences RemoteActionCompatParcelizer;
    public final ExecutorService read;

    public final void IconCompatParcelizer(Context context) {
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer == null && context != null) {
                this.read.execute(new ND$$ExternalSyntheticLambda0(this, 20, context));
            }
        }
    }

    public static DeviceCacheManager read() {
        DeviceCacheManager deviceCacheManager;
        synchronized (DeviceCacheManager.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new DeviceCacheManager(Executors.newSingleThreadExecutor());
            }
            deviceCacheManager = IconCompatParcelizer;
        }
        return deviceCacheManager;
    }

    public DeviceCacheManager(ExecutorService executorService) {
        this.read = executorService;
    }

    public static Context serializer() {
        try {
            FirebaseApp.write();
            FirebaseApp firebaseAppWrite = FirebaseApp.write();
            firebaseAppWrite.IconCompatParcelizer();
            return firebaseAppWrite.read;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void IconCompatParcelizer(String str, String str2) {
        if (this.RemoteActionCompatParcelizer == null) {
            IconCompatParcelizer(serializer());
            if (this.RemoteActionCompatParcelizer == null) {
                return;
            }
        }
        SharedPreferences sharedPreferences = this.RemoteActionCompatParcelizer;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public final void write(String str, boolean z) {
        if (this.RemoteActionCompatParcelizer == null) {
            IconCompatParcelizer(serializer());
            if (this.RemoteActionCompatParcelizer == null) {
                return;
            }
        }
        this.RemoteActionCompatParcelizer.edit().putBoolean(str, z).apply();
    }

    public final void read(String str, double d) {
        if (this.RemoteActionCompatParcelizer == null) {
            IconCompatParcelizer(serializer());
            if (this.RemoteActionCompatParcelizer == null) {
                return;
            }
        }
        this.RemoteActionCompatParcelizer.edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
    }

    public final void write(long j, String str) {
        if (this.RemoteActionCompatParcelizer == null) {
            IconCompatParcelizer(serializer());
            if (this.RemoteActionCompatParcelizer == null) {
                return;
            }
        }
        this.RemoteActionCompatParcelizer.edit().putLong(str, j).apply();
    }
}
