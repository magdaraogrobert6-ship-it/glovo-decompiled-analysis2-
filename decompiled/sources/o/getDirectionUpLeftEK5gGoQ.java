package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;

/* JADX INFO: loaded from: classes2.dex */
public final class getDirectionUpLeftEK5gGoQ implements getDirectionDownEK5gGoQ {
    @Override // o.getDirectionDownEK5gGoQ
    public final getFunctionEK5gGoQ RemoteActionCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getInfoEK5gGoQ);
        getFunctionEK5gGoQ getfunctionek5ggoq = zzbvVar.read(((getInfoEK5gGoQ) getfunctionek5ggoqArr[0]).RemoteActionCompatParcelizer);
        if (!(getfunctionek5ggoq instanceof getIEK5gGoQ)) {
            if (!(getfunctionek5ggoq instanceof getHelpEK5gGoQ) || getfunctionek5ggoq == getHelpEK5gGoQ.read || getfunctionek5ggoq == getHelpEK5gGoQ.serializer) {
                return getfunctionek5ggoq;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Illegal InternalType encountered in Get.");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Illegal Statement type encountered in Get.");
        return null;
    }
}
