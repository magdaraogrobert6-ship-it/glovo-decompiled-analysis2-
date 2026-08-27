package o;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes4.dex */
public final class getNEK5gGoQ extends accessgetNumPadDotcp {
    public final /* synthetic */ LocationSettingsRequest write;

    @Override // o.accessgetNumPadDotcp
    public final void RemoteActionCompatParcelizer(accessgetScp accessgetscp) throws RemoteException {
        LocationSettingsRequest locationSettingsRequest = this.write;
        accessgetSystemNavigationDowncp.write("locationSettingsRequest can't be null", locationSettingsRequest != null);
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) ((zzdz) accessgetscp).MediaSessionCompatResultReceiverWrapper();
        getMoveHomeEK5gGoQ getmovehomeek5ggoq = new getMoveHomeEK5gGoQ(1, this);
        Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, locationSettingsRequest);
        parcelZza.writeStrongBinder(getmovehomeek5ggoq.asBinder());
        parcelZza.writeString(null);
        getnumpaddeleteek5ggoq.zzc(63, parcelZza);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNEK5gGoQ(accessgetNumPad6cp accessgetnumpad6cp, LocationSettingsRequest locationSettingsRequest) {
        super(getMediaStopEK5gGoQ.RemoteActionCompatParcelizer, accessgetnumpad6cp);
        this.write = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ accessgetNumPadCommacp serializer(Status status) {
        return new LocationSettingsResult(status, null);
    }
}
