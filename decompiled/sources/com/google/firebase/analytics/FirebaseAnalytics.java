package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.LazyKt__LazyJVMKt;
import o.MultiContentMeasurePolicyKt;
import o.accesscaptureRulersIfNeeded;
import o.accessgetSystemNavigationDowncp;
import o.accesssetInstancecp;
import o.getRoEK5gGoQ;
import o.getSoftRightEK5gGoQ;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics zza;
    public final getSoftRightEK5gGoQ zzb;

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = FirebaseInstallations.RemoteActionCompatParcelizer;
            return (String) LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(((FirebaseInstallations) FirebaseApp.write().write(accesssetInstancecp.class)).write(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
            return null;
        } catch (ExecutionException e2) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public final void setUserProperty(String str, String str2) {
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.zzb;
        getsoftrightek5ggoq.getClass();
        getsoftrightek5ggoq.write(new zzdh(getsoftrightek5ggoq, null, str, str2, false));
    }

    public FirebaseAnalytics(getSoftRightEK5gGoQ getsoftrightek5ggoq) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getsoftrightek5ggoq);
        this.zzb = getsoftrightek5ggoq;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                if (zza == null) {
                    zza = new FirebaseAnalytics(getSoftRightEK5gGoQ.write(context, null));
                }
            }
        }
        return zza;
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        zzdf zzdfVarIconCompatParcelizer = zzdf.IconCompatParcelizer(activity);
        getSoftRightEK5gGoQ getsoftrightek5ggoq = this.zzb;
        getsoftrightek5ggoq.getClass();
        getsoftrightek5ggoq.write(new getRoEK5gGoQ(getsoftrightek5ggoq, zzdfVarIconCompatParcelizer, str, str2));
    }

    @Keep
    public static MultiContentMeasurePolicyKt getScionFrontendApiImplementation(Context context, Bundle bundle) {
        getSoftRightEK5gGoQ getsoftrightek5ggoqWrite = getSoftRightEK5gGoQ.write(context, bundle);
        if (getsoftrightek5ggoqWrite == null) {
            return null;
        }
        return new accesscaptureRulersIfNeeded(getsoftrightek5ggoqWrite);
    }
}
