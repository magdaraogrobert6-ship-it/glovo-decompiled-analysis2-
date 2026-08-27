package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class getRefreshEK5gGoQ extends getPairingEK5gGoQ implements getProgramYellowEK5gGoQ {
    @Override // o.getProgramYellowEK5gGoQ
    public final int IconCompatParcelizer() {
        Parcel parcelSerializer = serializer(2, serializer());
        int i = parcelSerializer.readInt();
        parcelSerializer.recycle();
        return i;
    }

    public getRefreshEK5gGoQ(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // o.getProgramYellowEK5gGoQ
    public final void serializer(long j, Bundle bundle, String str, String str2) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        getPageDownEK5gGoQ.read(parcelSerializer, bundle);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(1, parcelSerializer);
    }
}
