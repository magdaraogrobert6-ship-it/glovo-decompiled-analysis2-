package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import androidx.compose.ui.graphics.Fields;
import java.util.Iterator;
import o.Fill;
import o.UriActionExternalSyntheticLambda4;
import o.getActionTypeandroid_sdk_ui_release;
import o.isValidLogPurchaseInputlambda3;
import o.parselambda1;
import o.qdExternalSyntheticLambda8;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class write extends ConnectivityManager.NetworkCallback {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ write(int i, Object obj) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        int i = 2 % 2;
        int i2 = read + 75;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.write != 0) {
            super.onUnavailable();
            return;
        }
        IconCompatParcelizer();
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = read.IconCompatParcelizer.serializer();
        try {
            Iterator it = read.RemoteActionCompatParcelizer.iterator();
            int i3 = serializer + 119;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            while (!(!it.hasNext())) {
                int i5 = serializer + 13;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i = 2 % 2;
        int i2 = this.write;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                network.getClass();
                ((qdExternalSyntheticLambda8) this.RemoteActionCompatParcelizer).write(network);
                return;
            } else {
                Fill.IconCompatParcelizer().post(new isValidLogPurchaseInputlambda3(this, false, i3));
                return;
            }
        }
        if (!network.equals(((read) this.RemoteActionCompatParcelizer).ParcelableVolumeInfo)) {
            int i4 = read + 85;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        IconCompatParcelizer();
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = read.IconCompatParcelizer.serializer();
        try {
            Iterator it = read.RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                int i6 = serializer + 1;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        int i = 2 % 2;
        int i2 = this.write;
        boolean z = true;
        char c = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                network.getClass();
                ((qdExternalSyntheticLambda8) this.RemoteActionCompatParcelizer).write(network);
                return;
            } else {
                Fill.IconCompatParcelizer().post(new isValidLogPurchaseInputlambda3(this, z, c == true ? 1 : 0));
                return;
            }
        }
        ((read) this.RemoteActionCompatParcelizer).ParcelableVolumeInfo = network;
        if (((read) this.RemoteActionCompatParcelizer).PlaybackStateCompat.getAndSet(true)) {
            return;
        }
        int i3 = read + 103;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = read.IconCompatParcelizer.serializer();
        try {
            Iterator it = read.RemoteActionCompatParcelizer.iterator();
            while (!(!it.hasNext())) {
                ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
            }
            uriActionExternalSyntheticLambda4Serializer.close();
            int i5 = serializer + 89;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 91;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((read) this.RemoteActionCompatParcelizer).PlaybackStateCompat.set(false);
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = ((read) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper.serializer();
        try {
            ((read) this.RemoteActionCompatParcelizer).MediaSessionCompatQueueItem = null;
            ((read) this.RemoteActionCompatParcelizer).ParcelableVolumeInfo = null;
            read readVar = (read) this.RemoteActionCompatParcelizer;
            readVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            readVar.PlaybackStateCompatCustomAction = SystemClock.uptimeMillis();
            ((read) this.RemoteActionCompatParcelizer).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
            Iterator it = ((read) this.RemoteActionCompatParcelizer).MediaMetadataCompat.iterator();
            while (it.hasNext()) {
                int i4 = serializer + 11;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                ((parselambda1) it.next()).serializer(getActionTypeandroid_sdk_ui_release.DISCONNECTED);
                int i6 = serializer + 59;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a3 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:36:0x0093, B:37:0x009d, B:39:0x00a3), top: B:65:0x0093 }] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean z;
        getActionTypeandroid_sdk_ui_release getactiontypeandroid_sdk_ui_releaseWrite;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer;
        Iterator it;
        int i = 2 % 2;
        int i2 = serializer + 5;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.write != 0) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            return;
        }
        if (network.equals(((read) this.RemoteActionCompatParcelizer).ParcelableVolumeInfo)) {
            NetworkCapabilities networkCapabilities2 = ((read) this.RemoteActionCompatParcelizer).MediaSessionCompatQueueItem;
            int i3 = 0;
            if (networkCapabilities2 == null) {
                int i4 = serializer + 13;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z != (networkCapabilities == null)) {
                ((read) this.RemoteActionCompatParcelizer).IconCompatParcelizer(networkCapabilities);
                getactiontypeandroid_sdk_ui_releaseWrite = ((read) this.RemoteActionCompatParcelizer).write();
                uriActionExternalSyntheticLambda4Serializer = ((read) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper.serializer();
                it = ((read) this.RemoteActionCompatParcelizer).MediaMetadataCompat.iterator();
                while (it.hasNext()) {
                    ((parselambda1) it.next()).serializer(getactiontypeandroid_sdk_ui_releaseWrite);
                }
                uriActionExternalSyntheticLambda4Serializer.close();
            } else if (networkCapabilities2 != null || networkCapabilities != null) {
                int[] iArr = read.read;
                int length = iArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        int[] iArr2 = read.MediaDescriptionCompat;
                        int length2 = iArr2.length;
                        while (true) {
                            if (i3 < length2) {
                                int i7 = iArr2[i3];
                                if (networkCapabilities2.hasTransport(i7) == networkCapabilities.hasTransport(i7)) {
                                    i3++;
                                }
                            }
                        }
                    } else {
                        int i8 = iArr[i6];
                        if (i8 != 0) {
                            int i9 = read + 3;
                            serializer = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            if (networkCapabilities2.hasCapability(i8) != networkCapabilities.hasCapability(i8)) {
                            }
                        }
                        i6++;
                    }
                    ((read) this.RemoteActionCompatParcelizer).IconCompatParcelizer(networkCapabilities);
                    getactiontypeandroid_sdk_ui_releaseWrite = ((read) this.RemoteActionCompatParcelizer).write();
                    uriActionExternalSyntheticLambda4Serializer = ((read) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper.serializer();
                    try {
                        it = ((read) this.RemoteActionCompatParcelizer).MediaMetadataCompat.iterator();
                        while (it.hasNext()) {
                            ((parselambda1) it.next()).serializer(getactiontypeandroid_sdk_ui_releaseWrite);
                        }
                        uriActionExternalSyntheticLambda4Serializer.close();
                    } catch (Throwable th) {
                        try {
                            uriActionExternalSyntheticLambda4Serializer.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2 = read.IconCompatParcelizer.serializer();
            try {
                Iterator it2 = read.RemoteActionCompatParcelizer.iterator();
                while (it2.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it2.next()).onCapabilitiesChanged(network, networkCapabilities);
                }
                uriActionExternalSyntheticLambda4Serializer2.close();
            } catch (Throwable th3) {
                try {
                    uriActionExternalSyntheticLambda4Serializer2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}
