package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.SignInClientImpl;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zad;
import io.sentry.SentryClient;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.Set;
import o.accessgetNumPad4cp;
import o.accessgetNumPadDeletecp;
import o.accessgetNumPadDividecp;
import o.getAvReceiverInputEK5gGoQ;
import o.getBEK5gGoQ;
import o.getBackEK5gGoQ;
import o.onSizeChanged;

/* JADX INFO: loaded from: classes2.dex */
public final class zacl extends getAvReceiverInputEK5gGoQ implements accessgetNumPad4cp, accessgetNumPadDeletecp {
    public static final onSizeChanged write = zad.RemoteActionCompatParcelizer;
    public final Context IconCompatParcelizer;
    public final MetricsBatchProcessor MediaDescriptionCompat;
    public SentryClient MediaMetadataCompat;
    public SignInClientImpl MediaSessionCompatQueueItem;
    public final Handler RemoteActionCompatParcelizer;
    public final onSizeChanged read;
    public final Set serializer;

    public zacl(Context context, getBackEK5gGoQ getbackek5ggoq, MetricsBatchProcessor metricsBatchProcessor) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.IconCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = getbackek5ggoq;
        this.MediaDescriptionCompat = metricsBatchProcessor;
        this.serializer = (Set) metricsBatchProcessor.RemoteActionCompatParcelizer;
        this.read = write;
    }

    @Override // o.accessgetNumPad4cp
    public final void IconCompatParcelizer(int i) {
        SentryClient sentryClient = this.MediaMetadataCompat;
        zabk zabkVar = (zabk) ((GoogleApiManager) sentryClient.serializer).ParcelableVolumeInfo.get((accessgetNumPadDividecp) sentryClient.MediaBrowserCompatMediaItem);
        if (zabkVar != null) {
            if (zabkVar.RatingCompat) {
                zabkVar.serializer(new ConnectionResult(17, null, null));
            } else {
                zabkVar.IconCompatParcelizer(i);
            }
        }
    }

    @Override // o.accessgetNumPad4cp
    public final void RemoteActionCompatParcelizer() {
        this.MediaSessionCompatQueueItem.write(this);
    }

    @Override // o.accessgetNumPadDeletecp
    public final void write(ConnectionResult connectionResult) {
        this.MediaMetadataCompat.serializer(connectionResult);
    }

    @Override // o.getAvReceiverInputEK5gGoQ
    public final boolean IconCompatParcelizer(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (i) {
            case 3:
                getBEK5gGoQ.RemoteActionCompatParcelizer(parcel);
                break;
            case 4:
                getBEK5gGoQ.RemoteActionCompatParcelizer(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                getBEK5gGoQ.RemoteActionCompatParcelizer(parcel);
                break;
            case 7:
                getBEK5gGoQ.RemoteActionCompatParcelizer(parcel);
                break;
            case 8:
                zak zakVar = (zak) getBEK5gGoQ.RemoteActionCompatParcelizer(parcel, zak.CREATOR);
                getBEK5gGoQ.RemoteActionCompatParcelizer(parcel);
                this.RemoteActionCompatParcelizer.post(new com.google.android.gms.net.zza(this, zakVar, z, 10));
                break;
            case 9:
                getBEK5gGoQ.RemoteActionCompatParcelizer(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
