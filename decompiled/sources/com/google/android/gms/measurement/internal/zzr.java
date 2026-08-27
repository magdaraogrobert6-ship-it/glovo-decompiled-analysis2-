package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zza;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.accessgetSystemNavigationDowncp;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zza(12);
    public final long ComponentActivity;
    public final int IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final long MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final boolean ParcelableVolumeInfo;
    public final boolean PlaybackStateCompat;
    public final long PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final boolean ResultReceiver;
    public final int _init_lambda2;
    public final boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final long r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final Boolean r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final String r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final String r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final List r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final String r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final String r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final long r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final long read;
    public final long serializer;
    public final String write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 2, this.RatingCompat);
        SQLite.serializer(parcel, 3, this.MediaBrowserCompatMediaItem);
        SQLite.serializer(parcel, 4, this.MediaSessionCompatQueueItem);
        SQLite.serializer(parcel, 5, this.MediaDescriptionCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 8);
        parcel.writeLong(this.MediaMetadataCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 7, 8);
        parcel.writeLong(this.PlaybackStateCompatCustomAction);
        SQLite.serializer(parcel, 8, this.MediaSessionCompatToken);
        SQLite.RemoteActionCompatParcelizer(parcel, 9, 4);
        parcel.writeInt(this.ParcelableVolumeInfo ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 10, 4);
        parcel.writeInt(this.PlaybackStateCompat ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 11, 8);
        parcel.writeLong(this.MediaSessionCompatResultReceiverWrapper);
        SQLite.serializer(parcel, 12, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        SQLite.RemoteActionCompatParcelizer(parcel, 14, 8);
        parcel.writeLong(this.ComponentActivity);
        SQLite.RemoteActionCompatParcelizer(parcel, 15, 4);
        parcel.writeInt(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        SQLite.RemoteActionCompatParcelizer(parcel, 16, 4);
        parcel.writeInt(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 18, 4);
        parcel.writeInt(this.ResultReceiver ? 1 : 0);
        Boolean bool = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (bool != null) {
            SQLite.RemoteActionCompatParcelizer(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        SQLite.RemoteActionCompatParcelizer(parcel, 22, 8);
        parcel.writeLong(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        Object[] objArr = {parcel, 23, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM};
        int iSerializer = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 690290684, objArr, getQueryParameterslambda2.serializer(), -690290681, iSerializer);
        SQLite.serializer(parcel, 25, this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        SQLite.serializer(parcel, 26, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        SQLite.serializer(parcel, 27, this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        SQLite.RemoteActionCompatParcelizer(parcel, 28, 4);
        parcel.writeInt(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 29, 8);
        parcel.writeLong(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        SQLite.RemoteActionCompatParcelizer(parcel, 30, 4);
        parcel.writeInt(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        SQLite.serializer(parcel, 31, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        SQLite.RemoteActionCompatParcelizer(parcel, 32, 4);
        parcel.writeInt(this._init_lambda2);
        SQLite.RemoteActionCompatParcelizer(parcel, 34, 8);
        parcel.writeLong(this.serializer);
        SQLite.serializer(parcel, 35, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 36, this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 37, 8);
        parcel.writeLong(this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 38, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public zzr(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.RatingCompat = str;
        this.MediaBrowserCompatMediaItem = true == TextUtils.isEmpty(str2) ? null : str2;
        this.MediaSessionCompatQueueItem = str3;
        this.MediaSessionCompatResultReceiverWrapper = j;
        this.MediaDescriptionCompat = str4;
        this.MediaMetadataCompat = j2;
        this.PlaybackStateCompatCustomAction = j3;
        this.MediaSessionCompatToken = str5;
        this.ParcelableVolumeInfo = z;
        this.PlaybackStateCompat = z2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = str6;
        this.ComponentActivity = j4;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = z3;
        this.ResultReceiver = z4;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = bool;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = j5;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = list;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = str7;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = str8;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = str9;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = z5;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = j6;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i2;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = str10;
        this._init_lambda2 = i3;
        this.serializer = j7;
        this.RemoteActionCompatParcelizer = str11;
        this.write = str12;
        this.read = j8;
        this.IconCompatParcelizer = i4;
    }

    public zzr(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        this.RatingCompat = str;
        this.MediaBrowserCompatMediaItem = str2;
        this.MediaSessionCompatQueueItem = str3;
        this.MediaSessionCompatResultReceiverWrapper = j3;
        this.MediaDescriptionCompat = str4;
        this.MediaMetadataCompat = j;
        this.PlaybackStateCompatCustomAction = j2;
        this.MediaSessionCompatToken = str5;
        this.ParcelableVolumeInfo = z;
        this.PlaybackStateCompat = z2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = str6;
        this.ComponentActivity = j4;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = z3;
        this.ResultReceiver = z4;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = bool;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = j5;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = arrayList;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = str7;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = str8;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = str9;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = z5;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = j6;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i2;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = str10;
        this._init_lambda2 = i3;
        this.serializer = j7;
        this.RemoteActionCompatParcelizer = str11;
        this.write = str12;
        this.read = j8;
        this.IconCompatParcelizer = i4;
    }
}
