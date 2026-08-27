package o;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class MeasuringIntrinsicsDefaultIntrinsicMeasurable extends LayoutNodeSubcompositionsStatecreateMeasureResult1 {
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ int write = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasuringIntrinsicsDefaultIntrinsicMeasurable(NoWindowInsetsAnimation noWindowInsetsAnimation, layoutdefault layoutdefaultVar) {
        super(layoutdefaultVar);
        Objects.requireNonNull(noWindowInsetsAnimation);
        this.RatingCompat = noWindowInsetsAnimation;
    }

    @Override // o.LayoutNodeSubcompositionsStatecreateMeasureResult1
    public final void serializer() {
        int i = this.write;
        Object obj = this.RatingCompat;
        if (i == 0) {
            ((NoWindowInsetsAnimation) obj).MediaSessionCompatQueueItem();
            return;
        }
        toAndroidRect toandroidrect = (toAndroidRect) obj;
        triggerCallback triggercallback = (triggerCallback) toandroidrect.read;
        triggercallback.MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) triggercallback.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        toandroidrect.RemoteActionCompatParcelizer(SystemClock.elapsedRealtime(), false, false);
        getHasPremeasured gethaspremeasured = lookaheadScopeKtLookaheadScope221.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        LookaheadScopeKtLookaheadScope221.write(gethaspremeasured);
        lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        gethaspremeasured.read(SystemClock.elapsedRealtime());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasuringIntrinsicsDefaultIntrinsicMeasurable(toAndroidRect toandroidrect, layoutdefault layoutdefaultVar) {
        super(layoutdefaultVar);
        this.RatingCompat = toandroidrect;
    }
}
