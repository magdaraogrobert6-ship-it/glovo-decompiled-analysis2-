package o;

import com.google.android.gms.internal.gtm.zzbv;
import io.grpc.LoadBalancer$Helper;

/* JADX INFO: loaded from: classes2.dex */
public final class getEightEK5gGoQ extends getDirectionDownRightEK5gGoQ {
    public final getCEK5gGoQ IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ getEightEK5gGoQ(getCEK5gGoQ getcek5ggoq, int i) {
        this.write = i;
        this.IconCompatParcelizer = getcek5ggoq;
    }

    @Override // o.getDirectionDownRightEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        getFunctionEK5gGoQ getfunctionek5ggoq;
        int i = this.write;
        getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.read;
        getCEK5gGoQ getcek5ggoq = this.IconCompatParcelizer;
        if (i == 0) {
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
            getcek5ggoq.RemoteActionCompatParcelizer.PlaybackStateCompat.MediaMetadataCompat = false;
            return gethelpek5ggoq;
        }
        if (i != 1) {
            if (i == 2) {
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
                return androidx.room.Room.IconCompatParcelizer(getcek5ggoq.RemoteActionCompatParcelizer.PlaybackStateCompat.write);
            }
            int length = getfunctionek5ggoqArr.length;
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(length > 0);
            Object obj = getcek5ggoq.RemoteActionCompatParcelizer.PlaybackStateCompat.write().get(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[0]));
            Object obj2 = obj;
            obj2 = obj;
            if (obj == null && length > 1) {
                obj2 = getfunctionek5ggoqArr[1];
            }
            return androidx.room.Room.IconCompatParcelizer(obj2);
        }
        int length2 = getfunctionek5ggoqArr.length;
        if (length2 == 0 || getfunctionek5ggoqArr[0] == gethelpek5ggoq) {
            return new getInfoEK5gGoQ("");
        }
        Object obj3 = getcek5ggoq.RemoteActionCompatParcelizer.PlaybackStateCompat.write().get("_ldl");
        if (obj3 == null) {
            return new getInfoEK5gGoQ("");
        }
        getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer = androidx.room.Room.IconCompatParcelizer(obj3);
        if (!(getfunctionek5ggoqIconCompatParcelizer instanceof getInfoEK5gGoQ)) {
            return new getInfoEK5gGoQ("");
        }
        String str = ((getInfoEK5gGoQ) getfunctionek5ggoqIconCompatParcelizer).RemoteActionCompatParcelizer;
        if (!getButtonR2EK5gGoQ.RemoteActionCompatParcelizer(str, "conv").equals(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[0]))) {
            return new getInfoEK5gGoQ("");
        }
        String strRemoteActionCompatParcelizer = getButtonR2EK5gGoQ.RemoteActionCompatParcelizer(str, (length2 <= 1 || (getfunctionek5ggoq = getfunctionek5ggoqArr[1]) == gethelpek5ggoq) ? null : LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq));
        return strRemoteActionCompatParcelizer != null ? new getInfoEK5gGoQ(strRemoteActionCompatParcelizer) : new getInfoEK5gGoQ("");
    }
}
