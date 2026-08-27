package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class removeSingleSubscriptionlambda101 {
    private static int read = 0;
    private static int serializer = 1;
    public final decode RemoteActionCompatParcelizer;

    public removeSingleSubscriptionlambda101(decode decodeVar, int i) {
        decodeVar.getClass();
        if (i != 4) {
            this.RemoteActionCompatParcelizer = decodeVar;
        } else {
            this.RemoteActionCompatParcelizer = decodeVar;
        }
    }

    public /* synthetic */ removeSingleSubscriptionlambda101(decode decodeVar, byte b) {
        this.RemoteActionCompatParcelizer = decodeVar;
    }

    public void IconCompatParcelizer(requestBannersRefreshlambda0 requestbannersrefreshlambda0, boolean z, String str) {
        int i = 2 % 2;
        requestbannersrefreshlambda0.getClass();
        LinkedHashMap linkedHashMapIconCompatParcelizer = onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0("reason", requestbannersrefreshlambda0.getValue()), new onViewAttachedToWindowlambda0("is_app_background", String.valueOf(z)));
        if (str != null) {
            int i2 = serializer + 43;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                linkedHashMapIconCompatParcelizer.put("error_code", str);
                throw null;
            }
            linkedHashMapIconCompatParcelizer.put("error_code", str);
            int i3 = read + 83;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        this.RemoteActionCompatParcelizer.logEvent("tnc_consent_webview_closed", linkedHashMapIconCompatParcelizer);
    }
}
