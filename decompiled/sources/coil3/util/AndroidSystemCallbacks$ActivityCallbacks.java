package coil3.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import coil3.Extras$Key;
import coil3.RealImageLoader;
import o.StrokeCapCompanion;
import o.accessxorjd;
import o.addPathUv8p0NAdefault;
import o.getRadiusui_graphics;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidSystemCallbacks$ActivityCallbacks implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ StrokeCapCompanion read;
    public final double serializer;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        read(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public AndroidSystemCallbacks$ActivityCallbacks(StrokeCapCompanion strokeCapCompanion, RealImageLoader realImageLoader) {
        this.read = strokeCapCompanion;
        addPathUv8p0NAdefault addpathuv8p0nadefault = realImageLoader.write;
        Extras$Key extras$Key = accessxorjd.serializer;
        Object obj = addpathuv8p0nadefault.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.read.get(accessxorjd.IconCompatParcelizer);
        this.serializer = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void read(Context context) {
        long j;
        if (this.serializer == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        StrokeCapCompanion strokeCapCompanion = this.read;
        RealImageLoader realImageLoader = (RealImageLoader) strokeCapCompanion.RemoteActionCompatParcelizer.get();
        if (realImageLoader == null) {
            strokeCapCompanion.serializer();
            return;
        }
        getRadiusui_graphics getradiusui_graphicsWrite = realImageLoader.write();
        if (getradiusui_graphicsWrite != null) {
            synchronized (getradiusui_graphicsWrite.RemoteActionCompatParcelizer) {
                j = getradiusui_graphicsWrite.IconCompatParcelizer.serializer;
            }
            getradiusui_graphicsWrite.read(j);
        }
    }

    public final void write(Context context) {
        long j;
        double d = this.serializer;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        StrokeCapCompanion strokeCapCompanion = this.read;
        RealImageLoader realImageLoader = (RealImageLoader) strokeCapCompanion.RemoteActionCompatParcelizer.get();
        if (realImageLoader == null) {
            strokeCapCompanion.serializer();
            return;
        }
        getRadiusui_graphics getradiusui_graphicsWrite = realImageLoader.write();
        if (getradiusui_graphicsWrite != null) {
            synchronized (getradiusui_graphicsWrite.RemoteActionCompatParcelizer) {
                j = getradiusui_graphicsWrite.IconCompatParcelizer.serializer;
            }
            getradiusui_graphicsWrite.read((long) (d * j));
        }
    }
}
