package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableNode extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ ScrollingLogicdoFlingAnimation2reverseScope1 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ TapGestureDetectorKt serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrollableNode(ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, int i) {
        super(1);
        this.read = i;
        this.RemoteActionCompatParcelizer = scrollingLogicdoFlingAnimation2reverseScope1;
        this.serializer = tapGestureDetectorKt;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Arrangement arrangement;
        Arrangement arrangement2;
        float f;
        int i = this.read;
        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1 = this.RemoteActionCompatParcelizer;
        TapGestureDetectorKt tapGestureDetectorKt = this.serializer;
        if (i == 0) {
            paddingqDBjuR0default paddingqdbjur0default = (paddingqDBjuR0default) obj;
            accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i = accesssemanticsScrollByd4ec7I.PreEnter;
            accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i2 = accesssemanticsScrollByd4ec7I.Visible;
            if (paddingqdbjur0default.RemoteActionCompatParcelizer(accesssemanticsscrollbyd4ec7i, accesssemanticsscrollbyd4ec7i2)) {
                consumeUntilUp consumeuntilup = scrollingLogicdoFlingAnimation2reverseScope1.serializer.RemoteActionCompatParcelizer;
                return (consumeuntilup == null || (arrangement2 = consumeuntilup.IconCompatParcelizer) == null) ? onKeyEventZmokQxo.IconCompatParcelizer : arrangement2;
            }
            if (!paddingqdbjur0default.RemoteActionCompatParcelizer(accesssemanticsscrollbyd4ec7i2, accesssemanticsScrollByd4ec7I.PostExit)) {
                return onKeyEventZmokQxo.IconCompatParcelizer;
            }
            consumeUntilUp consumeuntilup2 = tapGestureDetectorKt.serializer.RemoteActionCompatParcelizer;
            return (consumeuntilup2 == null || (arrangement = consumeuntilup2.IconCompatParcelizer) == null) ? onKeyEventZmokQxo.IconCompatParcelizer : arrangement;
        }
        int i2 = ScrollableKtsemanticsScrollBy2.read[((accesssemanticsScrollByd4ec7I) obj).ordinal()];
        if (i2 == 1) {
            f = 1.0f;
        } else if (i2 == 2) {
            consumeUntilUp consumeuntilup3 = scrollingLogicdoFlingAnimation2reverseScope1.serializer.RemoteActionCompatParcelizer;
            if (consumeuntilup3 != null) {
                f = consumeuntilup3.serializer;
            } else {
                f = 1.0f;
            }
        } else {
            if (i2 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            consumeUntilUp consumeuntilup4 = tapGestureDetectorKt.serializer.RemoteActionCompatParcelizer;
            if (consumeuntilup4 != null) {
                f = consumeuntilup4.serializer;
            } else {
                f = 1.0f;
            }
        }
        return Float.valueOf(f);
    }
}
