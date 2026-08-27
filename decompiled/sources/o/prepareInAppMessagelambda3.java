package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class prepareInAppMessagelambda3 extends prepareInAppMessagelambda0 {
    public boolean MediaBrowserCompatMediaItem;
    public String MediaSessionCompatQueueItem;

    @Override // o.prepareInAppMessagelambda0
    public final SwipeDismissTouchListenerVerticalDismissDirection write() {
        return new r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k((LinkedHashMap) this.read);
    }

    @Override // o.prepareInAppMessagelambda0
    public final void write(String str, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        str.getClass();
        swipeDismissTouchListenerVerticalDismissDirection.getClass();
        if (!this.MediaBrowserCompatMediaItem) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.read;
            String str2 = this.MediaSessionCompatQueueItem;
            if (str2 == null) {
                removeNodeAtDepth.serializer(RemoteMessageConst.Notification.TAG);
                throw null;
            }
            linkedHashMap.put(str2, swipeDismissTouchListenerVerticalDismissDirection);
            this.MediaBrowserCompatMediaItem = true;
            return;
        }
        if (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) {
            this.MediaSessionCompatQueueItem = ((r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) swipeDismissTouchListenerVerticalDismissDirection).IconCompatParcelizer();
            this.MediaBrowserCompatMediaItem = false;
        } else {
            if (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k) {
                throw coil3.util.IntPair.RemoteActionCompatParcelizer(r8lambdaiI68GpvQ5K1derb8jFmgrH4UbGc.IconCompatParcelizer);
            }
            if (swipeDismissTouchListenerVerticalDismissDirection instanceof requestDisallowParentIntercept) {
                throw coil3.util.IntPair.RemoteActionCompatParcelizer(performDismiss.write);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
    }

    public prepareInAppMessagelambda3(resetTransientState resettransientstate, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        super(resettransientstate, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i);
    }
}
