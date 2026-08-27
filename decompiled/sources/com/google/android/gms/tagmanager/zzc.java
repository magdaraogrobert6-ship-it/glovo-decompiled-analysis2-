package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import coil3.Extras$Key;
import com.google.android.gms.internal.gtm.zzd;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Map;
import o.C0190onVisibilityChangedNode;
import o.OnSizeChangedNode;
import o.getDirectionCenterEK5gGoQ;
import o.onUnplaced;
import o.onVisibilityChangedNodedefault;
import o.onVisibilityChangeddefault;
import o.setLastReportedResult;

/* JADX INFO: loaded from: classes4.dex */
public final class zzc extends zzd implements setLastReportedResult {
    public final /* synthetic */ AppMeasurement serializer;

    @Override // o.setLastReportedResult
    public final Map IconCompatParcelizer() {
        return this.serializer.write.MediaDescriptionCompat();
    }

    @Override // o.setLastReportedResult
    public final void RemoteActionCompatParcelizer(long j, Bundle bundle, String str, String str2) {
        this.serializer.write.write(j, bundle, str, str2);
    }

    @Override // o.setLastReportedResult
    public final void RemoteActionCompatParcelizer(onVisibilityChangedNodedefault onvisibilitychangednodedefault) {
        this.serializer.write.RemoteActionCompatParcelizer(new OnSizeChangedNode(0, onvisibilitychangednodedefault));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(AppMeasurement appMeasurement) {
        super("com.google.android.gms.tagmanager.IMeasurementProxy");
        this.serializer = appMeasurement;
    }

    @Override // o.setLastReportedResult
    public final void read(onUnplaced onunplaced) {
        this.serializer.write.RemoteActionCompatParcelizer(new Extras$Key(26, onunplaced));
    }

    @Override // com.google.android.gms.internal.gtm.zzd
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) getDirectionCenterEK5gGoQ.serializer(parcel, Bundle.CREATOR);
            long j = parcel.readLong();
            getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
            RemoteActionCompatParcelizer(j, bundle, string, string2);
            parcel2.writeNoException();
            return true;
        }
        if (i == 11) {
            Map mapIconCompatParcelizer = IconCompatParcelizer();
            parcel2.writeNoException();
            parcel2.writeMap(mapIconCompatParcelizer);
            return true;
        }
        onUnplaced c0190onVisibilityChangedNode = null;
        onVisibilityChangedNodedefault onvisibilitychangeddefault = null;
        if (i == 21) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementInterceptor");
                if (iInterfaceQueryLocalInterface instanceof onUnplaced) {
                    c0190onVisibilityChangedNode = (onUnplaced) iInterfaceQueryLocalInterface;
                } else {
                    c0190onVisibilityChangedNode = new C0190onVisibilityChangedNode(strongBinder);
                }
            }
            getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
            read(c0190onVisibilityChangedNode);
            parcel2.writeNoException();
            return true;
        }
        if (i != 22) {
            return false;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementEventListener");
            if (iInterfaceQueryLocalInterface2 instanceof onVisibilityChangedNodedefault) {
                onvisibilitychangeddefault = (onVisibilityChangedNodedefault) iInterfaceQueryLocalInterface2;
            } else {
                onvisibilitychangeddefault = new onVisibilityChangeddefault(strongBinder2);
            }
        }
        getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcel);
        RemoteActionCompatParcelizer(onvisibilitychangeddefault);
        parcel2.writeNoException();
        return true;
    }
}
