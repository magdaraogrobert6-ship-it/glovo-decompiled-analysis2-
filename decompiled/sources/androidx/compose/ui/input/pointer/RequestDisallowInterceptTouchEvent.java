package androidx.compose.ui.input.pointer;

import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class RequestDisallowInterceptTouchEvent implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final int $stable = 8;
    private PointerInteropFilter pointerInteropFilter;

    public final PointerInteropFilter getPointerInteropFilter$ui() {
        return this.pointerInteropFilter;
    }

    public final void setPointerInteropFilter$ui(PointerInteropFilter pointerInteropFilter) {
        this.pointerInteropFilter = pointerInteropFilter;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return createFromParcel.INSTANCE;
    }

    public void invoke(boolean z) {
        PointerInteropFilter pointerInteropFilter = this.pointerInteropFilter;
        if (pointerInteropFilter != null) {
            pointerInteropFilter.setDisallowIntercept$ui(z);
        }
    }
}
