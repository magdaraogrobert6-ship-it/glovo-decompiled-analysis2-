package o;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzdd;
import com.google.android.gms.internal.location.zzdz;

/* JADX INFO: loaded from: classes4.dex */
public final class getMediaPlayEK5gGoQ extends getMediaRecordEK5gGoQ {
    public getMediaPlayEK5gGoQ(accessgetNumPad6cp accessgetnumpad6cp) {
        super(accessgetnumpad6cp);
    }

    @Override // o.accessgetNumPadDotcp
    public final void RemoteActionCompatParcelizer(accessgetScp accessgetscp) throws RemoteException {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImplsIconCompatParcelizer = getMediaTopMenuEK5gGoQ.IconCompatParcelizer(this);
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) ((zzdz) accessgetscp).MediaSessionCompatResultReceiverWrapper();
        zzdd zzddVar = new zzdd(null, parentDataModifierDefaultImplsIconCompatParcelizer);
        Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
        int i = getMinusEK5gGoQ.IconCompatParcelizer;
        parcelZza.writeStrongBinder(zzddVar.asBinder());
        getnumpaddeleteek5ggoq.zzc(67, parcelZza);
    }
}
