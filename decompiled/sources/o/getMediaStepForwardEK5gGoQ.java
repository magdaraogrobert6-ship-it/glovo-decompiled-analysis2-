package o;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LocationListener;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getMediaStepForwardEK5gGoQ implements accessgetNumPadRightParenthesiscp, accessgetNumPadInsertcp {
    public final /* synthetic */ Location read;

    public /* synthetic */ getMediaStepForwardEK5gGoQ(Location location) {
        this.read = location;
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public /* synthetic */ void serializer(Object obj, Object obj2) throws RemoteException {
        ((zzdz) obj).serializer(this.read, (ParentDataModifierDefaultImpls) obj2);
    }

    @Override // o.accessgetNumPadInsertcp
    public /* synthetic */ void write(Object obj) {
        ((LocationListener) obj).onLocationChanged(this.read);
    }
}
