package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.common.ConnectionResult;
import io.sentry.android.core.SentryLogcatAdapter;
import o.OnPlacedNode;
import o.accessgetRocp;
import o.accessgetStem1cp;
import o.getBackEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb extends getBackEK5gGoQ {
    public final /* synthetic */ BaseGmsClient IconCompatParcelizer;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        accessgetStem1cp accessgetstem1cp;
        BaseGmsClient baseGmsClient = this.IconCompatParcelizer;
        int i = baseGmsClient.MediaSessionCompatResultReceiverWrapper.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (accessgetstem1cp = (accessgetStem1cp) message.obj) != null) {
                synchronized (accessgetstem1cp) {
                    accessgetstem1cp.RemoteActionCompatParcelizer = null;
                }
                BaseGmsClient baseGmsClient2 = accessgetstem1cp.MediaDescriptionCompat;
                synchronized (baseGmsClient2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                    baseGmsClient2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.remove(accessgetstem1cp);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || ((i3 == 4 && !(baseGmsClient instanceof OnPlacedNode)) || i3 == 5)) && !baseGmsClient.PlaybackStateCompatCustomAction()) {
            accessgetStem1cp accessgetstem1cp2 = (accessgetStem1cp) message.obj;
            if (accessgetstem1cp2 != null) {
                synchronized (accessgetstem1cp2) {
                    accessgetstem1cp2.RemoteActionCompatParcelizer = null;
                }
                BaseGmsClient baseGmsClient3 = accessgetstem1cp2.MediaDescriptionCompat;
                synchronized (baseGmsClient3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                    baseGmsClient3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.remove(accessgetstem1cp2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            baseGmsClient.read = new ConnectionResult(message.arg2, null, null);
            if (baseGmsClient.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() && !baseGmsClient.RatingCompat) {
                baseGmsClient.RemoteActionCompatParcelizer(3, null);
                return;
            }
            ConnectionResult connectionResult = baseGmsClient.read;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            baseGmsClient.MediaMetadataCompat.IconCompatParcelizer(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            ConnectionResult connectionResult2 = baseGmsClient.read;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            baseGmsClient.MediaMetadataCompat.IconCompatParcelizer(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            baseGmsClient.MediaMetadataCompat.IconCompatParcelizer(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            baseGmsClient.RemoteActionCompatParcelizer(5, null);
            accessgetRocp accessgetrocp = baseGmsClient.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (accessgetrocp != null) {
                accessgetrocp.serializer(message.arg2);
            }
            baseGmsClient.MediaSessionCompatToken();
            baseGmsClient.IconCompatParcelizer(5, 1, null);
            return;
        }
        if (i4 == 2 && !baseGmsClient.ParcelableVolumeInfo()) {
            accessgetStem1cp accessgetstem1cp3 = (accessgetStem1cp) message.obj;
            if (accessgetstem1cp3 != null) {
                synchronized (accessgetstem1cp3) {
                    accessgetstem1cp3.RemoteActionCompatParcelizer = null;
                }
                BaseGmsClient baseGmsClient4 = accessgetstem1cp3.MediaDescriptionCompat;
                synchronized (baseGmsClient4.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                    baseGmsClient4.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.remove(accessgetstem1cp3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            SentryLogcatAdapter.IconCompatParcelizer("GmsClient", d$$ExternalSyntheticOutline0.m(i5, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i5).length() + 34)), new Exception());
            return;
        }
        accessgetStem1cp accessgetstem1cp4 = (accessgetStem1cp) message.obj;
        synchronized (accessgetstem1cp4) {
            bool = accessgetstem1cp4.RemoteActionCompatParcelizer;
            if (accessgetstem1cp4.read) {
                String string = accessgetstem1cp4.toString();
                StringBuilder sb = new StringBuilder(string.length() + 47);
                sb.append("Callback proxy ");
                sb.append(string);
                sb.append(" being reused. This is not safe.");
                SentryLogcatAdapter.IconCompatParcelizer("GmsClient", sb.toString());
            }
        }
        if (bool != null) {
            BaseGmsClient baseGmsClient5 = accessgetstem1cp4.write;
            int i6 = accessgetstem1cp4.serializer;
            if (i6 != 0) {
                baseGmsClient5.RemoteActionCompatParcelizer(1, null);
                Bundle bundle = accessgetstem1cp4.IconCompatParcelizer;
                accessgetstem1cp4.serializer(new ConnectionResult(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!accessgetstem1cp4.read()) {
                baseGmsClient5.RemoteActionCompatParcelizer(1, null);
                accessgetstem1cp4.serializer(new ConnectionResult(8, null, null));
            }
        }
        synchronized (accessgetstem1cp4) {
            accessgetstem1cp4.read = true;
        }
        synchronized (accessgetstem1cp4) {
            accessgetstem1cp4.RemoteActionCompatParcelizer = null;
        }
        BaseGmsClient baseGmsClient6 = accessgetstem1cp4.MediaDescriptionCompat;
        synchronized (baseGmsClient6.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            baseGmsClient6.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.remove(accessgetstem1cp4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper, 2);
        this.IconCompatParcelizer = baseGmsClient;
    }
}
