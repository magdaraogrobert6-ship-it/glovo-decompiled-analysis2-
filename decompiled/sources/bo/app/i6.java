package bo.app;

import android.net.Uri;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public abstract class i6 {
    public static String a(String str, String str2, String str3, String str4, int i) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "http://", false) && !setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "https://", false)) {
            str = "https://".concat(str);
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendPath("sse");
        builderBuildUpon.appendQueryParameter("mite", str2);
        builderBuildUpon.appendQueryParameter("auth", str3);
        builderBuildUpon.appendQueryParameter("attempts", String.valueOf(i));
        if (str4 != null) {
            builderBuildUpon.appendQueryParameter("rcs", str4);
        }
        String string = builderBuildUpon.build().toString();
        string.getClass();
        return string;
    }
}
