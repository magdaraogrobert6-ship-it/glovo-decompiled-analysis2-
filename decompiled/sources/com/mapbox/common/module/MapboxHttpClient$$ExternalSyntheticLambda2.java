package com.mapbox.common.module;

import android.content.res.Configuration;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.http_backend.RequestObserver;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.protocol.RatingCompat;
import java.util.Locale;
import o.executelambda4;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.requestSingleLocationUpdateFromGooglePlay;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxHttpClient$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MapboxHttpClient$$ExternalSyntheticLambda2(Object obj, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RatingCompat ratingCompat;
        int i = this.$r8$classId;
        Object obj = this.f$2;
        long j = this.f$1;
        Object obj2 = this.f$0;
        if (i == 0) {
            MapboxHttpClient.request$lambda$4((RequestObserver) obj2, j, (HttpRequestError) obj);
            return;
        }
        if (i == 1) {
            CrashlyticsCore crashlyticsCore = (CrashlyticsCore) obj2;
            crashlyticsCore.RatingCompat.write.serializer(new requestSingleLocationUpdateFromGooglePlay(crashlyticsCore, j, (String) obj));
            return;
        }
        if (i == 2) {
            MapboxHttpClient.request$lambda$5((RequestObserver) obj2, j, (Exception) obj);
            return;
        }
        AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
        Configuration configuration = (Configuration) obj;
        if (appComponentsBreadcrumbsIntegration.RemoteActionCompatParcelizer != null) {
            int i2 = appComponentsBreadcrumbsIntegration.serializer.getResources().getConfiguration().orientation;
            if (i2 != 1) {
                ratingCompat = i2 != 2 ? null : RatingCompat.LANDSCAPE;
            } else {
                ratingCompat = RatingCompat.PORTRAIT;
            }
            String lowerCase = ratingCompat != null ? ratingCompat.name().toLowerCase(Locale.ROOT) : "undefined";
            getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1(j);
            getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem = "navigation";
            getintentarraywithconfiguredbackstacklambda1.write = "device.orientation";
            getintentarraywithconfiguredbackstacklambda1.read(lowerCase, "position");
            getintentarraywithconfiguredbackstacklambda1.read = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
            executelambda4 executelambda4Var = new executelambda4();
            executelambda4Var.RemoteActionCompatParcelizer("android:configuration", configuration);
            appComponentsBreadcrumbsIntegration.RemoteActionCompatParcelizer.IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1, executelambda4Var);
        }
    }
}
