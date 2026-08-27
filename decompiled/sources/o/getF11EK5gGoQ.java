package o;

import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzbv;

/* JADX INFO: loaded from: classes2.dex */
public final class getF11EK5gGoQ extends getDirectionDownRightEK5gGoQ {
    public final setLastReportedResult RemoteActionCompatParcelizer;
    public final getCEK5gGoQ read;

    public getF11EK5gGoQ(setLastReportedResult setlastreportedresult, getCEK5gGoQ getcek5ggoq) {
        this.RemoteActionCompatParcelizer = setlastreportedresult;
        this.read = getcek5ggoq;
    }

    @Override // o.getDirectionDownRightEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        boolean z;
        int length = getfunctionek5ggoqArr.length;
        boolean z2 = true;
        if (length == 1) {
            z = true;
        } else if (length == 2) {
            length = 2;
            z = true;
        } else {
            z = false;
        }
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(z);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getInfoEK5gGoQ);
        getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.read;
        getFunctionEK5gGoQ getfunctionek5ggoq = length > 1 ? getfunctionek5ggoqArr[1] : gethelpek5ggoq;
        if (getfunctionek5ggoq != gethelpek5ggoq && !(getfunctionek5ggoq instanceof getHomeEK5gGoQ)) {
            z2 = false;
        }
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(z2);
        getButton3EK5gGoQ getbutton3ek5ggoq = this.read.RemoteActionCompatParcelizer.PlaybackStateCompat;
        try {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getbutton3ek5ggoq.RemoteActionCompatParcelizer.getTime(), getfunctionek5ggoq != gethelpek5ggoq ? androidx.room.Room.read(((getHomeEK5gGoQ) getfunctionek5ggoq).write) : null, getbutton3ek5ggoq.IconCompatParcelizer, ((getInfoEK5gGoQ) getfunctionek5ggoqArr[0]).RemoteActionCompatParcelizer);
            return gethelpek5ggoq;
        } catch (RemoteException e) {
            getButtonThumbLeftEK5gGoQ.write("Error calling measurement proxy:".concat(String.valueOf(e.getMessage())));
            return gethelpek5ggoq;
        }
    }
}
