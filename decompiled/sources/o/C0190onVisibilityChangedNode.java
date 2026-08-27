package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: o.onVisibilityChangedNode, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0190onVisibilityChangedNode extends getCalculatorEK5gGoQ implements onUnplaced {
    public C0190onVisibilityChangedNode(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementInterceptor");
    }

    @Override // o.onUnplaced
    public final void write(long j, Bundle bundle, String str, String str2) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcelSerializer, bundle);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(2, parcelSerializer);
    }
}
