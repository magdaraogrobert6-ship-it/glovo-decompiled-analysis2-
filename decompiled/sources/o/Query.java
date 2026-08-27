package o;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.mapbox.common.module.MapboxHttpClient$$ExternalSyntheticLambda2;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class Query extends ProtoPrerequisiteMsgserializer {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ Query(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final void IconCompatParcelizer(int i, String str, String str2, Throwable th) throws Throwable {
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        str2.getClass();
        if (i3 != 0) {
            if (th instanceof CancellationException) {
                throw th;
            }
            return;
        }
        if (i != 2) {
            int i4 = write + 117;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (i != 3) {
                CrashlyticsCore crashlyticsCore = set_measureResult.read().serializer;
                crashlyticsCore.RatingCompat.read.serializer(new MapboxHttpClient$$ExternalSyntheticLambda2(crashlyticsCore, System.currentTimeMillis() - crashlyticsCore.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, str2, 1));
                if (str != null) {
                    int i6 = write + 99;
                    RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        set_measureResult.read().RemoteActionCompatParcelizer(RemoteMessageConst.Notification.TAG, str);
                        int i7 = 71 / 0;
                    } else {
                        set_measureResult.read().RemoteActionCompatParcelizer(RemoteMessageConst.Notification.TAG, str);
                    }
                }
                if (th == null || pauseWebviewIfNecessarylambda10.IconCompatParcelizer(th)) {
                    return;
                }
                CrashlyticsCore crashlyticsCore2 = set_measureResult.read().serializer;
                Map map = Collections.EMPTY_MAP;
                crashlyticsCore2.RatingCompat.read.serializer(new ND$$ExternalSyntheticLambda0(crashlyticsCore2, th));
                int i8 = write + 41;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 4 % 5;
                }
            }
        }
    }
}
