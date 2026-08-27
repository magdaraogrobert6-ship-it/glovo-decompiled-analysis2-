package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class VNode {
    public static final int $stable = 8;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM invalidateListener;

    public /* synthetic */ VNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void draw(DrawScope drawScope);

    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getInvalidateListener$ui() {
        return this.invalidateListener;
    }

    public void setInvalidateListener$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.invalidateListener = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    private VNode() {
    }

    public final void invalidate() {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM invalidateListener$ui = getInvalidateListener$ui();
        if (invalidateListener$ui != null) {
            invalidateListener$ui.invoke(this);
        }
    }
}
