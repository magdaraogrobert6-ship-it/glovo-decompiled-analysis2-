package o;

import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToBannersDismissedEventandroid_sdk_base_release {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final QualtricsManagerImpl IconCompatParcelizer;
    public final decode read;

    public subscribeToBannersDismissedEventandroid_sdk_base_release(decode decodeVar, QualtricsManagerImpl qualtricsManagerImpl, int i) {
        decodeVar.getClass();
        qualtricsManagerImpl.getClass();
        if (i == 1) {
            this.read = decodeVar;
            this.IconCompatParcelizer = qualtricsManagerImpl;
        } else if (i != 2) {
            this.read = decodeVar;
            this.IconCompatParcelizer = qualtricsManagerImpl;
        } else {
            this.read = decodeVar;
            this.IconCompatParcelizer = qualtricsManagerImpl;
        }
    }

    public void IconCompatParcelizer(long j, boolean z) {
        String str;
        int i = 2 % 2;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("currentDeliveryId", String.valueOf(j));
        if (!z) {
            str = "Vendor";
        } else {
            int i2 = RemoteActionCompatParcelizer + 123;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            str = "Customer";
        }
        this.read.logEvent("call_click", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, new onViewAttachedToWindowlambda0("callType", str), new onViewAttachedToWindowlambda0("screenName", "History")));
        int i3 = RemoteActionCompatParcelizer + 71;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
