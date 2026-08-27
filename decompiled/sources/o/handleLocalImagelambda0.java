package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class handleLocalImagelambda0 extends r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y {
    public final SwipeDismissTouchListenerVerticalDismissDirection MediaSessionCompatQueueItem;

    @Override // o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y
    public final SwipeDismissTouchListenerVerticalDismissDirection RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.createInAppMessageViewlambda1
    public final int read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handleLocalImagelambda0(resetTransientState resettransientstate, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection, String str) {
        super(resettransientstate, str);
        resettransientstate.getClass();
        swipeDismissTouchListenerVerticalDismissDirection.getClass();
        this.MediaSessionCompatQueueItem = swipeDismissTouchListenerVerticalDismissDirection;
        this.read.add("primitive");
    }

    @Override // o.r8lambdaquOZlpDNY0TUGg1V6w2FHn0_r6Y
    public final SwipeDismissTouchListenerVerticalDismissDirection RemoteActionCompatParcelizer(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.MediaSessionCompatQueueItem;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    public /* synthetic */ handleLocalImagelambda0(resetTransientState resettransientstate, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        this(resettransientstate, swipeDismissTouchListenerVerticalDismissDirection, null);
    }
}
