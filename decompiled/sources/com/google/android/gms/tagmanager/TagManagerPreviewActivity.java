package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.AppMeasurement;
import io.sentry.android.core.SentryLogcatAdapter;
import o.OnSizeChangedModifier;
import o.getLastReportedResult;
import o.onVisibilityChanged;

/* JADX INFO: loaded from: classes4.dex */
public class TagManagerPreviewActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getData() == null) {
            SentryLogcatAdapter.serializer("GoogleTagManager", "Activity intent has no data.");
            return;
        }
        Intent intent = getIntent();
        getLastReportedResult getlastreportedresultRemoteActionCompatParcelizer = OnSizeChangedModifier.RemoteActionCompatParcelizer(this);
        synchronized (OnSizeChangedModifier.class) {
            try {
                try {
                    getlastreportedresultRemoteActionCompatParcelizer.previewIntent(intent, new ObjectWrapper(this), new ObjectWrapper(OnSizeChangedModifier.serializer.ResultReceiver), new zzc(AppMeasurement.getInstance(this)), new onVisibilityChanged());
                } catch (RemoteException e) {
                    throw new IllegalStateException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
