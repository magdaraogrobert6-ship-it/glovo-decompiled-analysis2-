package o;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class onLayoutChangelambda1 extends CoroutineDispatcher {
    public static final onLayoutChangelambda1 write = new onLayoutChangelambda1();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        handleOnBackPressedlambda0 handleonbackpressedlambda0 = (handleOnBackPressedlambda0) textAnnouncementContentCardView.get(handleOnBackPressedlambda0.read);
        if (handleonbackpressedlambda0 != null) {
            handleonbackpressedlambda0.RemoteActionCompatParcelizer = true;
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
}
