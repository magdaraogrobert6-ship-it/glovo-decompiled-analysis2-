package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zza;
import o.accessgetSystemNavigationDowncp;
import o.getThrottleMillis;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new zza(11);
    public final long IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final Double MediaMetadataCompat;
    public final Long RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final String write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zza.write(this, parcel);
    }

    public zzpl(long j, Object obj, String str, String str2) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.read = 2;
        this.write = str;
        this.IconCompatParcelizer = j;
        this.MediaBrowserCompatMediaItem = str2;
        if (obj == null) {
            this.RemoteActionCompatParcelizer = null;
            this.MediaMetadataCompat = null;
            this.serializer = null;
            return;
        }
        if (obj instanceof Long) {
            this.RemoteActionCompatParcelizer = (Long) obj;
            this.MediaMetadataCompat = null;
            this.serializer = null;
        } else if (obj instanceof String) {
            this.RemoteActionCompatParcelizer = null;
            this.MediaMetadataCompat = null;
            this.serializer = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("User attribute given of un-supported type");
                throw null;
            }
            this.RemoteActionCompatParcelizer = null;
            this.MediaMetadataCompat = (Double) obj;
            this.serializer = null;
        }
    }

    public final Object IconCompatParcelizer() {
        Long l = this.RemoteActionCompatParcelizer;
        if (l != null) {
            return l;
        }
        Double d = this.MediaMetadataCompat;
        if (d != null) {
            return d;
        }
        String str = this.serializer;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzpl(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.read = i;
        this.write = str;
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = l;
        this.MediaMetadataCompat = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.serializer = str2;
        this.MediaBrowserCompatMediaItem = str3;
    }

    public zzpl(getThrottleMillis getthrottlemillis) {
        this(getthrottlemillis.serializer, getthrottlemillis.IconCompatParcelizer, getthrottlemillis.write, getthrottlemillis.RemoteActionCompatParcelizer);
    }
}
