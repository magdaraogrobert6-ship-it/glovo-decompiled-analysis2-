package o;

import android.os.RemoteException;
import com.google.android.gms.internal.location.zzdz;

/* JADX INFO: loaded from: classes4.dex */
public final class getMediaRewindEK5gGoQ extends getMediaRecordEK5gGoQ {
    public final /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMediaRewindEK5gGoQ(accessgetNumPad6cp accessgetnumpad6cp, boolean z) {
        super(accessgetnumpad6cp);
        this.write = z;
    }

    @Override // o.accessgetNumPadDotcp
    public final /* synthetic */ void RemoteActionCompatParcelizer(accessgetScp accessgetscp) throws RemoteException {
        zzdz zzdzVar = (zzdz) accessgetscp;
        if (this.write) {
            zzdzVar.serializer(getMediaTopMenuEK5gGoQ.IconCompatParcelizer(this));
        } else {
            zzdzVar.read(getMediaTopMenuEK5gGoQ.IconCompatParcelizer(this));
        }
    }
}
