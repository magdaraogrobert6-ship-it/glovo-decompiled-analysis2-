package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zza;
import o.accessgetRcp;

/* JADX INFO: loaded from: classes2.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public final String ComponentActivity;
    public final int IconCompatParcelizer;
    public Account MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public Bundle MediaMetadataCompat;
    public Scope[] MediaSessionCompatQueueItem;
    public Feature[] MediaSessionCompatResultReceiverWrapper;
    public final boolean MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public final int PlaybackStateCompat;
    public Feature[] PlaybackStateCompatCustomAction;
    public IBinder RatingCompat;
    public final int read;
    public final int serializer;
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zza(4);
    public static final Scope[] write = new Scope[0];
    public static final Feature[] RemoteActionCompatParcelizer = new Feature[0];

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zza.write(this, parcel, i);
    }

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? write : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = RemoteActionCompatParcelizer;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.read = i;
        this.serializer = i2;
        this.IconCompatParcelizer = i3;
        if ("com.google.android.gms".equals(str)) {
            this.MediaDescriptionCompat = "com.google.android.gms";
        } else {
            this.MediaDescriptionCompat = str;
        }
        if (i < 2) {
            this.MediaBrowserCompatMediaItem = iBinder != null ? accessgetRcp.serializer(accessgetRcp.write(iBinder)) : null;
        } else {
            this.RatingCompat = iBinder;
            this.MediaBrowserCompatMediaItem = account;
        }
        this.MediaSessionCompatQueueItem = scopeArr;
        this.MediaMetadataCompat = bundle;
        this.MediaSessionCompatResultReceiverWrapper = featureArr;
        this.PlaybackStateCompatCustomAction = featureArr2;
        this.MediaSessionCompatToken = z;
        this.PlaybackStateCompat = i4;
        this.ParcelableVolumeInfo = z2;
        this.ComponentActivity = str2;
    }
}
