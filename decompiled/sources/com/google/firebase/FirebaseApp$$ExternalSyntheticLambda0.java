package com.google.firebase;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import io.sentry.metrics.MetricsBatchProcessor;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AccessibilityIteratorsPageTextSegmentIteratorCompanion;
import o.getHasMeasureResult;
import o.getPositionnOccac;
import o.setEnableExtraAssertions;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class FirebaseApp$$ExternalSyntheticLambda0 implements AbstractComposeViewExternalSyntheticLambda0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ FirebaseApp$$ExternalSyntheticLambda0(Context context, String str) {
        this.IconCompatParcelizer = 2;
        this.serializer = context;
        this.write = str;
    }

    @Override // o.AbstractComposeViewExternalSyntheticLambda0
    public final Object write() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        Object obj2 = this.serializer;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                return new setEnableExtraAssertions((Context) obj2, (String) obj);
            }
            getHasMeasureResult gethasmeasureresult = (getHasMeasureResult) obj2;
            return gethasmeasureresult.IconCompatParcelizer.create(new MetricsBatchProcessor(gethasmeasureresult, (getPositionnOccac) obj));
        }
        FirebaseApp firebaseApp = (FirebaseApp) obj;
        String strSerializer = firebaseApp.serializer();
        AccessibilityIteratorsPageTextSegmentIteratorCompanion accessibilityIteratorsPageTextSegmentIteratorCompanion = new AccessibilityIteratorsPageTextSegmentIteratorCompanion();
        Context contextCreateDeviceProtectedStorageContext = ((Context) obj2).createDeviceProtectedStorageContext();
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strSerializer), 0);
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), Fields.SpotShadowColor)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        accessibilityIteratorsPageTextSegmentIteratorCompanion.IconCompatParcelizer = z;
        return accessibilityIteratorsPageTextSegmentIteratorCompanion;
    }

    public /* synthetic */ FirebaseApp$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.write = obj;
        this.serializer = obj2;
    }
}
