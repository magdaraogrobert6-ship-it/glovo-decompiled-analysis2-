package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class getProgramGreenEK5gGoQ extends getPairingEK5gGoQ implements getQEK5gGoQ {
    public getProgramGreenEK5gGoQ(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // o.getQEK5gGoQ
    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, bundle);
        IconCompatParcelizer(1, parcelSerializer);
    }
}
