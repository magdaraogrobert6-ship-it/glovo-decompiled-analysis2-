package o;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes.dex */
public final class accessdispatchMouseWheelScrollwaitNextScrollDelta extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ AnimatedContentTransitionScopeImpl$SizeModifierNode RemoteActionCompatParcelizer;
    public final /* synthetic */ long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessdispatchMouseWheelScrollwaitNextScrollDelta(AnimatedContentTransitionScopeImpl$SizeModifierNode animatedContentTransitionScopeImpl$SizeModifierNode, long j) {
        super(1);
        this.RemoteActionCompatParcelizer = animatedContentTransitionScopeImpl$SizeModifierNode;
        this.write = j;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        long jM3848unboximpl;
        Arrangement arrangement;
        paddingqDBjuR0default paddingqdbjur0default = (paddingqDBjuR0default) obj;
        Object objSerializer = paddingqdbjur0default.serializer();
        AnimatedContentTransitionScopeImpl$SizeModifierNode animatedContentTransitionScopeImpl$SizeModifierNode = this.RemoteActionCompatParcelizer;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objSerializer, animatedContentTransitionScopeImpl$SizeModifierNode.read.serializer()}, getCieXyz.write())).booleanValue()) {
            jM3848unboximpl = androidx.compose.ui.unit.IntSize.m3842equalsimpl0(animatedContentTransitionScopeImpl$SizeModifierNode.RemoteActionCompatParcelizer, androidx.compose.animation.AnimatedContentKt.IconCompatParcelizer) ? this.write : animatedContentTransitionScopeImpl$SizeModifierNode.RemoteActionCompatParcelizer;
        } else {
            onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) animatedContentTransitionScopeImpl$SizeModifierNode.read.serializer.MediaBrowserCompatMediaItem(paddingqdbjur0default.serializer());
            jM3848unboximpl = onviewattachedtowindow != null ? ((androidx.compose.ui.unit.IntSize) onviewattachedtowindow.getValue()).m3848unboximpl() : androidx.compose.ui.unit.IntSize.Companion.m3849getZeroYbymL2g();
        }
        onViewAttachedToWindow onviewattachedtowindow2 = (onViewAttachedToWindow) animatedContentTransitionScopeImpl$SizeModifierNode.read.serializer.MediaBrowserCompatMediaItem(paddingqdbjur0default.read());
        long jM3848unboximpl2 = onviewattachedtowindow2 != null ? ((androidx.compose.ui.unit.IntSize) onviewattachedtowindow2.getValue()).m3848unboximpl() : androidx.compose.ui.unit.IntSize.Companion.m3849getZeroYbymL2g();
        TapGestureDetectorKtdetectTapAndPress21 tapGestureDetectorKtdetectTapAndPress21 = (TapGestureDetectorKtdetectTapAndPress21) animatedContentTransitionScopeImpl$SizeModifierNode.IconCompatParcelizer.getValue();
        return (tapGestureDetectorKtdetectTapAndPress21 == null || (arrangement = (Arrangement) tapGestureDetectorKtdetectTapAndPress21.read.invoke(androidx.compose.ui.unit.IntSize.m3836boximpl(jM3848unboximpl), androidx.compose.ui.unit.IntSize.m3836boximpl(jM3848unboximpl2))) == null) ? DelayKt.IconCompatParcelizer(0.0f, 400.0f, 5, (Object) null) : arrangement;
    }
}
