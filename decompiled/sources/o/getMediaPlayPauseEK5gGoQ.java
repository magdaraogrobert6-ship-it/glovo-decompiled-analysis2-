package o;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class getMediaPlayPauseEK5gGoQ extends getMediaNextEK5gGoQ {
    public final /* synthetic */ PendingIntent write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMediaPlayPauseEK5gGoQ(accessgetNumPad6cp accessgetnumpad6cp, PendingIntent pendingIntent) {
        super(accessgetnumpad6cp);
        this.write = pendingIntent;
    }

    @Override // o.accessgetNumPadDotcp
    public final void RemoteActionCompatParcelizer(accessgetScp accessgetscp) throws RemoteException {
        getNumPadAddEK5gGoQ getnumpadaddek5ggoq = (getNumPadAddEK5gGoQ) accessgetscp;
        getnumpadaddek5ggoq.getClass();
        PendingIntent pendingIntent = this.write;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(pendingIntent);
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) getnumpadaddek5ggoq.MediaSessionCompatResultReceiverWrapper();
        Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, pendingIntent);
        getnumpaddeleteek5ggoq.zzc(6, parcelZza);
        write((accessgetNumPadCommacp) Status.IconCompatParcelizer);
    }
}
