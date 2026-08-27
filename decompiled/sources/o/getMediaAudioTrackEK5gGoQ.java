package o;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class getMediaAudioTrackEK5gGoQ extends getMediaNextEK5gGoQ {
    public final /* synthetic */ PendingIntent MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMediaAudioTrackEK5gGoQ(accessgetNumPad6cp accessgetnumpad6cp, long j, PendingIntent pendingIntent) {
        super(accessgetnumpad6cp);
        this.write = j;
        this.MediaSessionCompatResultReceiverWrapper = pendingIntent;
    }

    @Override // o.accessgetNumPadDotcp
    public final void RemoteActionCompatParcelizer(accessgetScp accessgetscp) throws RemoteException {
        getNumPadAddEK5gGoQ getnumpadaddek5ggoq = (getNumPadAddEK5gGoQ) accessgetscp;
        PendingIntent pendingIntent = this.MediaSessionCompatResultReceiverWrapper;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(pendingIntent);
        long j = this.write;
        accessgetSystemNavigationDowncp.write("detectionIntervalMillis must be >= 0", j >= 0);
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) getnumpadaddek5ggoq.MediaSessionCompatResultReceiverWrapper();
        Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
        parcelZza.writeLong(j);
        int i = getMinusEK5gGoQ.IconCompatParcelizer;
        parcelZza.writeInt(1);
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, pendingIntent);
        getnumpaddeleteek5ggoq.zzc(5, parcelZza);
        write((accessgetNumPadCommacp) Status.IconCompatParcelizer);
    }
}
