package o;

import android.webkit.JavascriptInterface;
import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class getPostOnViewCreatedAlpha {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final HelpCenterActivity RemoteActionCompatParcelizer;

    public getPostOnViewCreatedAlpha(HelpCenterActivity helpCenterActivity) {
        this.RemoteActionCompatParcelizer = helpCenterActivity;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        int i = 2 % 2;
        int i2 = write + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        this.RemoteActionCompatParcelizer.serializer(str);
        int i4 = IconCompatParcelizer + 21;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
