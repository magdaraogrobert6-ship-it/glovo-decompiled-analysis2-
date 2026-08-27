package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLogic extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.ui.graphics.TransformOrigin IconCompatParcelizer;
    public final /* synthetic */ TapGestureDetectorKt read;
    public final /* synthetic */ ScrollingLogicdoFlingAnimation2reverseScope1 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic(androidx.compose.ui.graphics.TransformOrigin transformOrigin, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt) {
        super(1);
        this.IconCompatParcelizer = transformOrigin;
        this.serializer = scrollingLogicdoFlingAnimation2reverseScope1;
        this.read = tapGestureDetectorKt;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.graphics.TransformOrigin transformOriginM1125boximpl;
        long j;
        int i = ScrollableNodedrag21.write[((accesssemanticsScrollByd4ec7I) obj).ordinal()];
        if (i != 1) {
            ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1 = this.serializer;
            TapGestureDetectorKt tapGestureDetectorKt = this.read;
            transformOriginM1125boximpl = null;
            if (i == 2) {
                waitForUpOrCancellation waitforuporcancellation = scrollingLogicdoFlingAnimation2reverseScope1.serializer.read;
                if (waitforuporcancellation != null) {
                    j = waitforuporcancellation.read;
                } else {
                    waitForUpOrCancellation waitforuporcancellation2 = tapGestureDetectorKt.serializer.read;
                    if (waitforuporcancellation2 != null) {
                        j = waitforuporcancellation2.read;
                    }
                }
                transformOriginM1125boximpl = androidx.compose.ui.graphics.TransformOrigin.m1125boximpl(j);
            } else {
                if (i != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                waitForUpOrCancellation waitforuporcancellation3 = tapGestureDetectorKt.serializer.read;
                if (waitforuporcancellation3 != null || (waitforuporcancellation3 = scrollingLogicdoFlingAnimation2reverseScope1.serializer.read) != null) {
                    transformOriginM1125boximpl = androidx.compose.ui.graphics.TransformOrigin.m1125boximpl(waitforuporcancellation3.read);
                }
            }
        } else {
            transformOriginM1125boximpl = this.IconCompatParcelizer;
        }
        return androidx.compose.ui.graphics.TransformOrigin.m1125boximpl(transformOriginM1125boximpl != null ? transformOriginM1125boximpl.m1137unboximpl() : androidx.compose.ui.graphics.TransformOrigin.Companion.m1138getCenterSzJe1aQ());
    }
}
