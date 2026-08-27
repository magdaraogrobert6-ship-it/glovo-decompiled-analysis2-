package o;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class IInAppMessageImmersiveView implements random_delegatelambda0 {
    public final /* synthetic */ Application IconCompatParcelizer;

    public IInAppMessageImmersiveView(Application application) {
        this.IconCompatParcelizer = application;
    }

    @Override // o.random_delegatelambda0
    public final void serializer(View view, boolean z) {
        view.getClass();
        if (z) {
            return;
        }
        view.getClass();
        isAdapterPositionOnScreen isadapterpositiononscreen = setCornersRadiusPx.RemoteActionCompatParcelizer;
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        if (mainLooper.getThread() == Thread.currentThread()) {
            setToHalfParentHeight.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        } else {
            ((Handler) setCornersRadiusPx.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).post(new r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74(9, this));
        }
    }
}
