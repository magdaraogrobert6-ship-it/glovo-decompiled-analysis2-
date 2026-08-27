package o;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class getButton8EK5gGoQ extends getCalculatorEK5gGoQ implements getButtonR1EK5gGoQ {
    public getButton8EK5gGoQ(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    @Override // o.getButtonR1EK5gGoQ
    public final void RemoteActionCompatParcelizer(String str, boolean z) {
        Parcel parcelSerializer = serializer();
        ClassLoader classLoader = getDirectionCenterEK5gGoQ.write;
        parcelSerializer.writeInt(z ? 1 : 0);
        parcelSerializer.writeString(str);
        try {
            this.serializer.transact(1, parcelSerializer, null, 1);
        } finally {
            parcelSerializer.recycle();
        }
    }
}
