package o;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class drawOutlinewDX37Ww {
    static {
        setRotationX.IconCompatParcelizer("PackageManagerHelper");
    }

    public static void RemoteActionCompatParcelizer(Context context, Class cls, boolean z) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            if (z == (componentEnabledSetting != 0 && componentEnabledSetting == 1)) {
                setRotationX.read().getClass();
            } else {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
                setRotationX.read().getClass();
            }
        } catch (Exception unused) {
            setRotationX.read().getClass();
        }
    }
}
