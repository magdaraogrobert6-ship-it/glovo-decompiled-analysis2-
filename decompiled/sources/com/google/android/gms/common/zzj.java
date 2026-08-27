package com.google.android.gms.common;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Arrays;
import o.accessgetSystemNavigationDowncp;
import o.accessgetToggle2D3Dcp;
import o.accessgetTwocp;
import o.getButton11EK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzj extends zzb implements accessgetToggle2D3Dcp {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final int serializer;

    public final int hashCode() {
        return this.serializer;
    }

    @Override // o.accessgetToggle2D3Dcp
    public final int read() {
        return this.serializer;
    }

    public abstract byte[] write();

    public zzj(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(bArr.length == 25);
        this.serializer = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        accessgetTwocp accessgettwocpZzd;
        if (obj instanceof accessgetToggle2D3Dcp) {
            try {
                accessgetToggle2D3Dcp accessgettoggle2d3dcp = (accessgetToggle2D3Dcp) obj;
                if (accessgettoggle2d3dcp.read() == this.serializer && (accessgettwocpZzd = accessgettoggle2d3dcp.zzd()) != null) {
                    return Arrays.equals(write(), (byte[]) ObjectWrapper.unwrap(accessgettwocpZzd));
                }
            } catch (RemoteException e) {
                SentryLogcatAdapter.read("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    @Override // o.accessgetToggle2D3Dcp
    public final accessgetTwocp zzd() {
        return new ObjectWrapper(write());
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            accessgetTwocp accessgettwocpZzd = zzd();
            parcel2.writeNoException();
            getButton11EK5gGoQ.IconCompatParcelizer(parcel2, accessgettwocpZzd);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.serializer);
        return true;
    }
}
