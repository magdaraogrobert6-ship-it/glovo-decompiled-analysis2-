package o;

import com.google.android.gms.internal.gtm.zzbv;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getDirectionDownRightEK5gGoQ implements getDirectionDownEK5gGoQ {
    public abstract getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr);

    @Override // o.getDirectionDownEK5gGoQ
    public final getFunctionEK5gGoQ RemoteActionCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
        getFunctionEK5gGoQ[] getfunctionek5ggoqArr2 = new getFunctionEK5gGoQ[getfunctionek5ggoqArr.length];
        for (int i = 0; i < getfunctionek5ggoqArr.length; i++) {
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[i] != null);
            getFunctionEK5gGoQ getfunctionek5ggoq = getfunctionek5ggoqArr[i];
            getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.IconCompatParcelizer;
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq != gethelpek5ggoq);
            getFunctionEK5gGoQ getfunctionek5ggoq2 = getfunctionek5ggoqArr[i];
            getHelpEK5gGoQ gethelpek5ggoq2 = getHelpEK5gGoQ.RemoteActionCompatParcelizer;
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq2 != gethelpek5ggoq2);
            getFunctionEK5gGoQ getfunctionek5ggoqRemoteActionCompatParcelizer = androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqArr[i]);
            getfunctionek5ggoqArr2[i] = getfunctionek5ggoqRemoteActionCompatParcelizer;
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqRemoteActionCompatParcelizer != gethelpek5ggoq);
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr2[i] != gethelpek5ggoq2);
        }
        getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer = IconCompatParcelizer(zzbvVar, getfunctionek5ggoqArr2);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getfunctionek5ggoqIconCompatParcelizer != null);
        return getfunctionek5ggoqIconCompatParcelizer;
    }
}
