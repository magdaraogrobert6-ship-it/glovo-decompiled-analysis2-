package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Measurable extends androidx.compose.animation.core.TransitionState {
    public boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;

    public abstract boolean read();

    public Measurable(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).serializer++;
    }

    public final void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't initialize twice");
        } else {
            if (read()) {
                return;
            }
            ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = true;
        }
    }

    public final void ComponentActivity() {
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Not initialized");
    }
}
