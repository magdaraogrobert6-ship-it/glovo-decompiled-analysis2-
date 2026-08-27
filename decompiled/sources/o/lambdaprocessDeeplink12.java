package o;

import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import io.grpc.internal.SharedResourcePool;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaprocessDeeplink12 extends androidx.lifecycle.ViewModel {
    private static int read = 0;
    private static int serializer = 1;
    public final access1000 IconCompatParcelizer;
    public final SharedResourcePool RemoteActionCompatParcelizer;

    public final SharedResourcePool IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        SharedResourcePool sharedResourcePool = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 123;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return sharedResourcePool;
    }

    public lambdaprocessDeeplink12(SharedResourcePool sharedResourcePool, access1000 access1000Var) {
        sharedResourcePool.getClass();
        access1000Var.getClass();
        this.RemoteActionCompatParcelizer = sharedResourcePool;
        this.IconCompatParcelizer = access1000Var;
    }

    public final void serializer(PushAnalyticsData pushAnalyticsData) {
        int i = 2 % 2;
        int i2 = read + 83;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            access1000 access1000Var = this.IconCompatParcelizer;
            access1000Var.IconCompatParcelizer.logEvent("push_notification_dialog_shown", access1000Var.IconCompatParcelizer(pushAnalyticsData));
        } else {
            access1000 access1000Var2 = this.IconCompatParcelizer;
            access1000Var2.IconCompatParcelizer.logEvent("push_notification_dialog_shown", access1000Var2.IconCompatParcelizer(pushAnalyticsData));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
