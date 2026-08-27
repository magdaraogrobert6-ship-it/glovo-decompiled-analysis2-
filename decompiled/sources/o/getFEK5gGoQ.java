package o;

import android.os.Build;
import com.google.android.gms.internal.gtm.zzbv;

/* JADX INFO: loaded from: classes2.dex */
public final class getFEK5gGoQ implements getDirectionDownEK5gGoQ {
    public final /* synthetic */ int IconCompatParcelizer;
    public final String write;

    @Override // o.getDirectionDownEK5gGoQ
    public final getFunctionEK5gGoQ RemoteActionCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        int i = this.IconCompatParcelizer;
        String str = this.write;
        if (i != 0) {
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
            return new getInfoEK5gGoQ(str);
        }
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
        return new getInfoEK5gGoQ(str);
    }

    public getFEK5gGoQ(int i) {
        this.IconCompatParcelizer = i;
        if (i != 1) {
            this.write = Build.BRAND;
        } else {
            this.write = Build.MODEL;
        }
    }
}
