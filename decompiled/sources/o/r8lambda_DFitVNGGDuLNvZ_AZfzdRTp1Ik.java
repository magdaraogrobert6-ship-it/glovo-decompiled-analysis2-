package o;

import android.app.Application;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik {
    private static int read = 0;
    private static int serializer = 1;
    public final SharedFlowImpl IconCompatParcelizer;
    public final SharedFlowImpl RemoteActionCompatParcelizer;
    public final Application write;

    public r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik(Application application) {
        application.getClass();
        this.write = application;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_OLDEST, 1);
        this.IconCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
    }

    public final ActivityHandler write() {
        int i = 2 % 2;
        int i2 = serializer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            FocusListener.write(this.write, "android.permission.ACCESS_COARSE_LOCATION");
            obj.hashCode();
            throw null;
        }
        Application application = this.write;
        if (FocusListener.write(application, "android.permission.ACCESS_COARSE_LOCATION") == 0 || FocusListener.write(application, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return ActivityHandler.ALREADY_AVAILABLE_NOT_REQUESTED;
        }
        this.IconCompatParcelizer.write(createFromParcel.INSTANCE);
        ActivityHandler activityHandler = ActivityHandler.REQUESTED;
        int i3 = serializer + 111;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return activityHandler;
        }
        obj.hashCode();
        throw null;
    }
}
