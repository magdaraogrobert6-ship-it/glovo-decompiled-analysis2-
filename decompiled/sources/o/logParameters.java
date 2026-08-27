package o;

import android.os.Bundle;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;

/* JADX INFO: loaded from: classes3.dex */
public final class logParameters {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static CloseableKt serializer(Bundle bundle) {
        int i = 2 % 2;
        CloseableKt closeableKt = new CloseableKt(bundle.getString(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY), bundle.getString("message"), bundle.getString("category"), bundle.getBoolean("syncState", false), bundle.getString("newDeliveryId"), bundle.getString("messageId"), (PushAnalyticsData) bundle.getParcelable("analytics_data"), bundle.getString("pushSourceTrigger"));
        int i2 = IconCompatParcelizer + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return closeableKt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
