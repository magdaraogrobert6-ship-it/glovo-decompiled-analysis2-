package o;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.GeofencingRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class getMetaRightEK5gGoQ extends getMetaLeftEK5gGoQ {
    public final /* synthetic */ PendingIntent ParcelableVolumeInfo;
    public final /* synthetic */ GeofencingRequest write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMetaRightEK5gGoQ(accessgetNumPad6cp accessgetnumpad6cp, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(accessgetnumpad6cp);
        this.write = geofencingRequest;
        this.ParcelableVolumeInfo = pendingIntent;
    }

    @Override // o.accessgetNumPadDotcp
    public final void RemoteActionCompatParcelizer(accessgetScp accessgetscp) throws RemoteException {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        parentDataModifierDefaultImpls.RemoteActionCompatParcelizer.addOnCompleteListener(new getExponentimpl(29, this));
        ((zzdz) accessgetscp).IconCompatParcelizer(this.write, this.ParcelableVolumeInfo, parentDataModifierDefaultImpls);
    }
}
