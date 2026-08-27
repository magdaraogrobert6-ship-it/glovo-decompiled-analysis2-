package o;

import android.os.Build;
import com.huawei.hms.android.SystemUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class isPartiallyOffscreenInScrollParent {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static final String serializer() {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 31) {
            int i2 = RemoteActionCompatParcelizer + 61;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                String str = Build.SOC_MODEL;
                str.getClass();
                hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                throw null;
            }
            String str2 = Build.SOC_MODEL;
            str2.getClass();
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                int i3 = write + 17;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return str2;
                }
                throw null;
            }
        }
        String str3 = Build.HARDWARE;
        Object[] objArr = {str3, SystemUtils.UNKNOWN};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            str3.getClass();
            return str3;
        }
        String str4 = Build.BOARD;
        str4.getClass();
        int i4 = RemoteActionCompatParcelizer + 25;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str4;
    }
}
