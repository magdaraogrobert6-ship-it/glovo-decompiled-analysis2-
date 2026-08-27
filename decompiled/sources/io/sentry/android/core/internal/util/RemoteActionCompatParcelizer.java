package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import java.util.Iterator;
import o.UriActionExternalSyntheticLambda4;
import o.getActionTypeandroid_sdk_ui_release;
import o.parselambda1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RemoteActionCompatParcelizer implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ read serializer;

    public /* synthetic */ RemoteActionCompatParcelizer(read readVar, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = readVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        read readVar = this.serializer;
        if (i == 0) {
            readVar.read();
            return;
        }
        readVar.IconCompatParcelizer(null);
        getActionTypeandroid_sdk_ui_release getactiontypeandroid_sdk_ui_releaseWrite = readVar.write();
        if (getactiontypeandroid_sdk_ui_releaseWrite == getActionTypeandroid_sdk_ui_release.DISCONNECTED) {
            readVar.PlaybackStateCompat.set(false);
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = read.IconCompatParcelizer.serializer();
            try {
                Iterator it = read.RemoteActionCompatParcelizer.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
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
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2 = readVar.MediaSessionCompatResultReceiverWrapper.serializer();
        try {
            Iterator it2 = readVar.MediaMetadataCompat.iterator();
            while (it2.hasNext()) {
                ((parselambda1) it2.next()).serializer(getactiontypeandroid_sdk_ui_releaseWrite);
            }
            uriActionExternalSyntheticLambda4Serializer2.close();
            readVar.read();
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
