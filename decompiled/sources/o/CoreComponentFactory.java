package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class CoreComponentFactory {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final decode serializer;

    public CoreComponentFactory(decode decodeVar) {
        this.serializer = decodeVar;
    }

    public final void IconCompatParcelizer(String str, Map map) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer.logEvent(str, map);
        int i4 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void read(onServiceConnected onserviceconnected, String str, String str2, String str3) {
        int i;
        String str4;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0 ? (i = superDispatchKeyEvent.RemoteActionCompatParcelizer[onserviceconnected.ordinal()]) == 1 : (i = superDispatchKeyEvent.RemoteActionCompatParcelizer[onserviceconnected.ordinal()]) == 0) {
            str4 = "work_now";
        } else if (i != 2) {
            int i4 = IconCompatParcelizer + 89;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i5;
            if (i4 % 2 == 0) {
                if (i == 4) {
                    return;
                }
            } else if (i == 3) {
                return;
            }
            int i6 = i5 + 97;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            str4 = "neither work_now nor fill_rate. this should not happen";
        } else {
            str4 = "fill_rate";
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("zone_id", str);
        if (str3 == null) {
            str3 = "";
        }
        IconCompatParcelizer(str2, onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, new onViewAttachedToWindowlambda0("bonus_applied", str3), new onViewAttachedToWindowlambda0("trigger_reason", str4)));
    }
}
