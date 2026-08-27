package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLogicdoFlingAnimation2 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.animation.EnterExitTransitionModifierNode serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrollingLogicdoFlingAnimation2(androidx.compose.animation.EnterExitTransitionModifierNode enterExitTransitionModifierNode, long j, int i) {
        super(1);
        this.IconCompatParcelizer = i;
        this.serializer = enterExitTransitionModifierNode;
        this.RemoteActionCompatParcelizer = j;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i;
        long jM3812getZeronOccac;
        int i2 = this.IconCompatParcelizer;
        long jM3848unboximpl = this.RemoteActionCompatParcelizer;
        androidx.compose.animation.EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.serializer;
        if (i2 == 0) {
            int i3 = doFlingAnimationQWom1Mo.serializer[((accesssemanticsScrollByd4ec7I) obj).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    tryAwaitRelease tryawaitrelease = enterExitTransitionModifierNode.write.serializer.IconCompatParcelizer;
                    if (tryawaitrelease != null) {
                        jM3848unboximpl = ((androidx.compose.ui.unit.IntSize) tryawaitrelease.serializer.invoke(androidx.compose.ui.unit.IntSize.m3836boximpl(jM3848unboximpl))).m3848unboximpl();
                    }
                } else {
                    if (i3 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    tryAwaitRelease tryawaitrelease2 = enterExitTransitionModifierNode.IconCompatParcelizer.serializer.IconCompatParcelizer;
                    if (tryawaitrelease2 != null) {
                        jM3848unboximpl = ((androidx.compose.ui.unit.IntSize) tryawaitrelease2.serializer.invoke(androidx.compose.ui.unit.IntSize.m3836boximpl(jM3848unboximpl))).m3848unboximpl();
                    }
                }
            }
            return androidx.compose.ui.unit.IntSize.m3836boximpl(jM3848unboximpl);
        }
        if (i2 != 1) {
            accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i = (accesssemanticsScrollByd4ec7I) obj;
            TouchSlopDetector touchSlopDetector = enterExitTransitionModifierNode.write.serializer.MediaSessionCompatQueueItem;
            long jM3810unboximpl = touchSlopDetector != null ? ((androidx.compose.ui.unit.IntOffset) touchSlopDetector.read.invoke(androidx.compose.ui.unit.IntSize.m3836boximpl(jM3848unboximpl))).m3810unboximpl() : androidx.compose.ui.unit.IntOffset.Companion.m3812getZeronOccac();
            TouchSlopDetector touchSlopDetector2 = enterExitTransitionModifierNode.IconCompatParcelizer.serializer.MediaSessionCompatQueueItem;
            long jM3810unboximpl2 = touchSlopDetector2 != null ? ((androidx.compose.ui.unit.IntOffset) touchSlopDetector2.read.invoke(androidx.compose.ui.unit.IntSize.m3836boximpl(jM3848unboximpl))).m3810unboximpl() : androidx.compose.ui.unit.IntOffset.Companion.m3812getZeronOccac();
            int i4 = doFlingAnimationQWom1Mo.serializer[accesssemanticsscrollbyd4ec7i.ordinal()];
            if (i4 == 1) {
                jM3810unboximpl = androidx.compose.ui.unit.IntOffset.Companion.m3812getZeronOccac();
            } else if (i4 != 2) {
                if (i4 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                jM3810unboximpl = jM3810unboximpl2;
            }
            return androidx.compose.ui.unit.IntOffset.m3792boximpl(jM3810unboximpl);
        }
        accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i2 = (accesssemanticsScrollByd4ec7I) obj;
        if (enterExitTransitionModifierNode.serializer == null || enterExitTransitionModifierNode.read() == null) {
            jM3812getZeronOccac = androidx.compose.ui.unit.IntOffset.Companion.m3812getZeronOccac();
        } else {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{enterExitTransitionModifierNode.serializer, enterExitTransitionModifierNode.read()}, getCieXyz.write())).booleanValue() || (i = doFlingAnimationQWom1Mo.serializer[accesssemanticsscrollbyd4ec7i2.ordinal()]) == 1 || i == 2) {
                jM3812getZeronOccac = androidx.compose.ui.unit.IntOffset.Companion.m3812getZeronOccac();
            } else {
                if (i != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                tryAwaitRelease tryawaitrelease3 = enterExitTransitionModifierNode.IconCompatParcelizer.serializer.IconCompatParcelizer;
                if (tryawaitrelease3 != null) {
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = tryawaitrelease3.serializer;
                    long j = this.RemoteActionCompatParcelizer;
                    long jM3848unboximpl2 = ((androidx.compose.ui.unit.IntSize) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(androidx.compose.ui.unit.IntSize.m3836boximpl(j))).m3848unboximpl();
                    androidx.compose.ui.Alignment alignment = enterExitTransitionModifierNode.read();
                    alignment.getClass();
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
                    long jMo139alignKFBX0sM = alignment.mo139alignKFBX0sM(j, jM3848unboximpl2, layoutDirection);
                    androidx.compose.ui.Alignment alignment2 = enterExitTransitionModifierNode.serializer;
                    alignment2.getClass();
                    jM3812getZeronOccac = androidx.compose.ui.unit.IntOffset.m3804minusqkQi6aY(jMo139alignKFBX0sM, alignment2.mo139alignKFBX0sM(j, jM3848unboximpl2, layoutDirection));
                } else {
                    jM3812getZeronOccac = androidx.compose.ui.unit.IntOffset.Companion.m3812getZeronOccac();
                }
            }
        }
        return androidx.compose.ui.unit.IntOffset.m3792boximpl(jM3812getZeronOccac);
    }
}
