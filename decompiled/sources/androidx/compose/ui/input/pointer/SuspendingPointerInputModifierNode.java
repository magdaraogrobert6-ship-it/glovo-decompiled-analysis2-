package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.PointerInputModifierNode;
import o.getCardAtIndex;
import o.onItemDismisslambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public interface SuspendingPointerInputModifierNode extends PointerInputModifierNode {
    @onItemDismisslambda0
    static /* synthetic */ void getPointerInputHandler$annotations() {
    }

    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getPointerInputHandler();

    void resetPointerInputHandler();

    void setPointerInputHandler(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);

    default PointerInputEventHandler getPointerInputEventHandler() {
        throw new getCardAtIndex("An operation is not implemented: pointerInputEventHandler must be implemented (get()).");
    }

    default void setPointerInputEventHandler(PointerInputEventHandler pointerInputEventHandler) {
        throw new getCardAtIndex("An operation is not implemented: ".concat("pointerInputEventHandler must be implemented (set(" + pointerInputEventHandler + "))."));
    }
}
