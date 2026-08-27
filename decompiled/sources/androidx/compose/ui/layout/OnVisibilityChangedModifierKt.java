package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class OnVisibilityChangedModifierKt {
    public static final Modifier onVisibilityChanged(Modifier modifier, long j, float f, LayoutBoundsHolder layoutBoundsHolder, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new OnVisibilityChangedElement(j, f, layoutBoundsHolder, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public static final DelegatableNode onVisibilityChangedNode(long j, float f, LayoutBoundsHolder layoutBoundsHolder, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return new OnVisibilityChangedNode(j, f, layoutBoundsHolder, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static /* synthetic */ DelegatableNode onVisibilityChangedNode$default(long j, float f, LayoutBoundsHolder layoutBoundsHolder, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            layoutBoundsHolder = null;
        }
        return onVisibilityChangedNode(j, f, layoutBoundsHolder, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static /* synthetic */ Modifier onVisibilityChanged$default(Modifier modifier, long j, float f, LayoutBoundsHolder layoutBoundsHolder, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            layoutBoundsHolder = null;
        }
        return onVisibilityChanged(modifier, j2, f2, layoutBoundsHolder, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
