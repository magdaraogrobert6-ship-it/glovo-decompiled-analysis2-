package o;

import android.app.Activity;
import fwfd.com.fwfsdk.constant.FWFConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessgetEntercp {
    public static boolean RemoteActionCompatParcelizer(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static final ddefault serializer(resolveOutlinePosition resolveoutlineposition) {
        resolveoutlineposition.getClass();
        String str = resolveoutlineposition.level;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3237038) {
                if (iHashCode != 96784904) {
                    if (iHashCode == 1124446108 && str.equals("warning")) {
                        return ddefault.serializer;
                    }
                } else if (str.equals(FWFConstants.EXPLANATION_TYPE_ERROR)) {
                    return ddefault.IconCompatParcelizer;
                }
            } else if (str.equals("info")) {
                return ddefault.RemoteActionCompatParcelizer;
            }
        }
        return ddefault.serializer;
    }
}
