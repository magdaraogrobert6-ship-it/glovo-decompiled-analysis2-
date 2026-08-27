package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetTvInputcp {
    public static void write(io.sentry.rrweb.MediaDescriptionCompat mediaDescriptionCompat, OkHttpCall$1 okHttpCall$1, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        okHttpCall$1.write("source");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, mediaDescriptionCompat.RemoteActionCompatParcelizer);
    }

    public static int IconCompatParcelizer(Context context, String str) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageInfo = accessgetTvMediaContextMenucp.serializer(context).read(androidx.compose.ui.graphics.Fields.SpotShadowColor, str);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }
}
