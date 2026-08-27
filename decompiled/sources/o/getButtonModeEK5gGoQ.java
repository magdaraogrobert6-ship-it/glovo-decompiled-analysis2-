package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class getButtonModeEK5gGoQ extends getCalculatorEK5gGoQ implements getButtonL2EK5gGoQ {
    @Override // o.getButtonL2EK5gGoQ
    public final void IconCompatParcelizer() {
        IconCompatParcelizer(3, serializer());
    }

    public getButtonModeEK5gGoQ(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    @Override // o.getButtonL2EK5gGoQ
    public final void RemoteActionCompatParcelizer() {
        IconCompatParcelizer(102, serializer());
    }

    @Override // o.getButtonL2EK5gGoQ
    public final void IconCompatParcelizer(String str, Bundle bundle, String str2, long j, boolean z) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcelSerializer, bundle);
        parcelSerializer.writeString(str2);
        parcelSerializer.writeLong(j);
        parcelSerializer.writeInt(z ? 1 : 0);
        IconCompatParcelizer(101, parcelSerializer);
    }

    @Override // o.getButtonL2EK5gGoQ
    public final void RemoteActionCompatParcelizer(String str, String str2, String str3, getButtonR1EK5gGoQ getbuttonr1ek5ggoq) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        parcelSerializer.writeString(null);
        getDirectionCenterEK5gGoQ.write(parcelSerializer, getbuttonr1ek5ggoq);
        IconCompatParcelizer(2, parcelSerializer);
    }
}
