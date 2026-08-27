package o;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoq;

/* JADX INFO: loaded from: classes4.dex */
public final class getNodeState extends getPairingEK5gGoQ implements LayoutNodeSubcompositionsStatesubcompose41composable1 {
    @Override // o.LayoutNodeSubcompositionsStatesubcompose41composable1
    public final void RemoteActionCompatParcelizer(zzoq zzoqVar) {
        Parcel parcelSerializer = serializer();
        getPageDownEK5gGoQ.read(parcelSerializer, zzoqVar);
        read(parcelSerializer);
    }

    public getNodeState(IBinder iBinder, String str) {
        super(iBinder, str);
    }
}
