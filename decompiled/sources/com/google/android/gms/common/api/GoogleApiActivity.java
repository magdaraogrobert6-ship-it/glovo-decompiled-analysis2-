package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.huawei.hms.adapter.internal.CommonCode;
import io.sentry.android.core.SentryLogcatAdapter;
import o.accessgetSystemNavigationDowncp;
import o.getBackEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    protected int serializer = 0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.serializer = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(CommonCode.MapKey.HAS_RESOLUTION, this.serializer);
        super.onSaveInstanceState(bundle);
    }

    private final void read() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            SentryLogcatAdapter.serializer("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            SentryLogcatAdapter.serializer("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            accessgetSystemNavigationDowncp.IconCompatParcelizer(num);
            GoogleApiAvailability.getInstance().showErrorDialogFragment(this, num.intValue(), 2, this);
            this.serializer = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.serializer = 1;
        } catch (ActivityNotFoundException e) {
            if (extras.getBoolean("notify_manager", true)) {
                GoogleApiManager.IconCompatParcelizer(this).IconCompatParcelizer(new ConnectionResult(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String string = pendingIntent.toString();
                String strM = d$$ExternalSyntheticOutline0.m(new StringBuilder(string.length() + 36), "Activity not found while launching ", string, ".");
                if (Build.FINGERPRINT.contains("generic")) {
                    strM = strM.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                SentryLogcatAdapter.read("GoogleApiActivity", strM, e);
            }
            this.serializer = 1;
            finish();
        } catch (IntentSender.SendIntentException e2) {
            SentryLogcatAdapter.read("GoogleApiActivity", "Failed to launch pendingIntent", e2);
            finish();
        }
    }

    public static Intent write(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.serializer = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                GoogleApiManager googleApiManagerIconCompatParcelizer = GoogleApiManager.IconCompatParcelizer(this);
                if (i2 == -1) {
                    getBackEK5gGoQ getbackek5ggoq = googleApiManagerIconCompatParcelizer.ComponentActivity;
                    getbackek5ggoq.sendMessage(getbackek5ggoq.obtainMessage(3));
                } else if (i2 == 0) {
                    googleApiManagerIconCompatParcelizer.IconCompatParcelizer(new ConnectionResult(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.serializer = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.serializer = bundle.getInt(CommonCode.MapKey.HAS_RESOLUTION);
        }
        if (this.serializer != 1) {
            read();
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
