package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import io.sentry.android.core.SentryLogcatAdapter;
import o.accessgetThumbsUpcp;
import o.accessgetToggle2D3Dcp;
import o.accessgetTvSatelliteCscp;
import o.accessgetTwocp;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzq(3);
    public final String IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final accessgetTvSatelliteCscp read;
    public final boolean write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 1, this.IconCompatParcelizer);
        accessgetTvSatelliteCscp accessgettvsatellitecscp = this.read;
        if (accessgettvsatellitecscp == null) {
            SentryLogcatAdapter.IconCompatParcelizer("GoogleCertificatesQuery", "certificate binder is null");
            accessgettvsatellitecscp = null;
        }
        SQLite.write(parcel, 2, accessgettvsatellitecscp);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.write ? 1 : 0);
        SQLite.serializer(i2, parcel);
    }

    public zzt(String str, IBinder iBinder, boolean z, boolean z2) {
        this.IconCompatParcelizer = str;
        accessgetTvSatelliteCscp accessgettvsatellitecscp = null;
        if (iBinder != null) {
            try {
                int i = zzj.RemoteActionCompatParcelizer;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                accessgetTwocp accessgettwocpZzd = (iInterfaceQueryLocalInterface instanceof accessgetToggle2D3Dcp ? (accessgetToggle2D3Dcp) iInterfaceQueryLocalInterface : new accessgetThumbsUpcp(iBinder, "com.google.android.gms.common.internal.ICertData")).zzd();
                byte[] bArr = accessgettwocpZzd == null ? null : (byte[]) ObjectWrapper.unwrap(accessgettwocpZzd);
                if (bArr != null) {
                    accessgettvsatellitecscp = new accessgetTvSatelliteCscp(bArr);
                } else {
                    SentryLogcatAdapter.serializer("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                SentryLogcatAdapter.read("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.read = accessgettvsatellitecscp;
        this.RemoteActionCompatParcelizer = z;
        this.write = z2;
    }

    public zzt(String str, accessgetTvSatelliteCscp accessgettvsatellitecscp, boolean z, boolean z2) {
        this.IconCompatParcelizer = str;
        this.read = accessgettvsatellitecscp;
        this.RemoteActionCompatParcelizer = z;
        this.write = z2;
    }
}
