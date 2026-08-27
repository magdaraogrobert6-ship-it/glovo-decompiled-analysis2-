package androidx.compose.ui.input.pointer;

import coil3.util.UtilsKt;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class PointerInteropFilter implements PointerInputModifier {
    public static final int $stable = 0;
    private boolean disallowIntercept;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onTouchEvent;
    private final PointerInputFilter pointerInputFilter = new PointerInteropFilter$pointerInputFilter$1(this);
    private RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;

    public enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    public static /* synthetic */ void getPointerInputFilter$annotations() {
    }

    public final boolean getDisallowIntercept$ui() {
        return this.disallowIntercept;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    public PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final RequestDisallowInterceptTouchEvent getRequestDisallowInterceptTouchEvent() {
        return this.requestDisallowInterceptTouchEvent;
    }

    public final void setDisallowIntercept$ui(boolean z) {
        this.disallowIntercept = z;
    }

    public final void setOnTouchEvent(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onTouchEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void setRequestDisallowInterceptTouchEvent(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2 = this.requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent2 != null) {
            requestDisallowInterceptTouchEvent2.setPointerInteropFilter$ui(null);
        }
        this.requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent != null) {
            requestDisallowInterceptTouchEvent.setPointerInteropFilter$ui(this);
        }
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnTouchEvent() {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onTouchEvent;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            return r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
        removeNodeAtDepth.serializer("onTouchEvent");
        throw null;
    }
}
