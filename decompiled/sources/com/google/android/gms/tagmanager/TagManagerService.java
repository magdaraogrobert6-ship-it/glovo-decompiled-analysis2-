package com.google.android.gms.tagmanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.AppMeasurement;
import o.DrawableTransformation;
import o.OnSizeChangedModifier;
import o.getLastReportedResult;
import o.onVisibilityChanged;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class TagManagerService extends Service {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;

    @Keep
    @KeepName
    public static void initialize(Context context) {
        getLastReportedResult getlastreportedresultRemoteActionCompatParcelizer = OnSizeChangedModifier.RemoteActionCompatParcelizer(context);
        synchronized (OnSizeChangedModifier.class) {
            try {
                try {
                    getlastreportedresultRemoteActionCompatParcelizer.initialize(new ObjectWrapper(context), new zzc(AppMeasurement.getInstance(context)), new onVisibilityChanged());
                } catch (RemoteException e) {
                    throw new IllegalStateException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        try {
            try {
                return zzv.asInterface(OnSizeChangedModifier.write(this).RemoteActionCompatParcelizer("com.google.android.gms.tagmanager.TagManagerServiceProviderImpl")).getService(new ObjectWrapper(this), new zzc(AppMeasurement.getInstance(this)), new onVisibilityChanged()).asBinder();
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            DrawableTransformation.read((Throwable) e2);
            return null;
        }
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
