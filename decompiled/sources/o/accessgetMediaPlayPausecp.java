package o;

import android.util.SparseArray;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetMediaPlayPausecp {
    public static final SparseArray RemoteActionCompatParcelizer = new SparseArray();
    public static final HashMap read;

    static {
        HashMap map = new HashMap();
        read = map;
        map.put(accessgetBrowsercp.DEFAULT, 0);
        map.put(accessgetBrowsercp.VERY_LOW, 1);
        map.put(accessgetBrowsercp.HIGHEST, 2);
        for (accessgetBrowsercp accessgetbrowsercp : map.keySet()) {
            RemoteActionCompatParcelizer.append(((Integer) read.get(accessgetbrowsercp)).intValue(), accessgetbrowsercp);
        }
    }

    public static int serializer(accessgetBrowsercp accessgetbrowsercp) {
        Integer num = (Integer) read.get(accessgetbrowsercp);
        if (num != null) {
            return num.intValue();
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(accessgetbrowsercp, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static accessgetBrowsercp write(int i) {
        accessgetBrowsercp accessgetbrowsercp = (accessgetBrowsercp) RemoteActionCompatParcelizer.get(i);
        if (accessgetbrowsercp != null) {
            return accessgetbrowsercp;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Unknown Priority for value "));
        return null;
    }
}
