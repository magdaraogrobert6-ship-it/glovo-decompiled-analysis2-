package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    private PointerEvent lastEventDispatchedToInitialPass;
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui(false);
        this.lastEventDispatchedToInitialPass = null;
    }

    private final void stopDispatching(PointerEvent pointerEvent) {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            LayoutCoordinates layoutCoordinates$ui = getLayoutCoordinates$ui();
            if (layoutCoordinates$ui == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("layoutCoordinates not set");
                return;
            } else {
                long jMo2220localToRootMKHz9U = layoutCoordinates$ui.mo2220localToRootMKHz9U(Offset.Companion.m493getZeroF1C5BW0());
                final PointerInteropFilter pointerInteropFilter = this.this$0;
                PointerInteropUtils_androidKt.m2133toCancelMotionEventScoped4ec7I(pointerEvent, jMo2220localToRootMKHz9U, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$stopDispatching$1
                    public final void invoke(MotionEvent motionEvent) {
                        pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                    }

                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((MotionEvent) obj);
                        return createFromParcel.INSTANCE;
                    }
                });
            }
        }
        this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.this$0;
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(jUptimeMillis, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                public final void invoke(MotionEvent motionEvent) {
                    pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                }

                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MotionEvent) obj);
                    return createFromParcel.INSTANCE;
                }
            });
            reset();
        }
    }

    private final void dispatchToView(PointerEvent pointerEvent, boolean z) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        List<PointerInputChange> list = changes;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).isConsumed()) {
                stopDispatching(pointerEvent);
                return;
            }
        }
        LayoutCoordinates layoutCoordinates$ui = getLayoutCoordinates$ui();
        if (layoutCoordinates$ui == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("layoutCoordinates not set");
            return;
        }
        long jMo2220localToRootMKHz9U = layoutCoordinates$ui.mo2220localToRootMKHz9U(Offset.Companion.m493getZeroF1C5BW0());
        final PointerInteropFilter pointerInteropFilter = this.this$0;
        PointerInteropUtils_androidKt.m2134toMotionEventScoped4ec7I(pointerEvent, jMo2220localToRootMKHz9U, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    pointerInteropFilter.getOnTouchEvent().invoke(motionEvent);
                } else {
                    this.this$0.state = ((Boolean) pointerInteropFilter.getOnTouchEvent().invoke(motionEvent)).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((MotionEvent) obj);
                return createFromParcel.INSTANCE;
            }
        });
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    changes.get(i2).consume();
                }
            }
            InternalPointerEvent internalPointerEvent$ui = pointerEvent.getInternalPointerEvent$ui();
            if (internalPointerEvent$ui != null) {
                internalPointerEvent$ui.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept$ui());
            }
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo2096onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        List<PointerInputChange> list = changes;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i);
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (changes.get(i2).isConsumed()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (this.this$0.getDisallowIntercept$ui()) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                PointerInputChange pointerInputChange2 = changes.get(i3);
                if (!PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2) && !PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
            if (pointerEventPass == PointerEventPass.Initial && z3) {
                this.lastEventDispatchedToInitialPass = pointerEvent;
                dispatchToView(pointerEvent, !z || this.this$0.getDisallowIntercept$ui());
            }
            if (pointerEventPass == PointerEventPass.Main && z && pointerEvent == this.lastEventDispatchedToInitialPass && this.this$0.getDisallowIntercept$ui()) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    changes.get(i4).consume();
                }
            }
            if (pointerEventPass == PointerEventPass.Final && !z3 && pointerEvent != this.lastEventDispatchedToInitialPass) {
                dispatchToView(pointerEvent, true);
            }
        }
        if (pointerEventPass == PointerEventPass.Final) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    reset();
                    break;
                } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (pointerEvent == this.lastEventDispatchedToInitialPass && z) {
                int size6 = list.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (changes.get(i6).isConsumed()) {
                        if (this.this$0.getDisallowIntercept$ui()) {
                            break;
                        }
                        stopDispatching(pointerEvent);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    changes.get(i7).consume();
                }
            }
        }
    }
}
