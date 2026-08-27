package o;

import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class access1000 {
    private static int serializer = 1;
    private static int write;
    public final decode IconCompatParcelizer;
    public final WebViewBuilderException RemoteActionCompatParcelizer;
    public final getError read;

    public access1000(decode decodeVar, WebViewBuilderException webViewBuilderException, getError geterror) {
        decodeVar.getClass();
        webViewBuilderException.getClass();
        geterror.getClass();
        this.IconCompatParcelizer = decodeVar;
        this.RemoteActionCompatParcelizer = webViewBuilderException;
        this.read = geterror;
    }

    public final LinkedHashMap IconCompatParcelizer(PushAnalyticsData pushAnalyticsData) {
        String strSerializer;
        String str;
        String strIconCompatParcelizer;
        String str2;
        int i = 2 % 2;
        int i2 = write + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (pushAnalyticsData != null) {
            int i5 = i3 + 101;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                pushAnalyticsData.serializer();
                throw null;
            }
            strSerializer = pushAnalyticsData.serializer();
        } else {
            strSerializer = null;
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("campaign_id", strSerializer);
        if (pushAnalyticsData != null) {
            int i6 = write + 79;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            str = (String) PushAnalyticsData.RemoteActionCompatParcelizer(UserPropertiesSerializer.read(), UserPropertiesSerializer.read(), -394501910, UserPropertiesSerializer.read(), UserPropertiesSerializer.read(), new Object[]{pushAnalyticsData}, 394501910);
        } else {
            int i8 = write + 81;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 2 / 4;
            }
            str = null;
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("execution_id", str);
        if (pushAnalyticsData != null) {
            int i10 = write + 73;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            strIconCompatParcelizer = pushAnalyticsData.IconCompatParcelizer();
        } else {
            strIconCompatParcelizer = null;
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("message_new_id", strIconCompatParcelizer);
        if (pushAnalyticsData != null) {
            str2 = (String) PushAnalyticsData.RemoteActionCompatParcelizer(UserPropertiesSerializer.read(), UserPropertiesSerializer.read(), 1807034167, UserPropertiesSerializer.read(), UserPropertiesSerializer.read(), new Object[]{pushAnalyticsData}, -1807034166);
            int i12 = write + 15;
            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
        } else {
            str2 = null;
        }
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, new onViewAttachedToWindowlambda0("notification_id", str2), new onViewAttachedToWindowlambda0("template_name", pushAnalyticsData != null ? pushAnalyticsData.MediaBrowserCompatMediaItem() : null), new onViewAttachedToWindowlambda0("template_id", pushAnalyticsData != null ? pushAnalyticsData.read() : null), new onViewAttachedToWindowlambda0("is_app_in_foreground", Boolean.valueOf(this.RemoteActionCompatParcelizer.read())), new onViewAttachedToWindowlambda0("rider_id", ((getLiveRegiondelegate) this.read).serializer()));
        LinkedHashMap linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(mapRemoteActionCompatParcelizer.size()));
        for (Map.Entry entry : mapRemoteActionCompatParcelizer.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String string = value != null ? value.toString() : null;
            if (string == null) {
                string = "";
            }
            linkedHashMap.put(key, string);
        }
        return linkedHashMap;
    }
}
