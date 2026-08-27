package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class OnVisibilityChangedNoderectChanged1 extends getCalculatorEK5gGoQ implements setLastReportedResult {
    public OnVisibilityChangedNoderectChanged1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    @Override // o.setLastReportedResult
    public final Map IconCompatParcelizer() {
        Parcel parcelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(11, serializer());
        HashMap hashMap = parcelRemoteActionCompatParcelizer.readHashMap(getDirectionCenterEK5gGoQ.write);
        parcelRemoteActionCompatParcelizer.recycle();
        return hashMap;
    }

    @Override // o.setLastReportedResult
    public final void RemoteActionCompatParcelizer(long j, Bundle bundle, String str, String str2) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeString(str2);
        getDirectionCenterEK5gGoQ.IconCompatParcelizer(parcelSerializer, bundle);
        parcelSerializer.writeLong(j);
        IconCompatParcelizer(2, parcelSerializer);
    }

    @Override // o.setLastReportedResult
    public final void RemoteActionCompatParcelizer(onVisibilityChangedNodedefault onvisibilitychangednodedefault) {
        Parcel parcelSerializer = serializer();
        getDirectionCenterEK5gGoQ.write(parcelSerializer, onvisibilitychangednodedefault);
        IconCompatParcelizer(22, parcelSerializer);
    }

    @Override // o.setLastReportedResult
    public final void read(onUnplaced onunplaced) {
        Parcel parcelSerializer = serializer();
        getDirectionCenterEK5gGoQ.write(parcelSerializer, onunplaced);
        IconCompatParcelizer(21, parcelSerializer);
    }
}
