package o;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import bo.app.af$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.gtm.zzbv;
import com.huawei.hms.android.SystemUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class getEscapeEK5gGoQ implements getDirectionDownEK5gGoQ {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object read;

    public getEscapeEK5gGoQ(Context context) {
        this.RemoteActionCompatParcelizer = 1;
        this.IconCompatParcelizer = context;
        this.read = new DisplayMetrics();
    }

    @Override // o.getDirectionDownEK5gGoQ
    public final getFunctionEK5gGoQ RemoteActionCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        Object obj2 = this.IconCompatParcelizer;
        if (i == 0) {
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
            String str = (String) obj2;
            String strM = (String) obj;
            if (!strM.startsWith(str) && !str.equals(SystemUtils.UNKNOWN)) {
                strM = af$$ExternalSyntheticOutline0.m(str, " ", strM);
            }
            return new getInfoEK5gGoQ(strM);
        }
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr != null);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 0);
        DisplayMetrics displayMetrics = (DisplayMetrics) obj;
        ((WindowManager) ((Context) obj2).getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return new getInfoEK5gGoQ(displayMetrics.widthPixels + "x" + displayMetrics.heightPixels);
    }

    public getEscapeEK5gGoQ() {
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = Build.MANUFACTURER;
        this.read = Build.MODEL;
    }
}
