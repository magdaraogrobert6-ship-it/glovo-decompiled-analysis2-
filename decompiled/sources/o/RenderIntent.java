package o;

import android.hardware.camera2.CameraDevice;
import com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class RenderIntent {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static InAppNotificationsFragment serializer() {
        int i = 2 % 2;
        InAppNotificationsFragment inAppNotificationsFragment = new InAppNotificationsFragment();
        int i2 = RemoteActionCompatParcelizer + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return inAppNotificationsFragment;
        }
        throw null;
    }

    public static CameraDevice.StateCallback RemoteActionCompatParcelizer(ArrayList arrayList) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (arrayList.isEmpty()) {
            return new getGravity();
        }
        if (arrayList.size() == 1) {
            return (CameraDevice.StateCallback) arrayList.get(0);
        }
        setDividerPadding setdividerpadding = new setDividerPadding(arrayList);
        int i4 = IconCompatParcelizer + 21;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return setdividerpadding;
        }
        throw null;
    }
}
