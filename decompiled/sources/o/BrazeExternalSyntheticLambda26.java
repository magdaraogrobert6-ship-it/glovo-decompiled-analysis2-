package o;

import android.net.Uri;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeExternalSyntheticLambda26 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final BrazeExternalSyntheticLambda206 IconCompatParcelizer;
    public final r8lambdaLZjsjPSXWRendXZH98LKrH6PSs serializer;

    public BrazeExternalSyntheticLambda26(BrazeExternalSyntheticLambda206 brazeExternalSyntheticLambda206, r8lambdaLZjsjPSXWRendXZH98LKrH6PSs r8lambdalzjsjpsxwrendxzh98lkrh6pss) {
        brazeExternalSyntheticLambda206.getClass();
        r8lambdalzjsjpsxwrendxzh98lkrh6pss.getClass();
        this.IconCompatParcelizer = brazeExternalSyntheticLambda206;
        this.serializer = r8lambdalzjsjpsxwrendxzh98lkrh6pss;
    }

    public final void write(androidx.fragment.app.FragmentActivity fragmentActivity, div7Ah8Wj8 div7ah8wj8, Uri uri, String str, String str2) {
        String strReplaceAll;
        int i = 2 % 2;
        fragmentActivity.getClass();
        uri.getClass();
        str.getClass();
        str2.getClass();
        String queryParameter = uri.getQueryParameter("url");
        Object obj = null;
        if (queryParameter != null) {
            int i2 = read + 107;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                Pattern patternCompile = Pattern.compile("^\"|\"$");
                patternCompile.getClass();
                patternCompile.matcher(queryParameter).replaceAll("").getClass();
                obj.hashCode();
                throw null;
            }
            Pattern patternCompile2 = Pattern.compile("^\"|\"$");
            patternCompile2.getClass();
            strReplaceAll = patternCompile2.matcher(queryParameter).replaceAll("");
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        if (strReplaceAll != null) {
            BrazeExternalSyntheticLambda206 brazeExternalSyntheticLambda206 = this.IconCompatParcelizer;
            brazeExternalSyntheticLambda206.getClass();
            Uri.Builder builderBuildUpon = Uri.parse(strReplaceAll).buildUpon();
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) brazeExternalSyntheticLambda206.RemoteActionCompatParcelizer;
            firebaseRemoteConfigImpl.getClass();
            if (!firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.IS_WEBVIEW_HEADER_HIDING_ENABLED)) {
                int i3 = read + 85;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    builderBuildUpon.appendQueryParameter("nested_mode", "true");
                    obj.hashCode();
                    throw null;
                }
                builderBuildUpon.appendQueryParameter("nested_mode", "true");
            }
            String string = builderBuildUpon.build().toString();
            string.getClass();
            r8lambdaLZjsjPSXWRendXZH98LKrH6PSs.read(this.serializer, fragmentActivity, div7ah8wj8, str, string, str2, str2);
        }
    }
}
