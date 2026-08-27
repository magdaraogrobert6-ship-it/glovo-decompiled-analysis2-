package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class PointerInteropUtils_androidKt {
    /* JADX INFO: renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m2133toCancelMotionEventScoped4ec7I(PointerEvent pointerEvent, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        m2135toMotionEventScopeubNVwUQ(pointerEvent, j, r8lambdaunavo3sxub_pc9xroryotnrlvsm, true);
    }

    /* JADX INFO: renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m2134toMotionEventScoped4ec7I(PointerEvent pointerEvent, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        m2135toMotionEventScopeubNVwUQ(pointerEvent, j, r8lambdaunavo3sxub_pc9xroryotnrlvsm, false);
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 1) != 0) {
            j = SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static final void emptyCancelMotionEventScope(long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: toMotionEventScope-ubNVwUQ, reason: not valid java name */
    private static final void m2135toMotionEventScopeubNVwUQ(PointerEvent pointerEvent, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        MotionEvent motionEvent = pointerEvent.getMotionEvent();
        if (motionEvent == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEvent.setAction(action);
    }
}
