package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.android.core.SentryLogcatAdapter;
import o.accessgetThreecp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzah {
    public static final Uri RemoteActionCompatParcelizer = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority("com.google.android.gms.chimera").build();

    public static Intent write(Context context, accessgetThreecp accessgetthreecp) throws zzaf {
        Bundle bundleCall;
        String str = accessgetthreecp.serializer;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (accessgetthreecp.write) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(RemoteActionCompatParcelizer);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (RemoteException | IllegalArgumentException e) {
                SentryLogcatAdapter.IconCompatParcelizer("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            if (bundleCall != null) {
                Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                if (intent2 != null) {
                    intent = intent2;
                } else {
                    PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                    if (pendingIntent != null) {
                        StringBuilder sb = new StringBuilder(str.length() + 72);
                        sb.append("Dynamic lookup for intent failed for action ");
                        sb.append(str);
                        sb.append(" but has possible resolution");
                        SentryLogcatAdapter.IconCompatParcelizer("ServiceBindIntentUtils", sb.toString());
                        throw new zzaf(new ConnectionResult(25, pendingIntent, null));
                    }
                }
            }
            if (intent == null) {
                SentryLogcatAdapter.IconCompatParcelizer("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
            }
        }
        return intent == null ? new Intent(str).setPackage(accessgetthreecp.RemoteActionCompatParcelizer) : intent;
    }
}
