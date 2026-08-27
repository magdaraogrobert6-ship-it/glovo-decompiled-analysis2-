package o;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class primaryAxisPosition_bfSUIo extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ AnimatedContentTransitionScopeImpl$SizeModifierNode RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public primaryAxisPosition_bfSUIo(AnimatedContentTransitionScopeImpl$SizeModifierNode animatedContentTransitionScopeImpl$SizeModifierNode, long j) {
        super(1);
        this.RemoteActionCompatParcelizer = animatedContentTransitionScopeImpl$SizeModifierNode;
        this.IconCompatParcelizer = j;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        long jM3848unboximpl;
        AnimatedContentTransitionScopeImpl$SizeModifierNode animatedContentTransitionScopeImpl$SizeModifierNode = this.RemoteActionCompatParcelizer;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, animatedContentTransitionScopeImpl$SizeModifierNode.read.serializer()}, getCieXyz.write())).booleanValue()) {
            jM3848unboximpl = androidx.compose.ui.unit.IntSize.m3842equalsimpl0(animatedContentTransitionScopeImpl$SizeModifierNode.RemoteActionCompatParcelizer, androidx.compose.animation.AnimatedContentKt.IconCompatParcelizer) ? this.IconCompatParcelizer : animatedContentTransitionScopeImpl$SizeModifierNode.RemoteActionCompatParcelizer;
        } else {
            onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) animatedContentTransitionScopeImpl$SizeModifierNode.read.serializer.MediaBrowserCompatMediaItem(obj);
            jM3848unboximpl = onviewattachedtowindow != null ? ((androidx.compose.ui.unit.IntSize) onviewattachedtowindow.getValue()).m3848unboximpl() : androidx.compose.ui.unit.IntSize.Companion.m3849getZeroYbymL2g();
        }
        return androidx.compose.ui.unit.IntSize.m3836boximpl(jM3848unboximpl);
    }
}
