package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new com.google.android.gms.common.api.zzd(26);
    public final RootTelemetryConfiguration IconCompatParcelizer;
    public final int[] MediaBrowserCompatMediaItem;
    public final boolean RemoteActionCompatParcelizer;
    public final int[] read;
    public final int serializer;
    public final boolean write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, this.IconCompatParcelizer, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.write ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, this.MediaBrowserCompatMediaItem);
        SQLite.serializer(i2, parcel);
    }

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.IconCompatParcelizer = rootTelemetryConfiguration;
        this.RemoteActionCompatParcelizer = z;
        this.write = z2;
        this.read = iArr;
        this.serializer = i;
        this.MediaBrowserCompatMediaItem = iArr2;
    }
}
