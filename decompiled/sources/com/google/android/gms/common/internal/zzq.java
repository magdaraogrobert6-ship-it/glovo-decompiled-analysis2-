package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.HashMap;
import java.util.concurrent.Executor;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTabcp;
import o.accessgetTcp;
import o.accessgetThreecp;
import o.accessgetTvAudioDescriptionMixingVolumeUpcp;
import o.getBackEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzq {
    public static boolean IconCompatParcelizer = false;
    public static zzq RemoteActionCompatParcelizer;
    public static HandlerThread serializer;
    public static final Object write = new Object();
    public final Context MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final accessgetTvAudioDescriptionMixingVolumeUpcp MediaMetadataCompat;
    public volatile getBackEK5gGoQ MediaSessionCompatQueueItem;
    public final long RatingCompat;
    public final HashMap read = new HashMap();

    public static HandlerThread IconCompatParcelizer() {
        synchronized (write) {
            HandlerThread handlerThread = serializer;
            if (handlerThread != null && handlerThread.isAlive()) {
                return serializer;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            serializer = handlerThread2;
            handlerThread2.start();
            return serializer;
        }
    }

    public static zzq read(Context context) {
        synchronized (write) {
            if (RemoteActionCompatParcelizer == null) {
                if (!IconCompatParcelizer) {
                    context.getPackageName();
                    IconCompatParcelizer = true;
                }
                RemoteActionCompatParcelizer = new zzq(context.getApplicationContext(), IconCompatParcelizer ? IconCompatParcelizer().getLooper() : context.getMainLooper());
            }
        }
        return RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(accessgetThreecp accessgetthreecp, ServiceConnection serviceConnection) {
        accessgetSystemNavigationDowncp.serializer(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.read;
        synchronized (map) {
            zzo zzoVar = (zzo) map.get(accessgetthreecp);
            if (zzoVar == null) {
                String string = accessgetthreecp.toString();
                StringBuilder sb = new StringBuilder(string.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            if (!zzoVar.IconCompatParcelizer.containsKey(serviceConnection)) {
                String string2 = accessgetthreecp.toString();
                StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(string2);
                throw new IllegalStateException(sb2.toString());
            }
            zzoVar.IconCompatParcelizer.remove(serviceConnection);
            if (zzoVar.IconCompatParcelizer.isEmpty()) {
                this.MediaSessionCompatQueueItem.sendMessageDelayed(this.MediaSessionCompatQueueItem.obtainMessage(0, accessgetthreecp), this.MediaDescriptionCompat);
            }
        }
    }

    public final ConnectionResult write(accessgetThreecp accessgetthreecp, accessgetTcp accessgettcp, String str, Executor executor) {
        ConnectionResult connectionResultIconCompatParcelizer;
        HashMap map = this.read;
        synchronized (map) {
            zzo zzoVar = (zzo) map.get(accessgetthreecp);
            if (executor == null) {
                executor = null;
            }
            if (zzoVar == null) {
                zzoVar = new zzo(this, accessgetthreecp);
                zzoVar.IconCompatParcelizer.put(accessgettcp, accessgettcp);
                connectionResultIconCompatParcelizer = zzoVar.IconCompatParcelizer(str, executor);
                map.put(accessgetthreecp, zzoVar);
            } else {
                this.MediaSessionCompatQueueItem.removeMessages(0, accessgetthreecp);
                if (zzoVar.IconCompatParcelizer.containsKey(accessgettcp)) {
                    String string = accessgetthreecp.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                zzoVar.IconCompatParcelizer.put(accessgettcp, accessgettcp);
                int i = zzoVar.serializer;
                if (i == 1) {
                    accessgettcp.onServiceConnected(zzoVar.MediaMetadataCompat, zzoVar.read);
                } else if (i == 2) {
                    connectionResultIconCompatParcelizer = zzoVar.IconCompatParcelizer(str, executor);
                }
                connectionResultIconCompatParcelizer = null;
            }
            if (zzoVar.RemoteActionCompatParcelizer) {
                return ConnectionResult.write;
            }
            if (connectionResultIconCompatParcelizer == null) {
                connectionResultIconCompatParcelizer = new ConnectionResult(-1, null, null);
            }
            return connectionResultIconCompatParcelizer;
        }
    }

    public zzq(Context context, Looper looper) {
        accessgetTabcp accessgettabcp = new accessgetTabcp(this);
        this.MediaBrowserCompatMediaItem = context.getApplicationContext();
        getBackEK5gGoQ getbackek5ggoq = new getBackEK5gGoQ(looper, accessgettabcp);
        Looper.getMainLooper();
        this.MediaSessionCompatQueueItem = getbackek5ggoq;
        this.MediaMetadataCompat = accessgetTvAudioDescriptionMixingVolumeUpcp.RemoteActionCompatParcelizer();
        this.MediaDescriptionCompat = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        this.RatingCompat = 300000L;
    }
}
