package o;

import android.content.pm.PackageInfo;
import android.media.ImageReader;
import android.webkit.WebView;
import com.huawei.location.ut;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambda4MdKbfiHpQQwW57A4NP6ZCybbFA {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static ut IconCompatParcelizer(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        ut utVar = new ut(ImageReader.newInstance(i, i2, i3, i4));
        int i6 = RemoteActionCompatParcelizer + 77;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return utVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    public static final boolean write() {
        boolean z;
        int i = 2 % 2;
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        String str = null;
        if (currentWebViewPackage != null) {
            int i2 = write + 111;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                String str2 = currentWebViewPackage.packageName;
                throw null;
            }
            str = currentWebViewPackage.packageName;
            int i3 = RemoteActionCompatParcelizer + 39;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 3 / 4;
            }
        }
        if (str != null) {
            int i5 = write + 115;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return !z;
    }
}
