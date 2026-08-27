package androidx.compose.ui.viewinterop;

import androidx.compose.ui.focus.FocusState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FocusTargetInteropNode$focusTargetNode$1 extends FunctionReferenceImpl implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((FocusState) obj, (FocusState) obj2);
        return createFromParcel.INSTANCE;
    }

    public final void invoke(FocusState focusState, FocusState focusState2) {
        ((FocusTargetInteropNode) this.MediaMetadataCompat).onFocusStateChange(focusState, focusState2);
    }

    public FocusTargetInteropNode$focusTargetNode$1(Object obj) {
        super(2, 0, FocusTargetInteropNode.class, obj, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V");
    }
}
