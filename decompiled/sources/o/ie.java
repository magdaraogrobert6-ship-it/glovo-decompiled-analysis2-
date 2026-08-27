package o;

import com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ie implements CameraAnimationsLifecycleListener {
    private static int read = 1;
    private static int serializer;
    public final SharedFlowImpl RemoteActionCompatParcelizer;
    public final SharedFlowImpl write;

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener
    public final void onAnimatorCancelling(CameraAnimatorType cameraAnimatorType, CameraAnimator cameraAnimator) {
        int i = 2 % 2;
        int i2 = read + 99;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            cameraAnimatorType.getClass();
            return;
        }
        cameraAnimatorType.getClass();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener
    public final void onAnimatorEnding(CameraAnimatorType cameraAnimatorType, CameraAnimator cameraAnimator) {
        int i = 2 % 2;
        int i2 = read + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        cameraAnimatorType.getClass();
        int i4 = read + 95;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener
    public final void onAnimatorInterrupting(CameraAnimatorType cameraAnimatorType, CameraAnimator cameraAnimator, CameraAnimator cameraAnimator2) {
        int i = 2 % 2;
        int i2 = read + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            cameraAnimatorType.getClass();
        } else {
            cameraAnimatorType.getClass();
            int i3 = 65 / 0;
        }
    }

    public ie() {
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_OLDEST, 1);
        this.RemoteActionCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        this.write = sharedFlowImplRemoteActionCompatParcelizer;
    }

    @Override // com.mapbox.maps.plugin.animation.CameraAnimationsLifecycleListener
    public final void onAnimatorStarting(CameraAnimatorType cameraAnimatorType, CameraAnimator cameraAnimator, String str) {
        int i = 2 % 2;
        int i2 = serializer + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            cameraAnimatorType.getClass();
            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "NAVIGATION_CAMERA_OWNER"}, getCieXyz.write())).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        cameraAnimatorType.getClass();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "NAVIGATION_CAMERA_OWNER"}, getCieXyz.write())).booleanValue()) {
            this.RemoteActionCompatParcelizer.write(createFromParcel.INSTANCE);
        }
        int i3 = read + 99;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
