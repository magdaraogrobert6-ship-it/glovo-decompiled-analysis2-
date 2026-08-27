package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zza;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Arrays;
import kotlin.TuplesKt;
import o.accessgetGreencp;
import o.accessgetNumPadCommacp;

/* JADX INFO: loaded from: classes2.dex */
public final class Status extends AbstractSafeParcelable implements accessgetNumPadCommacp, ReflectedParcelable {
    public final int MediaBrowserCompatMediaItem;
    public final ConnectionResult MediaMetadataCompat;
    public final PendingIntent MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public static final Status IconCompatParcelizer = new Status(0, null, null, null);
    public static final Status RemoteActionCompatParcelizer = new Status(14, null, null, null);
    public static final Status read = new Status(8, null, null, null);
    public static final Status write = new Status(15, null, null, null);
    public static final Status serializer = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new zza(1);

    @Override // o.accessgetNumPadCommacp
    public final Status getStatus() {
        return this;
    }

    public final boolean write() {
        return this.MediaBrowserCompatMediaItem <= 0;
    }

    public final String toString() {
        accessgetGreencp accessgetgreencp = new accessgetGreencp(this);
        String statusCodeString = this.RatingCompat;
        if (statusCodeString == null) {
            statusCodeString = CommonStatusCodes.getStatusCodeString(this.MediaBrowserCompatMediaItem);
        }
        accessgetgreencp.IconCompatParcelizer(statusCodeString, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        accessgetgreencp.IconCompatParcelizer(this.MediaSessionCompatQueueItem, CommonCode.MapKey.HAS_RESOLUTION);
        return accessgetgreencp.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.MediaBrowserCompatMediaItem);
        SQLite.serializer(parcel, 2, this.RatingCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, this.MediaSessionCompatQueueItem, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, this.MediaMetadataCompat, i);
        SQLite.serializer(i2, parcel);
    }

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.MediaBrowserCompatMediaItem = i;
        this.RatingCompat = str;
        this.MediaSessionCompatQueueItem = pendingIntent;
        this.MediaMetadataCompat = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.MediaBrowserCompatMediaItem == status.MediaBrowserCompatMediaItem && TuplesKt.write((Object) this.RatingCompat, (Object) status.RatingCompat) && TuplesKt.write(this.MediaSessionCompatQueueItem, status.MediaSessionCompatQueueItem) && TuplesKt.write(this.MediaMetadataCompat, status.MediaMetadataCompat);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompatMediaItem;
        PendingIntent pendingIntent = this.MediaSessionCompatQueueItem;
        ConnectionResult connectionResult = this.MediaMetadataCompat;
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), this.RatingCompat, pendingIntent, connectionResult});
    }
}
