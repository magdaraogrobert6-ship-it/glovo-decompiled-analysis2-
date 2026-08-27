package androidx.compose.ui.platform;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class IndirectPointerNavigationGestureDetector {
    public static final int $stable = 8;
    private final GestureDetector gestureDetector;
    private boolean ignoreCurrentGestureStream;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onMoveFocus;
    private int primaryDirectionalMotionAxis = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m1559getNonenZO2Niw();

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw, reason: not valid java name */
    public final int m2744getPrimaryDirectionalMotionAxisnZO2Niw() {
        return this.primaryDirectionalMotionAxis;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxis-WQKaTuc, reason: not valid java name */
    public final void m2745setPrimaryDirectionalMotionAxisWQKaTuc(int i) {
        this.primaryDirectionalMotionAxis = i;
    }

    public final void cancelCurrentEventStream() {
        this.primaryDirectionalMotionAxis = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m1559getNonenZO2Niw();
        this.ignoreCurrentGestureStream = true;
    }

    public IndirectPointerNavigationGestureDetector(Context context, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onMoveFocus = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.OnGestureListener() { // from class: androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.this$0.ignoreCurrentGestureStream) {
                    return true;
                }
                int iM2744getPrimaryDirectionalMotionAxisnZO2Niw = this.this$0.m2744getPrimaryDirectionalMotionAxisnZO2Niw();
                IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion;
                if (IndirectPointerEventPrimaryDirectionalMotionAxis.m1555equalsimpl0(iM2744getPrimaryDirectionalMotionAxisnZO2Niw, companion.m1560getXnZO2Niw())) {
                    if (Math.abs(f) > Math.abs(f2)) {
                        this.this$0.onMoveFocus.invoke(FocusDirection.m346boximpl(f > 0.0f ? FocusDirection.Companion.m357getNextdhqQ8s() : FocusDirection.Companion.m358getPreviousdhqQ8s()));
                    }
                } else if (IndirectPointerEventPrimaryDirectionalMotionAxis.m1555equalsimpl0(this.this$0.m2744getPrimaryDirectionalMotionAxisnZO2Niw(), companion.m1561getYnZO2Niw()) && Math.abs(f2) > Math.abs(f)) {
                    this.this$0.onMoveFocus.invoke(FocusDirection.m346boximpl(f2 > 0.0f ? FocusDirection.Companion.m357getNextdhqQ8s() : FocusDirection.Companion.m358getPreviousdhqQ8s()));
                }
                return true;
            }
        });
    }

    public final boolean onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, boolean z) {
        MotionEvent nativeEvent = AndroidIndirectPointerEvent_androidKt.getNativeEvent(indirectPointerEvent);
        int action = nativeEvent.getAction();
        if (action == 0) {
            this.primaryDirectionalMotionAxis = indirectPointerEvent.mo1548getPrimaryDirectionalMotionAxisnZO2Niw();
            this.ignoreCurrentGestureStream = false;
        } else if ((action == 1 || action == 2) && z) {
            cancelCurrentEventStream();
        }
        return this.gestureDetector.onTouchEvent(nativeEvent);
    }
}
