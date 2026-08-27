package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class onVisibilityChangeddefault extends getCalculatorEK5gGoQ implements onVisibilityChangedNodedefault {
    public onVisibilityChangeddefault(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementEventListener");
    }

    @Override // o.onVisibilityChangedNodedefault
    public final void IconCompatParcelizer(long j, Bundle bundle, String str, String str2) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcelSerializer, bundle);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(1, parcelSerializer);
    }
}
