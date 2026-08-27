package o;

import android.app.Activity;
import android.content.Context;
import androidx.cardview.widget.CardView$1;
import com.google.android.gms.location.DeviceOrientationListener;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.FusedOrientationProviderClient;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getMoveEndEK5gGoQ extends accessgetNumPad7cp implements FusedOrientationProviderClient {
    public getMoveEndEK5gGoQ(Activity activity) {
        super(activity, activity, getMediaStopEK5gGoQ.RemoteActionCompatParcelizer, accessgetNumPad2cp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, accessgetNumPad8cp.IconCompatParcelizer);
    }

    @Override // com.google.android.gms.location.FusedOrientationProviderClient
    public final Task removeOrientationUpdates(DeviceOrientationListener deviceOrientationListener) {
        return write((accessgetNumPadEntercp) MathKt.RemoteActionCompatParcelizer(new Object[]{deviceOrientationListener, "DeviceOrientationListener"}, extractAuthorizationHeader.write(), 930939712, -930939711, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write()), 2440).continueWith(accessgetSubCompositionViewjd.MediaSessionCompatQueueItem, toContentCaptureSession.read);
    }

    @Override // com.google.android.gms.location.FusedOrientationProviderClient
    public final Task requestOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, Executor executor, DeviceOrientationListener deviceOrientationListener) {
        scale0AR0LA0default scale0ar0la0defaultSerializer = MathKt.serializer(deviceOrientationListener, executor, "DeviceOrientationListener");
        getMicrophoneMuteEK5gGoQ getmicrophonemuteek5ggoq = new getMicrophoneMuteEK5gGoQ(scale0ar0la0defaultSerializer, deviceOrientationRequest, 1);
        getMediaPreviousEK5gGoQ getmediapreviousek5ggoq = new getMediaPreviousEK5gGoQ(scale0ar0la0defaultSerializer, 2);
        accessgetNumPadEqualscp accessgetnumpadequalscpIconCompatParcelizer = CardView$1.IconCompatParcelizer();
        accessgetnumpadequalscpIconCompatParcelizer.write = getmicrophonemuteek5ggoq;
        accessgetnumpadequalscpIconCompatParcelizer.RemoteActionCompatParcelizer = getmediapreviousek5ggoq;
        accessgetnumpadequalscpIconCompatParcelizer.read = scale0ar0la0defaultSerializer;
        accessgetnumpadequalscpIconCompatParcelizer.IconCompatParcelizer = 2434;
        return RemoteActionCompatParcelizer(accessgetnumpadequalscpIconCompatParcelizer.serializer());
    }

    public getMoveEndEK5gGoQ(Context context) {
        super(context, null, getMediaStopEK5gGoQ.RemoteActionCompatParcelizer, accessgetNumPad2cp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, accessgetNumPad8cp.IconCompatParcelizer);
    }
}
