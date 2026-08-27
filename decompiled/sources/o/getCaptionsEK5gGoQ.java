package o;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.gtm.zzd;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.util.Objects;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getCaptionsEK5gGoQ implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public boolean MediaSessionCompatQueueItem = false;
    public final /* synthetic */ zzd RatingCompat;
    public final /* synthetic */ Bundle RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ getCaptionsEK5gGoQ(zzd zzdVar, String str, Bundle bundle, String str2, long j, String str3, int i) {
        this.IconCompatParcelizer = i;
        this.write = str;
        this.RemoteActionCompatParcelizer = bundle;
        this.read = str2;
        this.serializer = j;
        this.RatingCompat = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        zzd zzdVar = this.RatingCompat;
        if (i != 0) {
            String str = this.write;
            getContactsEK5gGoQ getcontactsek5ggoq = ((getCapsLockEK5gGoQ) zzdVar).read;
            int i2 = getcontactsek5ggoq.MediaSessionCompatResultReceiverWrapper;
            Bundle bundle = this.RemoteActionCompatParcelizer;
            if (i2 == 3) {
                String str2 = this.read;
                long j = this.serializer;
                getCutEK5gGoQ getcutek5ggoq = getcontactsek5ggoq.RemoteActionCompatParcelizer;
                if (getcutek5ggoq.IconCompatParcelizer()) {
                    try {
                        getcutek5ggoq.read.IconCompatParcelizer(str, bundle, str2, j, false);
                        return;
                    } catch (RemoteException e) {
                        getButtonThumbLeftEK5gGoQ.read("Error calling service to emit event", e);
                        return;
                    }
                }
                return;
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 4) {
                    getButton5EK5gGoQ.read(getcontactsek5ggoq.write, c8$$ExternalSyntheticOutline0.m(i2, "Unexpected state:"));
                    return;
                }
                Objects.toString(bundle);
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                return;
            }
            if (this.MediaSessionCompatQueueItem) {
                getButtonThumbLeftEK5gGoQ.serializer("Invalid state - not expecting to see a deferred event during container loading.");
                return;
            }
            Objects.toString(bundle);
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            this.MediaSessionCompatQueueItem = true;
            getcontactsek5ggoq.PlaybackStateCompat.add(this);
            return;
        }
        getContactsEK5gGoQ getcontactsek5ggoq2 = ((getChannelDownEK5gGoQ) zzdVar).read;
        int i3 = getcontactsek5ggoq2.MediaSessionCompatResultReceiverWrapper;
        String str3 = this.read;
        if (i3 == 3) {
            String str4 = this.write;
            Bundle bundle2 = this.RemoteActionCompatParcelizer;
            long j2 = this.serializer;
            getCutEK5gGoQ getcutek5ggoq2 = getcontactsek5ggoq2.RemoteActionCompatParcelizer;
            if (getcutek5ggoq2.IconCompatParcelizer()) {
                try {
                    getcutek5ggoq2.read.IconCompatParcelizer(str4, bundle2, str3, j2, true);
                    return;
                } catch (RemoteException e2) {
                    getButtonThumbLeftEK5gGoQ.read("Error calling service to emit event", e2);
                    return;
                }
            }
            return;
        }
        if (i3 == 4) {
            String str5 = this.write;
            Bundle bundle3 = this.RemoteActionCompatParcelizer;
            Objects.toString(bundle3);
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            try {
                getcontactsek5ggoq2.read.RemoteActionCompatParcelizer(this.serializer, bundle3, str3, str5);
                return;
            } catch (RemoteException e3) {
                getButton5EK5gGoQ.IconCompatParcelizer("Error logging event on measurement proxy: ", e3, getcontactsek5ggoq2.write);
                return;
            }
        }
        Context context = getcontactsek5ggoq2.write;
        if (i3 != 1 && i3 != 2) {
            getButton5EK5gGoQ.read(context, "Unexpected state:" + i3);
        } else {
            if (this.MediaSessionCompatQueueItem) {
                getButton5EK5gGoQ.read(context, "Invalid state - not expecting to see a deferredevent during container loading.");
                return;
            }
            Objects.toString(this.RemoteActionCompatParcelizer);
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            this.MediaSessionCompatQueueItem = true;
            getcontactsek5ggoq2.PlaybackStateCompat.add(this);
        }
    }
}
