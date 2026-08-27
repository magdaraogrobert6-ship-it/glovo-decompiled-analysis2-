package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LayoutNodeSubcompositionsStatedeactivateOutOfFrame1 extends getSizeYEO4UFw {
    public boolean RemoteActionCompatParcelizer;

    public abstract boolean MediaMetadataCompat();

    public LayoutNodeSubcompositionsStatedeactivateOutOfFrame1(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).serializer++;
    }

    public final void read() {
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Can't initialize twice");
        } else {
            if (MediaMetadataCompat()) {
                return;
            }
            ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaBrowserCompatMediaItem.incrementAndGet();
            this.RemoteActionCompatParcelizer = true;
        }
    }

    public final void serializer() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Not initialized");
    }
}
